package com.yhz.example.impl;

import com.yhz.example.Operater;

public class DivisionOperaterImpl implements Operater {
    @Override
    public int calculate(int srcOperand, int destOperand) throws IllegalAccessException {
       if(destOperand==0){
           throw new IllegalAccessException("除数不能为0");
       }
        return srcOperand / destOperand;
    }
}
