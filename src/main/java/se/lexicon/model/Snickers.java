package se.lexicon.model;

public class Snickers extends Product {



    public Snickers () {
        this.id = 5;
        this.price = 100;
        this.productName = "Snickers";
        this.description = "Milk chocolate encased bar with nougat topped with caramel and peanuts";
        this.characteristics = "Sinful with a sweet energy kick";
    }

    @Override
    public String use() {
        return this.productName;
    }
}
