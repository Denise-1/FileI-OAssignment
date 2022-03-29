package com.company;

public class Label {
    int id, countItem, supplyLevel;      // ID for each product, numbers of items, how many needed to keep in stock
    double price;

    Label(){
    }

    Label(int id2, int countItem2, int supplyLevel2, double price2){
        this.id = id2;
        this.countItem = countItem2;
        this.supplyLevel = supplyLevel2;
        this.price = price2;
    }

    public int getId() {
        return id;
    }
}