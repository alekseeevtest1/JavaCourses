package com.oop.oopPartOne;

public enum Size {
    MAX("большая"), AVARAGE("средняя"), SMALL("малая");

    Size(String abrevation){
        this.abrevation = abrevation;
    }

    private String abrevation;

    public String getAbrevation() {
        return abrevation;
    }
}
