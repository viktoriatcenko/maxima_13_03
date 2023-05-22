package lesson_15;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("�����");

        dog.putCollar();
        dog.putLeash();

        try {
            dog.walk();
        } catch (DogIsNotReadyToWalkException e) {
            e.printStackTrace();
            System.out.println("�������� ���������� � �������� :");
            System.out.println("������� �����? " + dog.isCollarOn());
            System.out.println("������� �����? " + dog.isLeashOn());
            System.out.println("��������� �����? " + dog.isMuzzleOn());
        }
    }
}
