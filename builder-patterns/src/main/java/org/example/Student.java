package org.example;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student {
    private String name;
    private String school;
    private int age;

    private Student() {
    }

    public static StudentBuilder builder() {
        return new Student.StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private String school;
        private int age;

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder school(String school) {
            this.school = school;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Student build(){
            Student student = new Student();
            student.setAge(this.age);
            student.setName(this.name);
            student.setSchool(this.school);
            return student;
        }
    }
}
