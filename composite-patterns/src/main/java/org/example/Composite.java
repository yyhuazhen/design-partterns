package org.example;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Compoent {
    private List<Compoent> list;
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void someOperation() {
        System.out.println("组合节点的操作:" + this.name);
        if (!list.isEmpty()) {
            for (Compoent com : list
            ) {
                com.someOperation();
            }
        }
    }

    @Override
    public void addChrild(Compoent compoent) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(compoent);
    }

    @Override
    public void deleteChrild(Compoent compoent) {
        if (list != null && list.contains(compoent)) {
            list.remove(compoent);
        }
    }

    @Override
    public Compoent getChrild(int index) {
        return list.get(index);
    }
}
