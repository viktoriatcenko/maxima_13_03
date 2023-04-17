package lesson_11.animals;

public class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Dog is barking, wuff, wuff");
    }

    public void loveBone() {
        System.out.println("Dog is love his bone");
    }
}
