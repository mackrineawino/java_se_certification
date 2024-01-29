package com.maks.strings;

public class Ar {
    public static void main(String[] args) {
        // int nums1[]=new int [3];
        int nums1[]= {1, 2, 3};
        int nums2[]= {1, 2, 3, 4, 5};
        nums2=nums1;

        for (int i : nums2) {
        System.out.println(i+ ":");
        }

        // int n[][] = { { 1, 3 }, { 2, 4 } };
        // for (int i = n.length - 1; i >= 0; i--) {
        //     for (int y : n[i]) {
        //         System.out.print(y);
        //     }
        // }

    }
}
