package com.maks.strings;

public class Apppp {
     static int foo;
    static int bar;
    static void process(){
        foo+=10;
        bar+=10;
        
        
    }
    public static void main(String[] args) {
        Apppp fobj=new Apppp();
        Apppp.process();
        System.out.println(fobj.bar);

        Apppp secobj=new Apppp();
        Apppp.process();;

        System.out.println(secobj.bar);
    }
}
