package org.example;

import org.example.obj.MathBook;
import org.example.obj.School;
import org.example.obj.Student;

/**
 * Hello world!
 */
public class Client {
    public static void main(String[] args) {
//        testPrototypeByClone();
        testPrototypeByObject();
    }

    private static void testPrototypeByClone() {
        System.out.println("Hello World!");
        SchoolProtype schoolProtype = new SchoolProtype();
        schoolProtype.setAddress("兰州");
        schoolProtype.setName("兰州大学");
        schoolProtype.setBook(new Book("高数第六版", "清华大学出版社"));
        Prototype clone = schoolProtype.clone();
        System.out.println("我是原型：" + schoolProtype.toString());
        System.out.println("我是克隆的原型：" + clone.toString());
    }

    private static void testPrototypeByObject() {
        Student student = new Student();
        student.setName("小明");
        student.setAge(18);
        MathBook book = new MathBook();
        book.setName("英语第五版");
        book.setPressName("北京大学出版社");
        student.setBook(book);
        System.out.println("我是原型：" + student.toString());
        MathBook cloneBook = (MathBook) book.clone();
        cloneBook.setName("我是复印版book");
        System.out.println("我是BOOK克隆版:" + cloneBook.toString());
        System.out.println("我是原版Book："+book.toString());
        Student clone = (Student) student.clone();
        clone.getBook().setName("英语第五版复印版");
        System.out.println("我是复制品：" + clone.toString());
        System.out.println("我是复制后的原型：" + student.toString());
    }
}
