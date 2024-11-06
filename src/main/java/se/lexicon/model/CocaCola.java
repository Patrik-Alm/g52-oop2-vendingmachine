package se.lexicon.model;

public class CocaCola extends Product {

    String description;
    String  characteristics;

    public CocaCola () {
        this.id = 1;
        this.price = 50;
        this.productName = "Coca Cola";
        this.description = "Dark, carbonated sweet beverage with complex flavor";
        this.characteristics = "Bubbly and crisp";
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
