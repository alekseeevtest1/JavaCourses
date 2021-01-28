package com.oop;

public class Dog {

    private static int dogsCount;

    private int paws;
    private int tail;
    private String name;
    private String breed;
    private String size;

    public Dog(){
        dogsCount++;
    }

    public static int getDogsCount(){
        return dogsCount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("big" )|| size.equalsIgnoreCase("average" )
                || size.equalsIgnoreCase("small")) {
            this.size = size;
        }else {
            System.out.println("no");
        }
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        }else {
            System.out.println("no");
        }
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        }else {
            System.out.println("no");
        }
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
        if (size.equalsIgnoreCase("big")){
            System.out.println("VAF VAF");
        }else if(size.equalsIgnoreCase("average")){
            System.out.println("Gav Gav");
        }else {
            System.out.println("taf taf");
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
