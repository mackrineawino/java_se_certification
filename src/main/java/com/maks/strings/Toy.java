package com.maks.strings;

public class Toy {
    int x, y;
    public Toy (int x,int y){
        Initialize(x, y);
       
    }
    public void Initialize(int x,int y){
        this.x=x*x;
        this.y=y*y;
    }
    public static void main(String[] args) {
         int x=3, y=5;
        Toy obj=new Toy(x, y);
        System.out.println(x + " " +y);
        String yy="hello";
        String yyy="hello";

      boolean compare=  (yy==yyy);
      System.out.println(compare);

    }
    
}
