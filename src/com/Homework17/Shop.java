package com.Homework17;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;
import java.util.concurrent.*;

class Shop {
    private Map<String, Double> products;
    private BlockingQueue<Customer> customerQueue;
    private ExecutorService executorService;
    private List<Future<?>> futures;

    public Shop() {
        products = new HashMap<>();
        customerQueue = new LinkedBlockingQueue<>();
        executorService = Executors.newFixedThreadPool(2);
        futures = new ArrayList<>();
    }

    public void addProduct(String name, double price) {
        products.put(name, price);
    }

    public void enqueueCustomer(Customer customer) {
        customerQueue.offer(customer);
    }

    public void open() {
        for (int i = 1; i <= 2; i++) {
            futures.add(executorService.submit(new Cashier(i)));
        }
    }

    public void close() throws InterruptedException {
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }

    class Customer {
        private String name;
        private Map<String, Double> shoppingList;
        private StringBuilder receipt;

        public Customer(String name) {
            this.name = name;
            shoppingList = new HashMap<>();
            receipt = new StringBuilder();
            int numItems = ThreadLocalRandom.current().nextInt(3, 7);
            List<String> productList = new ArrayList<>(products.keySet());
            Collections.shuffle(productList);
            for (int i = 0; i < numItems; i++) {
                String product = productList.get(i);
                double price = products.get(product);
                shoppingList.put(product, price);
            }
        }

        public String getName() {
            return name;
        }

        public Map<String, Double> getShoppingList() {
            return shoppingList;
        }

        public void addToReceipt(String item, double price) {
            receipt.append("- ").append(item).append(": ").append(price).append("\n");
        }

        public void addToReceipt(String line) {
            receipt.append(line).append("\n");
        }

        public void printReceipt() {
            //доступ в консоль неплохо бы синхронизировать. потоки могут прерывать чеки друг друга. можно использовать Lock
            System.out.println("------------------------------------");
            System.out.println("Продавец " + Thread.currentThread().getName() + " обслуживает покупателя " + name + ":");
            System.out.println(receipt.toString());
            System.out.println("------------------------------------");
        }
    }

    class Cashier implements Runnable {
        private int number;

        public Cashier(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            while (true) {
                Customer customer;
                try {
                    customer = customerQueue.take();
                } catch (InterruptedException e) {
                    return;
                }
                if (customer == null) {
                    break;
                }
                serveCustomer(customer);
            }
        }

        private void serveCustomer(Customer customer) {
            Map<String, Double> shoppingList = customer.getShoppingList();
            double totalAmount = 0;

            for (Map.Entry<String, Double> entry : shoppingList.entrySet()) {
                String product = entry.getKey();
                double price = entry.getValue();
                customer.addToReceipt(product, price);
                totalAmount += price;
            }
            customer.addToReceipt("Итоговая сумма " + customer.name+ ": " + totalAmount);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            customer.printReceipt();
        }
    }
}