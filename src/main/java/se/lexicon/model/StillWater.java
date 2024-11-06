package se.lexicon.model;

public class StillWater extends Product{

    String description;
    String characteristics;

    public StillWater () {
        this.id = 6;
        this.price = 10;
        this.productName = "Still water";
        this.description = "Light colored smoth beverage with natural flavor";
        this.characteristics = "Cooling and hydrating";
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
