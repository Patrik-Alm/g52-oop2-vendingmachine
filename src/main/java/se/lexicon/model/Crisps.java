package se.lexicon.model;

public class Crisps extends Product {


    public Crisps () {
        this.id = 4;
        this.price = 20;
        this.productName = "Crisps";
        this.description = "Salted crispy deep fried potato slices";
        this.characteristics = "Crackling salty and delicious";
    }


    @Override
    public String use() {
        return this.productName;
    }
}
