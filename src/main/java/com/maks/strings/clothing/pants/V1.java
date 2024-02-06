package com.maks.strings.clothing.pants;

public class V1 {
    public static void main(String[] args) {
        int var1=-5;
        int var2=var1--;
        System.out.println(var2);
        int var3=0;

        if (var2<0) {
            System.out.println(var2);
            var3=var2++;
        }else{
            var3=--var2;
        }
        System.out.println(var3);
    }
}
