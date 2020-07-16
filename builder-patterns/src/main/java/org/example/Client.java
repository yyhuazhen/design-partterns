package org.example;


public class Client
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Person person = Person.builder().address("兰州").age(32).height(180).weight(80).name("小明").build();
        Student student = Student.builder().age(10).name("小红").school("兰州大学").build();
        System.out.println(person.toString());
        System.out.println(student.toString());
    }
}
