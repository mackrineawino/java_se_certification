package com.maks.strings;

public class Var {
    public static int stVar=100;
    public int var=200;
    public String toString(){
        return var + ":" + stVar;
    }
public static void main(String[] args) {
    Var t1=new Var();
    t1.var=300;
    System.out.println(t1);
    Var t2=new Var();
    t2.stVar=300;
    System.out.println(t2);
}
}
