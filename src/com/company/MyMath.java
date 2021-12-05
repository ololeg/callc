package com.company;


import java.util.Map;
import java.util.Scanner;

public class MyMath {


    public int getResult(int n1, int n2, String math1) {
        switch (math1) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                try {
                    return n1 / n2;
                } catch (Exception e) {
                    System.err.println("Делить на ноль нельзя.");
                }

            default:
                return 111;
        }


    }


}






