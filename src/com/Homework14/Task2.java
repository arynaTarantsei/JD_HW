package com.Homework14;
import java.io.*;
public class Task2 {
    public static void main(String[] args) {
        createFiles();
        sortFiles();
    }

    public static void createFiles() {
        try {
            FileOutputStream fos1 = new FileOutputStream("src/com/Homework14/in1.txt");
            FileOutputStream fos2 = new FileOutputStream("src/com/Homework14/in2.txt");
            PrintWriter pw1 = new PrintWriter(fos1);
            PrintWriter pw2 = new PrintWriter(fos2);
            for (int i = 1; i <= 1000; i++) {
                pw1.println((int) (Math.random() * 100000 + 1));
                pw2.println((int) (Math.random() * 100000 + 1));
            }
            pw1.close();
            pw2.close();
            fos1.close();
            fos2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sortFiles() {
        try {
            FileInputStream fis1 = new FileInputStream("src/com/Homework14/in1.txt");
            FileInputStream fis2 = new FileInputStream("src/com/Homework14/in2.txt");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(fis1));
            BufferedReader br2 = new BufferedReader(new InputStreamReader(fis2));
            int[] nums = new int[2000];
            String str;
            int k = 0;
            while ((str = br1.readLine()) != null) {
                nums[k++] = Integer.parseInt(str);
            }
            while ((str = br2.readLine()) != null) {
                nums[k++] = Integer.parseInt(str);
            }
            br1.close();
            br2.close();
            fis1.close();
            fis2.close();
            for (int i = 0; i < 1999; i++) {
                for (int j = i + 1; j < 2000; j++) {
                    if (nums[i] > nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            FileOutputStream fos = new FileOutputStream("src/com/Homework14/out.txt");
            PrintWriter pw = new PrintWriter(fos);
            for (int num : nums) {
                pw.println(num);
            }
            pw.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
