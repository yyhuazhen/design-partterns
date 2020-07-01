package org.example.product.board.impl;

import org.example.product.board.Board;

public class GiMainBoard implements Board {
    @Override
    public void excute() {
    System.out.println("技嘉主板 开始工作");
    }
    @Override
    public void inspection() {
        System.out.println("技嘉主板加电自检");
    }
}
