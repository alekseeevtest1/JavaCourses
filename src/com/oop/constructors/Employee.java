package com.oop.constructors;

public class Employee {

    private static int id;
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary){
        id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void rich(int salary){
        if (salary < 100){
            System.out.println("you poor");
        }else{
            System.out.println("you rich");
        }
    }
}
