package org.example;


import org.example.factory.ComputerFactory;
import org.example.factory.impl.ProductAComputerFactory;
import org.example.factory.impl.ProductBComputerFactory;
import org.example.product.board.Board;
import org.example.product.cpu.Cpu;

public class ComputerEngineer {
    private ComputerFactory computerFactory;
    private Cpu cpu;
    private Board board;

    public void makeComputer(String product) {
        preHandle(product);
        //组装电脑
        makeComputer();
        //测试电脑
        testComputer();
        //计算任务
        excute();
    }

    private void excute() {
    board.excute();
    cpu.excute();
    }

    private void testComputer() {
    board.inspection();
    cpu.inspection();
    }

    private void makeComputer() {
        this.cpu = computerFactory.createCpu();
        this.board = computerFactory.createMainBoard();
    }

    private void preHandle(String product) {
        if (product.equals("A")) {
            computerFactory = new ProductAComputerFactory();
        } else {
            computerFactory = new ProductBComputerFactory();
        }
    }
}
