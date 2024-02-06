package com.maks.strings;

public class Equal {
    public static void main(String[] args) {
        String str1="Java";
        String[] str2={"J", "a", "v", "a"};
        String str3="";

        for (String str : str2) {
            str3=str3+str;
        }
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        boolean b1=(str1==str3);
        boolean b2=(str1.equals(str3));
        System.out.println(b1 +"," + b2);

//         int data[] = {2010, 2013, 2014, 2015,2014};

//         int key=2014;
//         int count=0;

//         for (int e : data) {
//             if (e!=key) {
//                 continue;
//                 count++;
//             }
//         }
//         System.out.println(count + "Found");
    }
}
