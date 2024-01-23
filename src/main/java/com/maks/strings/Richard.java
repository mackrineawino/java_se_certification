package com.maks.strings;

public class Richard {
    String name;

    public Richard(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Richard [] students=new Richard[3];
        students[1]=new Richard("rich");
        students[2]=new Richard("don");
        for (Richard s : students) {
            System.out.println(" " + s.name);
        }


    }
}
