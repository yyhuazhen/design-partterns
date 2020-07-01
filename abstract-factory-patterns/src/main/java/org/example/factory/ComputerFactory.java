package org.example.factory;

import org.example.product.board.Board;
import org.example.product.cpu.Cpu;

public interface ComputerFactory {
    Board createMainBoard();

    Cpu createCpu();
}
