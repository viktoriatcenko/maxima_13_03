package lesson_12.test;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String nameFromObjectInMainClass) {
        this.name = nameFromObjectInMainClass;
    }

    public void setAge(int ageFromMainClass) {
        this.age = ageFromMainClass;
    }


}
