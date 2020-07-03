package org.example;

import lombok.Data;

@Data
public class StudentProtoType implements Prototype {
    private String name;
    private int age;
    private Book book;

    @Override
    public Prototype clone() {
        StudentProtoType pro = new StudentProtoType();
        pro.setName(this.getName());
        pro.setAge(this.getAge());
        pro.setBook((Book) this.getBook().clone());
        return pro;
    }
}
