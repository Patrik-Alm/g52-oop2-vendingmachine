package se.lexicon.model;

public class Snickers extends Product {

    String description;
    String characteristics;

    public Snickers () {
        this.id = 5;
        this.price = 100;
        this.productName = "Snickers";
        this.description = "Milk chocolate encased bar with nougat topped with caramel and peanuts";
        this.characteristics = "Sinful with a sweet energy kick";
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
