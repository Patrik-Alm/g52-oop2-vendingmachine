package se.lexicon.model;

public abstract class Product {

    int id;
    double price;
    String productName;

    public abstract String examine();

    public abstract String use();

}
