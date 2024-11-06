package se.lexicon.model;

public class Crisps extends Product {

    String description;
    String characteristics;

    public Crisps () {
        this.id = 4;
        this.price = 20;
        this.productName = "Crisps";
        this.description = "Salted crispy deep fried potato slices";
        this.characteristics = "Crackling salty and delicious";
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
