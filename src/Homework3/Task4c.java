package Homework3;

public class Task4c {
    public static void massiveNo7() {
        int[] a = {1, 749, 3, 4, 5, 6, 7, 8, 888, 777, 21, 5, 44, 14};
        int n = 0;
        for (int i = 0; i < a.length; ++i) {
            if ((a[i] % 7) != 0)
                a[n++] = a[i];
        }
        for (int i = 0; i < n; ++i)
            System.out.printf("%d ", a[i]);
    }


    public static void main(String[] args) {
        massiveNo7();
    }
}

