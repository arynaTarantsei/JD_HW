package com.Homework7;

interface Printable {
    default void print() {
        System.out.println("Документ отправлен в печать.");
    }
}
