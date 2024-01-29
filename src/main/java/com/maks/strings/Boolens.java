package com.maks.strings;

public class Boolens {
    public static void main(String[] args) {
        // boolean a= new Boolean(Boolean.valueOf(args[0]));
        // boolean b= new Boolean(args[1]);
        // System.out.println(a + " " + b);

        int [][] arr=new int [2] [4];
        arr[0] =new int []{1, 3, 5, 7};
        arr[1]= new int []{1, 3};

        for(int[] a: arr){
            for(int i=0; i<arr.length; i++){
                System.out.println(a[i] + " ");
            }
            System.out.println();
        }
    }
}
