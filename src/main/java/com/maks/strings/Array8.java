package com.maks.strings;

public class Array8 {
   public static void main(String[] args) {
    int [] intArr={15,30, 45, 60,75};
    intArr[2]=intArr[4];
    intArr[4] =90;

    for (int a : intArr) {
        System.out.println(a);
    }
   }

}
