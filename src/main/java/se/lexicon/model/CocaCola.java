package se.lexicon.model;

public class CocaCola extends Product {

    public CocaCola() {
        this.id = 1;
        this.price = 50;
        this.productName = "Coca Cola";
        this.description = "Dark, carbonated sweet beverage with complex flavor";
        this.characteristics = "Bubbly and crisp";
    }


    @Override
    public String use() {
        return this.productName;
    }
}
