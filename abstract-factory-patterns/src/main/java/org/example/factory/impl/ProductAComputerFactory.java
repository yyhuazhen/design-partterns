package org.example.factory.impl;

import org.example.product.board.Board;
import org.example.product.board.impl.GiMainBoard;
import org.example.product.cpu.Cpu;
import org.example.product.cpu.impl.InterCpu;

public class ProductAComputerFactory implements org.example.factory.ComputerFactory {
    @Override
    public Board createMainBoard() {
        return new GiMainBoard();
    }

    @Override
    public Cpu createCpu() {
        return new InterCpu();
    }
}
