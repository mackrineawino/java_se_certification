package com.maks.strings;

public class App {
    public static void main(String[] args) {
        Boolean [] bool =new Boolean[2];

        boolean a =new Boolean(Boolean.parseBoolean("1"));
        boolean b =new Boolean(null);

        System.out.println(a + " " + b);
    }
}
