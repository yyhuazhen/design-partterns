package org.example.product.cpu.impl;

import org.example.product.cpu.Cpu;

public class InterCpu implements Cpu {
    @Override
    public void excute() {
        System.out.println("Intel Cpu 开始工作");
    }
    @Override
    public void inspection() {
        System.out.println("intel CPU 加电自检");
    }
}
