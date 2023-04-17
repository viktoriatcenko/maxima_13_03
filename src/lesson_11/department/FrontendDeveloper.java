package lesson_11.department;

public class FrontendDeveloper implements JobOfferInterface {

    @Override
    public void writeCode() {
        System.out.println("writing the Code on JavaScript");
    }

    @Override
    public void bePunctual() {
        System.out.println("I'm going to my job to 9-00 a.m.");
    }

    @Override
    public void getSalary() {
        System.out.println("I'm get my 800$ every month");
    }

}
