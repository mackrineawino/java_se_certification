package com.maks.strings;

import java.util.ArrayList;
import java.util.List;

public class Product1 {
   int id;
   String name;
   Product1(int id, String name) {
    this.id=id;
    this.name=name;
   }

   public static void main(String[] args) {
    List<Product1> lst=new ArrayList<>();
    lst.add(new Product1(10, "iceCream"));
    lst.add(new Product1(11, "Chocolate"));

    Product1 p1=new Product1(10, "iceCream");
    System.out.println(lst.indexOf(p1));
   }
}
