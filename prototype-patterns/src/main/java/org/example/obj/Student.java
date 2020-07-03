package org.example.obj;

import lombok.Data;

@Data
public class Student implements Cloneable {
    private String name;
    private int age;
    private MathBook book;

    private void setMathBook(MathBook book) {
        this.book = book;
    }

    @Override
    public Object clone() {
        Student obj = null;
        try {
            obj = (Student) super.clone();
            MathBook book = (MathBook) this.book.clone();
            obj.setBook(book);
        } catch (CloneNotSupportedException e) {
            System.out.println("找不到类啦");
        }
        return obj;
    }
}
