package org.example.factory.impl;

import org.example.product.board.Board;
import org.example.product.board.impl.WsiMainBoard;
import org.example.product.cpu.Cpu;
import org.example.product.cpu.impl.AmdCup;

public class ProductBComputerFactory implements org.example.factory.ComputerFactory {
    @Override
    public Board createMainBoard() {
        return new WsiMainBoard();
    }

    @Override
    public Cpu createCpu() {
        return new AmdCup();
    }
}
