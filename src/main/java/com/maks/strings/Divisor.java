package com.maks.strings;

public class Divisor {
    public static void main(String[] args) {
        int ax = 10, az = 30;
        int aw = 1, ay = 1;

        try {
            aw = ax % 2;
            ay = az / aw;
        } catch (ArithmeticException e1) {
            System.out.println("invalid divisor");

        } catch (Exception e2) {
            aw = 1;
            System.out.println("divisor changed");
        }

        ay=az/aw;
        System.out.println("Success " + ay);

    }
}
