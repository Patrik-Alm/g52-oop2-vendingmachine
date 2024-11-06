package se.lexicon.model;

public class Sprite extends Product {

    String description;
    String characteristics;

    public Sprite () {
        this.id = 3;
        this.price = 50;
        this.productName = "Sprite";
        this.description = "Light colored carbonated sweet beverage with fruit flavor";
        this.characteristics = "Bubbly and fruity";
    }

    @Override
    public String examine() {
        StringBuilder sb = new StringBuilder();

        sb.append(System.lineSeparator());
        sb.append("Product id: ");
        sb.append(this.id);
        sb.append(System.lineSeparator());
        sb.append("Product name: ");
        sb.append(this.productName);
        sb.append(System.lineSeparator());
        sb.append("Description: ");
        sb.append(this.description);
        sb.append(System.lineSeparator());
        sb.append("Characteristics: ");
        sb.append(this.characteristics);
        sb.append(System.lineSeparator());
        sb.append("Product price: ");
        sb.append(this.price);
        sb.append(System.lineSeparator());

        return sb.toString();
    }

    @Override
    public String use() {
        return this.productName;
    }
}
