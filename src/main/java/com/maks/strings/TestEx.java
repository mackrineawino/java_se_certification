package com.maks.strings;

import java.io.IOException;

public class TestEx {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.println("A");
        }
    }

    public static void method1() {
        try {
            throw 3 > 10 ? new MyException() : new IOException();
        } catch (IOException ie) {
            System.out.println("I");
        } catch (Exception e) {
            System.out.println("B");
        }

    }
}
