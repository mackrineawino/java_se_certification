package com.maks.strings;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class WhizLab {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(13);
        list.add(30);
        list.add(11);
        list.removeIf(e -> e % 2 != 0);
        System.out.println(list);


        LocalDate date=LocalDate.of(2015, 3,26);
        Period p=Period.ofDays(1);
        System.out.println(date.plus(p));
    }
}
