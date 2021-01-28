package com.oop.homeWork1;

public class DramaBook extends CBookCard {
    private boolean bestseller;

    public DramaBook(String autor, String zaglav, String izdat, int year, int str, int tirag) {
        super(autor, zaglav, izdat, year, str, tirag);
        if (tirag > 10000){
            bestseller = true;
        }
    }
}
