package com.oop.consta;

public class Dog {

    private static int dogsCount;

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size;

    public Dog(){
        dogsCount++;
    }

    public static int getDogsCount(){
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark(){
       switch (size){
           case BIG: case VERY_BIG:
               System.out.println("WAF WAF");
               break;
           case AVERAGE:
               System.out.println("GAV DAB");
               break;
           case SMALL:
           case VERY_SMALL:
               System.out.println("Tiaf-Tiaf");
               break;
       }

    }
    public void bite(){
        if (dogsCount > 2){
            System.out.println(" укусил  CUs CUS");
        }else {
            bark();
        }

    }
}
