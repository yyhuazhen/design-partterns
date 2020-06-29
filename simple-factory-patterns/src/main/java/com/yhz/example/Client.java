package com.yhz.example;

public class Client {
    public static void main(String[] args) {
        Operater operator = getOperator("-");
        try {
            int result = operator.calculate(9, 8);
            System.out.println(result);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static Operater getOperator(String s) {
        OperaterFactory factory = new OperaterFactory();
        return factory.getInstance(s);
    }
}
