package com.maks.strings;

public class Z {
    public static void main(String[] args) {
        int x = 10;
        int y = ++x;
        int z = 0;
        if (y >= 10 | y <= ++x) {
            z = x;
        } else {
            z = x++;

        }
        System.out.println(z);
    }
}