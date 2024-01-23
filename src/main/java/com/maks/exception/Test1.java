package com.maks.exception;

public class Test1 {
    void readCard(int cardNo) throws Exception{
        System.out.println("reading card");
    }
    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("checking card");
    }

    public static void main(String[] args) {
        Test1 ex =new Test1();
        int cardNo=12344;

        ex.checkCard(cardNo);
      
         try {
            ex.readCard(cardNo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }
}
