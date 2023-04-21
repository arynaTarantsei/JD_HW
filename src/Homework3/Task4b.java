package Homework3;

public class Task4b {
    public static void massiveEl() {
        int[] a = {1, 3, 4, 34, 5, 6, 7, 8, 888}; //метод должен ПРИНИМАТЬ массив целочисленных элементов!
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        massiveEl();
    }
}

