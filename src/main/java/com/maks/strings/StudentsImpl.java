package com.maks.strings;

import java.util.ArrayList;
import java.util.List;

public class StudentsImpl {
    public static void main(String[] args) {
        List cs=new ArrayList();
        cs.add("java");
        cs.add("C");
        Studentss s=new Studentss(123, "Fred", cs);
        System.out.println(s);
    }
}
