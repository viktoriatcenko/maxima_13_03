package lesson_7.animals;

public class Cat {
    // ����
    private String name;
    private Integer age;
    private String parentName;


    // �����������


    public Cat(String name, Integer age, String parentName) {
        this.name = name;
        this.age = age;
        this.parentName = parentName;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cat(Integer age) {
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
}
