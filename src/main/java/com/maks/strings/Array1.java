package com.maks.strings;

public class Array1 {
    public static void main(String[] args) {
         int [] array =new int[2];
        // int[] array;
        // array= new int[2];
        array[0]=10;
        array[1]=20;
        System.out.println(array[0] + ":" + array[1]);


        String [] arr={"A", "B", "C", "D"};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " "); 
           
            if (arr[i].equals("D")) {
                System.out.println("Work done ");
                break;
                
            }
           continue;
            // System.out.println("Work Done");
            // break;
        }
    }
}
