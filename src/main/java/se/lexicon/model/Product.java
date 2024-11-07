package se.lexicon.model;

public abstract class Product {

    int id;
    double price;
    String productName;
    String description;
    String  characteristics;

    public abstract String examine();

    public abstract String use();

}
