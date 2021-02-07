package lesons10;

import java.util.Locale;

/**
 * Написать функцию, принимающую в качестве параметров имя фамилию и отечество
 *  и вовращающую инициалы в формате "Ф.И.О"
 */

public class Task3 {

    public static void main(String[] args) {
        System.out.println(fio("ivan", "ivanov", "ivanovich"));

    }
    public static String fio(String name, String serName, String firsrName){

        return name.substring(0,1).toUpperCase() + "." + serName.substring(0,1).toUpperCase() + "." + firsrName.substring(0,1).toUpperCase() ;
    }
}
