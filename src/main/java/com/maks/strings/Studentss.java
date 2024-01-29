package com.maks.strings;

import java.util.ArrayList;
import java.util.List;

public class Studentss {
    int rollNumber;
    String name;
    List courses=new ArrayList();

     Studentss(int i, String name, List cs){
        this.rollNumber=i;
        this.name=name;
        this.courses=cs;
    }

    public String toString(){
        return rollNumber + ":" + name + ":" + courses;
    }
    
}
