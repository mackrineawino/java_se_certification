package com.maks.strings;

public class MyField {
    int x;
    int y;
    public void dostuff(int x, int y){
        this.x=x;
        y=this.y;
    }
    public void display(){
        System.out.println(x + " " + y + ":");
    }
    public static void main(String[] args) {
        MyField m1=new MyField();
        m1.x=100;
        m1.y=200;
        MyField m2=new MyField();
        m2.dostuff(m1.x, m1.y);
        m1.display();
        m2.display();

        int[][] array2D;
        int [] array2qD [];
    }
}
