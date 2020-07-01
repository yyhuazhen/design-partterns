package org.example.product.cpu.impl;

import org.example.product.cpu.Cpu;

public class AmdCup implements Cpu {
    @Override
    public void excute() {
        System.out.println("AMD cup 有点次，开始工作");
    }
    @Override
    public void inspection() {
        System.out.println("AMD CPU 加电自检");
    }
}
