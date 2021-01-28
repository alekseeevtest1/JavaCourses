package com.oop.consta;


public class Main {
    public static void main(String[] args) {

        Dog.getDogsCount();

        Dog lab = new Dog();
        lab.setName("lab");
        lab.setBreed("LABbb");
        lab.setSize(Size.AVERAGE);
        lab.bark();
        lab.bite();

        Dog sheppard = new Dog();
        sheppard.setName("Ivaaaa");
        sheppard.setBreed("sheppard");
        sheppard.setSize(Size.BIG);
        sheppard.bark();
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setName("dobermanIvaaaa");
        doberman.setBreed("doberman");
        doberman.setSize(Size.BIG);
        doberman.bark();
        doberman.bite();
    }
}
