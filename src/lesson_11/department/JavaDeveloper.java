package lesson_11.department;

public class JavaDeveloper implements JobOfferInterface {
    @Override
    public void writeCode() {
        System.out.println("writing the Code on Java/Kotlin");
    }

    @Override
    public void bePunctual() {
        System.out.println("I'm going to my job when I'm want to go, because I have flexible schedule");
    }

    @Override
    public void getSalary() {
        System.out.println("I'm get my 1000$ every month");
    }



}
