package com.company;

public class MyMath {

    public int getResult(int n1, int n2, String math1) throws Exception {
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
                    throw new Exception("Некорректные данные");
                }

            default:
                return 111;
        }


    }


}






