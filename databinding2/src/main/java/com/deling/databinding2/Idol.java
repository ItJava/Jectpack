package com.deling.databinding2;

public class Idol {

    public String name;
    public int star;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public Idol(String name, int star) {
        this.name = name;
        this.star = star;
    }

}
