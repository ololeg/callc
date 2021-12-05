package com.company;

import java.util.Map;
import java.util.Scanner;


public class Callc {

    public static void main(String[] args) {

        Map<String, Integer> mapR = Map.of(
                "I", 1,
                "II", 2,
                "III", 3,
                "IV", 4,
                "V", 5,
                "VI", 6,
                "VII", 7,
                "VIII", 8,
                "IX", 9,
                "X", 10
        );

        Map<String, Integer> mapG = Map.of(
                "1", 1,
                "2", 2,
                "3", 3,
                "4", 4,
                "5", 5,
                "6", 6,
                "7", 7,
                "8", 8,
                "9", 9,
                "10", 10
        );

        Map<Integer, String> mapV = Map.of(
                1, "I",
                2, "II",
                3, "III",
                4, "IV",
                5, "V",
                6, "VI",
                7, "VII",
                8, "VIII",
                9, "IX",
                10, "X"
        );
        Map<Integer, String> mapX = Map.of(
                2, "XX",
                3, "XXX",
                4, "XL",
                5, "L",
                6, "LX",
                7, "LXX",
                8, "LXXX",
                9, "XC",
                100, "C",
                1, "X"
        );

        System.out.println("Введите пример:");
        Scanner scan = new Scanner(System.in);

        String num1 = scan.next();
        String math1 = scan.next();
        String num2 = scan.next();

        scan.close();


        Integer n1 = 0;
        Integer n2 = 0;

        if (mapR.containsKey(num1) && mapR.containsKey(num2)) {
            n1 = (mapR.get(num1));
            n2 = (mapR.get(num2));
        } else if (mapG.containsKey(num1) && mapG.containsKey(num2)) {
            n1 = (mapG.get(num1));
            n2 = (mapG.get(num2));
        } else if (mapR.containsKey(num1) && mapG.containsKey(num2) || mapG.containsKey(num1) && mapR.containsKey(num2)) {
            System.err.println("Некорректные данные");
            return;
        } else if (!mapR.containsKey(num1) || !mapR.containsKey(num2) || !mapG.containsKey(num1) || !mapG.containsKey(num2)) {
            System.err.println("Некорректные данные");
            return;
        }

        int result = new MyMath().getResult(n1, n2, math1);

        if (result == 111) {
            System.err.println("Некорректные данные");
        } else if (mapR.containsKey(num1)) {
            if (result <= 0) {
                System.err.println("Некорректные данные");
            } else if (result >= 100) {
                String rome = (mapX.get(result));
                System.out.println(rome);
            } else if (result <= 10) {
                String rome = (mapV.get(result));
                System.out.println(rome);
            } else if (result < 100) {
                String romeX = (mapX.get(result / 10));
                String romeW = (mapV.get(result % 10));

                if ((result % 10) <= 0) {
                    System.out.println(romeX);
                } else {
                    System.out.println(romeX + romeW);
                }
            }
        } else {
            System.out.println(result);
        }
    }
}










