package lesson_15;

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

}
