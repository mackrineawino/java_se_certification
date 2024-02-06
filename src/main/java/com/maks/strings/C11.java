package com.maks.strings;

public class C11 extends C2 implements I{
    public void displayI(){
        System.out.println("CII");
    }

    public static void main(String[] args) {
        C2 obj1=new C11();
        I obj2=new C11();
        C2 s=(C2)obj2;
        I t=obj1;
        t.displayI();
        s.displayC2();
    }
}
