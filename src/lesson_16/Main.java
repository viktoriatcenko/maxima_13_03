package lesson_16;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1 - Создание коллекции Map
        HashMap<String, Integer> table = new HashMap<>();

        // 2 - Добавление элементов
        table.put("Dinamo", 11);
        table.put("Shakhtar", 15);
        table.put("Spartak", 13);

        // 3 - Добавление дубликатов ключа невозможно

        table.put("Spartak", 19);
        table.put("Dinamo", 19);

        System.out.println("");

        // 4 - мeтод containsKey

        System.out.println(table.containsKey("Dinamo"));
        System.out.println(table.containsKey("Zenith"));

        // 5 - проход по коллекции

//        for (String s: list) {
//            s
//        }

        for (Map.Entry<String, Integer> p : table.entrySet()) {
            System.out.println(p.getKey() + " : " + p.getValue());
        }

        // 6 - вернуть сет ключей

        for (String key : table.keySet()) {
            System.out.println("Key : " + key);
        }

        // 7 - вернуть значение по ключу

        for (String key : table.keySet()) {
            System.out.println("Value : " +  table.get(key));
        }


    }
}
