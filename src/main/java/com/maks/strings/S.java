package com.maks.strings;

public class S {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        System.out.println("sb" + sb.toString());
        String s = "";
        System.out.println("s" + s);

        if (sb.equals(s)) {
            System.out.println("1");

        } else if (sb.toString().equals(s.toString())) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2 = str1;
        System.out.println(str1 == str2);
    }
}
