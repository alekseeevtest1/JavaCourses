package com.oop.oopPartOne;

public class DogsRunner {
    public static void main(String[] args) {
        DogClass dog1 = new DogClass();
        dog1.setName("bobik");
        dog1.setPaws(4);
        dog1.setSize(Size.AVARAGE);
        dog1.setBreed("labrador");
        dog1.bark(dog1.getSize());
        dog1.bite();

        DogClass dog2 = new DogClass();
        dog2.setName("bobik");
        dog2.setPaws(4);
        dog2.setSize(Size.SMALL);
        dog2.setBreed("labrador");
        dog2.bark(dog2.getSize());
        dog2.bite();

        DogClass dog3 = new DogClass();
        dog3.setName("bobik");
        dog3.setPaws(4);
        dog3.setSize(Size.MAX);
        dog3.setBreed("labrador");
        dog3.bark(dog3.getSize());
        dog3.bite();

        DogClass dog4 = new DogClass();
        dog4.setName("bobik");
        dog4.setPaws(4);
        dog4.setSize(Size.AVARAGE);
        dog4.setBreed("labrador");
        dog4.bark(dog4.getSize());
        dog4.bite();


    }
}
