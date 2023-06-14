package com.Homework16;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

class Shop {
    private Map<String, Double> products;
    private Queue<Customer> customerQueue;
    private Cashier cashier1;
    private Cashier cashier2;

    public Shop() {
        products = new HashMap<>();
        customerQueue = new LinkedList<>();
        cashier1 = new Cashier(1);
        cashier2 = new Cashier(2);
    }

    public void addProduct(String name, double price) {
        products.put(name, price);
    }

    public synchronized void enqueueCustomer(Customer customer) {
        customerQueue.add(customer);
        notifyAll();
    }

    public synchronized Customer dequeueCustomer() throws InterruptedException {
        while (customerQueue.isEmpty()) {
            wait();
        }
        return customerQueue.poll();
    }

    public void open() {
        cashier1.start();
        cashier2.start();
    }

    public void close() throws InterruptedException {
        cashier1.join();
        cashier2.join();
    }

    class Customer {
        private String name;
        private Map<String, Double> shoppingList;
        private StringBuilder receipt;

        public Customer(String name) {
            this.name = name;
            shoppingList = new HashMap<>();
            receipt = new StringBuilder();
            int numItems = (int) (Math.random() * 4) + 3;
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
            System.out.println("------------------------------------");
            System.out.println("Продавец " + Thread.currentThread().getName() + " обслуживает покупателя " + name + ":");
            System.out.println(receipt.toString());
            System.out.println("------------------------------------");
        }
    }

    class Cashier extends Thread {

        public Cashier(int number) {
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Customer customer = dequeueCustomer();
                    if (customer == null) {
                        break;
                    }
                    serveCustomer(customer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
            customer.addToReceipt("Итоговая сумма: " + totalAmount);

            try {
                Thread.sleep(100);  // Simulate serving time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            customer.printReceipt();
        }
    }
}