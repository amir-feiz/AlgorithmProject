package com.company.models;

public class Carpet {

    GFGGraph myCarpet;
    int price;
    int weigh;
    int count = 1;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Carpet(int price, int weigh) {
        this.price = price;
        this.weigh= weigh;
    }

    public GFGGraph getMyCarpet() {
        return myCarpet;
    }

    public void setMyCarpet(GFGGraph myCarpet) {
        this.myCarpet = myCarpet;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }
}
