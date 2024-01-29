package com.maks.strings;

public class Message {
   public static void main(String[] args) {
    String message1="wham bam!";
    String message2=new String("wham bam!");

    if (message1==message2) {
        System.out.println("they match");
        
    }
    if (message1.equals(message2)) {
        System.out.println("they really match");
    }
  } 
}
