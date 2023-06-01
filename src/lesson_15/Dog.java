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
        System.out.println("������� �����!");
    }

    public void putLeash() {
        this.isLeashOn = true;
        System.out.println("������� �����!");
    }

    public void putMuzlle() {
        this.isMuzzleOn = true;
        System.out.println("��������� �����!");
    }


    public void walk() throws DogIsNotReadyToWalkException {
        System.out.println("���������� ��������!!!");
        if (isCollarOn && isLeashOn && isMuzzleOn) {
            System.out.println("���, �� ������! ���� ������!!!!");
        } else {
            throw new DogIsNotReadyToWalkException("������ " + name + " �� ������");
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
