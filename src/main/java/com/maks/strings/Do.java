package com.maks.strings;

public class Do {
   String myStr="7007";
   
   public void doStuff(String str){
    int myNum=0;
    try {
        String myStr=str;
        myNum=Integer.parseInt(myStr);

    } catch (NumberFormatException ne) {
        System.err.println("Error");
    }
    System.out.println("mystr: " + myStr + ",myNum: " + myNum);
   }

   public static void main(String[] args) {
    Do obj=new Do();
    obj.doStuff("9009");
   }
}
