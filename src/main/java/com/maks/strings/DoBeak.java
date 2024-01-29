package com.maks.strings;

public class DoBeak {
    public static void main(String[] args) {
        String [] table={"aa", "bb", "cc", "dd"};
        for (String ss : table) {
            if ("bb".equals(ss)) {
                continue;
            }
            System.out.println(ss);
            if ("cc".equals(ss)) {
              break;  
            }
        }

    }
}
