package se.lexicon.model;

public class Sprite extends Product {



    public Sprite () {
        this.id = 3;
        this.price = 50;
        this.productName = "Sprite";
        this.description = "Light colored carbonated sweet beverage with fruit flavor";
        this.characteristics = "Bubbly and fruity";
    }



    @Override
    public String use() {
        return this.productName;
    }
}
