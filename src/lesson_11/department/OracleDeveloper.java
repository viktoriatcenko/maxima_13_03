package lesson_11.department;

public class OracleDeveloper implements JobOfferInterface {

    @Override
    public void writeCode() {
        System.out.println("writing the Code on OracleSQL");
    }

    @Override
    public void bePunctual() {
        System.out.println("I'm going to my job to 11-00 a.m.");
    }

    @Override
    public void getSalary() {
        System.out.println("I'm get my 700$ every month");
    }
}
