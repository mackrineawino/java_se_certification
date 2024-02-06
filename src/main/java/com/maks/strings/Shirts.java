package com.maks.strings;

public class Shirts {
    public static void main(String[] args) {
        String shirts[][] =new String[2][2];
        shirts[0][0] ="red";
        shirts[0][1] ="blue";
        shirts[1][0] ="small";
        shirts[1][1] ="medium";

        // for(int index=0; index<2;){
        //     for(int idx=0;  idx<2;){
        //         System.out.println(shirts[index][idx] + ":");
        //         idx++;
        //     }
        //     index++;
        // }

        for (String []  c: shirts) {
            for (String s : c) {
                System.out.println(s + ":");
            }
        }
        String product="Pen";
        product.toLowerCase();
        product.concat("BOX".toLowerCase());
        System.out.println(product.substring(4, 6));
    }
}
