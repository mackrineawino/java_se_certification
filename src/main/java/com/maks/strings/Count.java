package com.maks.strings;

public class Count {
    static int count =0;
    int i=0;
    public void changeCount(){
        while (i<5) {
            i++;
            count++;  
        }
    }
    public static void main(String[] args) {
        Count c1=new Count();
        Count c2=new Count();

        c1.changeCount();
        c2.changeCount();

        System.out.println(c1.count + ":" + c2.count);
    }
}
