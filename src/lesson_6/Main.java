package lesson_6;


public class Main {
    public static void main(String[] args) {
        // 1 - Primitive types
        // 2 - Linked types by Oracle
        // 3 - Linked types by your own / other companies
//        int a = 2145454841;


//        System.out.println(a);
        char [] str = {'H','e','l'};

        String w = new String(str);
        String s = "Hello World";

        /**
         * length() - возвращает длину строки
         *
         * concat(): объединяет строки / +=
         *
         * equals(): сравнивает строки с учетом регистра
         *
         * equalsIgnoreCase(): сравнивает строки без учета регистра
         *
         * startsWith(): определяет, начинается ли строка с подстроки
         *
         * endsWith(): определяет, заканчивается ли строка на определенную подстроку
         *
         * String replace(char oldChar, char newChar)
         * Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.
         *
         * String[] split(String regex)
         * Разделяет эту строку, окружая данным регулярным выражением.
         *
         * trim(): удаляет начальные и конечные пробелы
         *
         * toLowerCase(): переводит все символы строки в нижний регистр
         *
         * toUpperCase(): переводит все символы строки в верхний регистр
         * */


        String st = "????????????Hello World!";

        System.out.println(st.length());

        String st1 = st.concat("!!!!!!!!!!!!!!!!!!!!!!");


        st1 += "???????????"; // st1 = st1 + "???????????"

        System.out.println(st1);

        int a = 5;
        int b = 10;

        String stt = "Hello World!!";

        String stringForExampleInUpperCase = "HELLO WORLD";
        String stringForExampleInLowerCase = "hello world";

        System.out.println(stringForExampleInUpperCase.equalsIgnoreCase(stringForExampleInLowerCase));

        System.out.println(stt.startsWith("Hello"));

        System.out.println(st1.endsWith("!"));

        String newSt1 = st1.replace("?", "!");

        System.out.println(newSt1);

        String st3 = "Hello World ";

        String trim = st3.trim();

        System.out.println(trim);

        String s1 = stringForExampleInLowerCase.toUpperCase();

        System.out.println(s1);


    }
}
