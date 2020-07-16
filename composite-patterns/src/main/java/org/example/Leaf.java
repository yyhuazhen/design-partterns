package org.example;

public class Leaf extends Compoent {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void someOperation() {
        System.out.println("叶子节点的操作:" + name);
    }
}
