package com.oop.constructors;

public class ConstructorMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", "IT", 2000);
        emp1.rich(emp1.getSalary());
    }
}
