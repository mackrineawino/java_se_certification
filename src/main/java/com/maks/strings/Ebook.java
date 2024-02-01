package com.maks.strings;

public class Ebook extends Book {
    public void readBook(){
        System.out.println("Read EBook");
    }

   

    public static void main(String[] args) {
        Book book1=new Ebook();
        book1.readBook();
    }



    // @Override
    // public void download() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'download'");
    // }
}
