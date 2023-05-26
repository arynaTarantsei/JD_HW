package com.Homework12;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> b = new TreeSet<>(Arrays.asList(3, 4, 5, 6, 7));

        Set<Integer> cross = getCross(a, b);
        System.out.println("Пересечение множеств a и b: " + cross);
        Set<Integer> union = getUnion(a, b);
        System.out.println("Объединение множеств a и b: " + union);
    }

    public static Set<Integer> getCross(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
