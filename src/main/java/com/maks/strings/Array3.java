package com.maks.strings;

import java.util.ArrayList;

public class Array3 {
    public static void main(String[] args) {
        ArrayList myList=new ArrayList();
        String [] myArray;

        try {
            while (true) {
                myList.add("My String");

            }
        } catch (RuntimeException re) {
           System.out.println("Runtime ex");
        }catch (Exception e) {
            System.out.println("Exception ex");
         }
         System.out.println("Ready");
    }
}
