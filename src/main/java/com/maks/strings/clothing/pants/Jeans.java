package com.maks.strings.clothing.pants;

import static com.maks.strings.clothing.Shirt.getColor;

public class Jeans {
    public void matchShirt(){
        String color=getColor();
        if (color.equals("Green")){
            System.out.println("fit");
        }
    }

    public static void main(String[] args) {
        Jeans trouser=new Jeans();
        trouser.matchShirt();
    }
}
