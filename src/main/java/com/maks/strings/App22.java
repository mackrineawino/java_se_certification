package com.maks.strings;

public class App22 {
  int count;
  
  public void method(Book1 x, int k){
    x.pages=100;
    k=200;

  }

  public static void main(String[] args) {
    App22 obj =new App22();
    Book1 objBook=new Book1();

    System.out.println(objBook.pages + ":" + obj.count);
    obj.method(objBook, obj.count);
    System.out.println(objBook.pages + ":" + obj.count);

  }
}
