package com.oop;

public class Main {
    public static void main(String[] args) {

        Dog.getDogsCount();

        Dog lab = new Dog();
        lab.setPaws(4);
        lab.setTail(1);
        lab.setName("lab");
        lab.setBreed("LABbb");
        lab.setSize("average");
        lab.bark();
        lab.bite();

        Dog sheppard = new Dog();
        sheppard.setPaws(4);
        sheppard.setTail(1);
        sheppard.setName("Ivaaaa");
        sheppard.setBreed("sheppard");
        sheppard.setSize("big");
        sheppard.bark();
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setPaws(4);
        doberman.setTail(1);
        doberman.setName("dobermanIvaaaa");
        doberman.setBreed("doberman");
        doberman.setSize("big");
        doberman.bark();
        doberman.bite();
    }
}
