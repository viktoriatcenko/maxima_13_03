package lesson_15;

import java.util.HashMap;
import java.util.Map;

public class Dog {
    // Fields
    private String name;
    private boolean isCollarOn;
    private boolean isLeashOn;
    private boolean isMuzzleOn;

    // Constructor
    public Dog(String name) {
        this.name = name;
    }


    // Methods


    public boolean isCollarOn() {
        return isCollarOn;
    }

    public boolean isLeashOn() {
        return isLeashOn;
    }

    public boolean isMuzzleOn() {
        return isMuzzleOn;
    }

    public void putCollar() {
        this.isCollarOn = true;
        System.out.println("Поводок надет!");
    }

    public void putLeash() {
        this.isLeashOn = true;
        System.out.println("Ошейник надет!");
    }

    public void putMuzlle() {
        this.isMuzzleOn = true;
        System.out.println("Намордник надет!");
    }


    public void walk() throws DogIsNotReadyToWalkException {
        System.out.println("Собираемся гуляяять!!!");
        if (isCollarOn && isLeashOn && isMuzzleOn) {
            System.out.println("УРа, мы готовы! Идем гулять!!!!");
        } else {
            throw new DogIsNotReadyToWalkException("Собака " + name + " не готова");
        }
    }


    @SuppressWarnings("unchecked")
    public void testSuppressWarnings() {
        Map test = new HashMap<>();

        test.put("AAA", 111);
        test.put("BBB", 222);
        test.put("CCC", 333);
        test.put("DDD", 444);
    }

}
