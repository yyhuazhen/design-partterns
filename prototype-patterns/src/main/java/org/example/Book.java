package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Prototype {
    private String name;
    private String pressName;

    @Override
    public Prototype clone() {
        return new Book(this.getName(), this.getPressName());
    }
}
