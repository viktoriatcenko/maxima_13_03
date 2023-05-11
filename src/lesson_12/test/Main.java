package lesson_12.test;

public class Main {
    public static void main(String[] args) {
        Person alex = new Person("Alexey", 33);
        Person viktor = new Person("Viktor", 32);

        Person person = new Person();

        person.setName("Adel");
        person.setAge(23);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        System.out.println(alex.getName());
        System.out.println(alex.getAge());

        System.out.println(viktor.getName());
        System.out.println(viktor.getAge());

    }
}
