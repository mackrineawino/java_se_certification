package com.maks.strings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    // ff.printAll();

    LocalDate date= LocalDate.of(2012, 01, 30);
    date.plusDays(10);
    System.out.println(date);

    LocalDateTime dt=LocalDateTime.of (2014, 7, 31, 1,1);
    dt.plusDays(30);
    dt.plusMonths(1);
    System.out.println(dt.format(DateTimeFormatter.ISO_TIME));

    int result=30-12/(2*5)+1;
    System.out.println("results = " + result);

    int a, b, c=0;
    int a,b, c;
    int g, int h,int i=0;
    int d, e, F;
    int k, l, m=0;

}
}
