package se.lexicon.model;

public class Fanta extends Product {



    public Fanta () {
        this.id = 2;
        this.price = 50;
        this.productName = "Fanta";
        this.description = "Orange, carbonated sweet beverage with orange flavor";
        this.characteristics = "Bubbly and smooth";
    }


    @Override
    public String use() {
        return this.productName;
    }
}
