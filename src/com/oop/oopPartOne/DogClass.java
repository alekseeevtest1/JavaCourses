package com.oop.oopPartOne;

public class DogClass {
   private int paws;
    private String name;
   private int tail;
   private Size size;
   private String breed;

   public static int dogCount;

    DogClass(){
        dogCount++;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Size getSize() {
        return size;
    }



    public void setSize(Size size) {
        this.size = size;

    }

    public  int getDogCount() {
        return dogCount;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        }else {
            this.paws = 4;
            System.out.println("только 4 лапы");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public void bite(){
        if (DogClass.dogCount > 3){
            System.out.println("Собака вас кусает");
        }else {
            System.out.println("собака лает");
        }

    }

    public void bark(Size size){
        switch (size){
            case MAX :
                System.out.println("GAV GAV GAVV");
                break;
            case AVARAGE:
                System.out.println("VAF VAF");
                break;
            case SMALL:
                System.out.println("tiaf tiaf");
                break;
        }
    }

}
