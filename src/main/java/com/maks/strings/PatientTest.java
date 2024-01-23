package com.maks.strings;

import java.util.ArrayList;
import java.util.List;

public class PatientTest {
    public static void main(String[] args) {
        List ps=new ArrayList();
        Patient p2=new Patient("Mike");
        ps.add(p2);
        int f =ps.indexOf(p2);

        if(f>=0){
            System.out.println("Mikefound");
        }
        
    }
}
