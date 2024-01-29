package com.maks.strings;

public class AA3 extends AA2{
   
   public void m1(){
    System.out.println("Yellow");
   }
   public void m2(){
    System.out.println("Pink");
   }
   public void m3(){
    System.out.println("Red");
   }
   public static void main(String[] args) {
    AA2 tp=new AA3();
    tp.m1();
    tp.m2();
    tp.m3();
   }
}
