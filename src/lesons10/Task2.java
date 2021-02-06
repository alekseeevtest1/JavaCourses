package lesons10;

/**
 * Написать функцию, принимающую 2 параметра строку и слово
 * и возвращающую true, если строка начинается и заканчивается этим словом
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(isStartEnd("adc fdsfdsfddsfdfs adc", "adc"));

    }

    private static boolean isStartEnd(String value, String b){



        if (value.startsWith(b) || value.endsWith(b)){

            return true;

        }else {
            return false;
        }

    }


}
