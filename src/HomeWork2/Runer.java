package HomeWork2;

import HomeWork2.Karas;

public class Runer {

    public static void main(String[] args) {

        Karas karas = new Karas();
        karas.setName("Karasik");

        System.out.println(karas.getName());

        karas.setNoHead(true);

        karas.setMoney((float) 34.54);

        System.out.println(karas.getMoney());
    }
}
