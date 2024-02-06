package com.maks.strings;

public class Available {
    public static void main(String[] args) {
        Available av=new Available();
        System.out.println(isAvailable + " ");
        isAvailable=av.doStuff();
        System.out.println(isAvailable);
    }
    public static boolean doStuff(){
        return !isAvailable;
    }
    static boolean isAvailable=false;
}
