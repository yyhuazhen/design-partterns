package org.example;

public class PersonBuilder {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String address;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder height(int height) {
        this.height = height;
        return this;
    }

    public PersonBuilder weight(int weight) {
        this.weight = weight;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Person build(){
        Person person = new Person();
        person.setAddress(this.address);
        person.setName(this.name);
        person.setAge(this.age);
        person.setHeight(this.height);
        person.setWeight(this.weight);
        return person;
    }
}
