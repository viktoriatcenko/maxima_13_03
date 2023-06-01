package lesson_16;

import java.util.HashMap;

public class Fridge {
    // Fields
    private HashMap<String, Integer> prodList = new HashMap<>();

    // Constructor

    // Methods
    @Deprecated
    public void putProducts(String name, Integer count) {
        if (prodList.containsKey(name)) {
            prodList.put(name, count + prodList.get(name));
        } else {
            prodList.put(name, count);
        }
    }

    public void countProduct(String name) {
        if (prodList.containsKey(name)) {
            System.out.println(prodList.get(name));
        } else {
            System.out.println(name + " нет в холодильнике!");
        }
    }

    public void takeProduct(String name, int count) {
        // Если такого продукта нет в холодильнике
        if (!prodList.containsKey(name)) {
            System.out.println(name + " нет в холодильнике! Сначала положи");
            return;
        }

        // Если этого продукта не хватает
        if (prodList.get(name) < count) {
            System.out.println(name + " есть только " + prodList.get(name));
            System.out.println("Отдаю тебе " + prodList.get(name) + " " + name);
            prodList.remove(name);
            System.out.println(name + " Закончился");
        } else if (prodList.get(name) == count) {
            System.out.println("Отдаю тебе " + prodList.get(name) + " " + name);
            prodList.remove(name);
            System.out.println(name + " Закончился");
        } else {
            System.out.println("Отдаю тебе " + count + " " + name);
            prodList.put(name, prodList.get(name) - count);
        }
    }
}
