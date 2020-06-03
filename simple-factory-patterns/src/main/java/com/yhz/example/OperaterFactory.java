package com.yhz.example;

import com.yhz.example.impl.DivisionOperaterImpl;
import com.yhz.example.impl.MinusOperaterImpl;
import com.yhz.example.impl.MultiOperaterImpl;
import com.yhz.example.impl.PlusOperaterImpl;

public class OperaterFactory {
    public Operater getInstance(String operator) {
        switch (operator) {
            case "+":
                return new PlusOperaterImpl();
            case "-":
                return new MinusOperaterImpl();
            case "*":
                return new MultiOperaterImpl();
            case "/":
                return new DivisionOperaterImpl();
            default:
                return null;
        }
    }
}
