package org.example.obj;

import lombok.Data;

@Data
public class MathBook implements Cloneable {
    private String name;
    private String pressName;

    @Override
    public Object clone() {
        Object obj = null;
        try {
            //obj没有初始化 有个bug  但是能单独复制MathBook
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("类找不到啦");
        }
        return obj;
    }
}
