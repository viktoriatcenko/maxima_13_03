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

}
