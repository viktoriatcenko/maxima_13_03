package lesson_15;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");

        dog.putCollar();
        dog.putLeash();

        try {
            dog.walk();
        } catch (DogIsNotReadyToWalkException e) {
            e.printStackTrace();
            System.out.println("Проверка готовности к прогулке :");
            System.out.println("Ошейник надет? " + dog.isCollarOn());
            System.out.println("Поводок надет? " + dog.isLeashOn());
            System.out.println("Намордник надет? " + dog.isMuzzleOn());
        }
    }
}
