package org.example.product.board.impl;

import org.example.product.board.Board;

public class WsiMainBoard implements Board {
    @Override
    public void excute() {
        System.out.println("微星主板 开始工作");
    }

    @Override
    public void inspection() {
        System.out.println("微星主板加电自检");
    }
}
