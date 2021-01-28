package com.oop.homeWork1;

public class CBookCard {
    private String autor;
    private String zaglav;
    private String izdat;
    private int year;
    private int str;
    private int tirag;
    private int reyt;
    private String comment;

    public CBookCard(String autor, String zaglav, String izdat, int year, int str, int tirag) {
        this.autor = autor;
        this.zaglav = zaglav;
        this.izdat = izdat;
        this.year = year;
        this.str = str;
        this.tirag = tirag;
    }

    public String getAutor() {
        return autor;
    }

    public String getZaglav() {
        return zaglav;
    }

    public String getIzdat() {
        return izdat;
    }

    public int getYear() {
        return year;
    }

    public int getStr() {
        return str;
    }

    public int getTirag() {
        return tirag;
    }

    public int getReyt() {
        return reyt;
    }

    public String getComment() {
        return comment;
    }


    public void setReyt(int reyt) {
        this.reyt = reyt;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void bestselller(boolean bestseller){
        if (bestseller){


        }
    }
}
