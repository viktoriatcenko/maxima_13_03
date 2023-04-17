package lesson_7.animals;

public class Dog {
    private String name;
    private Integer age;
    private String parentName;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(Integer age) {
        this.age = age;
    }

    public Dog() {
    }
}
