package com.maks.strings;

public class White {
    public static void main(String[] args) {
        String stuff="TV";
        String res=null;

        // stuff.equals("TV")? res="Walter" :stuff.equals("Movie")?res="white" :res="no results";
        res=stuff.equals("TV")?"walter":stuff.equals("Movie")?"white":"no results";
        System.out.println(res);
    }
}
