package com.company;

public class Test {
    public static void main(String[] args) {
        byte b = 0;

        for (int sch = 0; sch < 200; sch++) {
            System.out.println((byte) (b++));
        }
    }
}
