package lesson_6;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) throws InterruptedException {
        int [] mas = {11, 3, 14, 16, 7};

        boolean isSorted = false;

        System.out.println(!isSorted);
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));

        int a = 10;

        while (a > 0) {
            Thread.sleep(1000);
            System.out.println(a);
            a--; // a = a -1
        }
    }



}
