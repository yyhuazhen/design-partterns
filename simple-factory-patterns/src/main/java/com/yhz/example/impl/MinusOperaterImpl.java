package com.yhz.example.impl;

import com.yhz.example.Operater;

public class MinusOperaterImpl implements Operater {
    @Override
    public int calculate(int srcOperand, int destOperand) {
        return srcOperand - destOperand;
    }
}
