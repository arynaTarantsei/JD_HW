package com.Homework3;

import static com.Homework3.Task4a_b.readArray;

public class Task5_6 {


    /**
     * <h1> Найти минимальное и максимальное значение</h1>
     * Данная программа реализует приложение, которое
     * находит минимальное и максимальное значение в введённом массиве и выводит
     * результат на экран.
     * <br>
     * @author  Tarantsei
     */
    public static void main(String[] args) {

            int[] ints = readArray();
            findMax(ints);
            findMin(ints);
        }

    public static void findMax(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("Максимальное значение: " + max);
        }

        public static void findMin(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println("Минимальное значение: " + min);
        }
    }

