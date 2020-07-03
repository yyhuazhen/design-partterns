package org.example;

import lombok.Data;

@Data
public class SchoolProtype implements Prototype {
    private String name;
    private String address;
    private Book book;

    @Override
    public Prototype clone() {
        SchoolProtype pro = new SchoolProtype();
        pro.setName(this.getName());
        pro.setAddress(this.getAddress());
        pro.setBook((Book) this.getBook().clone());
        return pro;
    }
}
