package lesson_8;

public class Cat {
    // поля
    String name;
    int age;
    String parentName;
    Kitten [] kittens = new Kitten[10];

    // конструктор
    public Cat(String name, int age, String parentName) {
        this.name = name;
        this.age = age;
        this.parentName = parentName;
    }


    public Cat() {
    }

    // методы


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    void sayHello(String name, int age) {
        System.out.println("Hello, I'm the cat");
        System.out.println("Ny name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My parentName is Snezhkovich");
    }

    public void sayGoodBye() {
        System.out.println("GoodBye");
        System.out.println("See you tomorrow");
    }

    public int giveMeFive() {
        System.out.println("inside method giveMeFive");
        return 5;
    }

    public double giveMePiNumber() {
        return 3.1415926535;
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public String getNull() {
        return null;
    }

    public void addKitten(Kitten kitten) {
        kittens[0] = kitten;
    }


    public void print() {
        System.out.println("It's not static method");
    }

    public static void printS() {
        System.out.println("It's THE STATIC method");
    }
}
