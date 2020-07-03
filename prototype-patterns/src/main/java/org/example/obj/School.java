package org.example.obj;

import lombok.Data;

@Data
public class School implements Cloneable {
    private String name;
    private String address;
    private MathBook book;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
