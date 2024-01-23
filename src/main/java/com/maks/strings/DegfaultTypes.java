package com.maks.strings;

import java.time.LocalDate;

public class DegfaultTypes {
    char c;
    boolean b;
    float f;
    double d;
    String s;
    int i;
    void printAll(){
        System.out.println("c= " + c);
        System.out.println("b= " + b);
        System.out.println("d= " + d);
        System.out.println("s= " + s);
        System.out.println("i= " + i);
        System.out.println("f= " + f);
    }
public static void main(String[] args) {
    DegfaultTypes ff= new DegfaultTypes();
    ff.printAll();

    LocalDate date= LocalDate.of(2012, 01, 32);
    date.plusDays(10);
    System.out.println(date);
}
}
