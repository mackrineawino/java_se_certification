package com.maks.strings;

public class HelloTrim {
    public static void main(String[] args) {
        String myStr="Hello World";
        myStr.trim();
        int il=myStr.indexOf(" ");
        System.out.println(il);
    }
}
