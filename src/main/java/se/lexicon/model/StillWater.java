package se.lexicon.model;

public class StillWater extends Product{



    public StillWater () {
        this.id = 6;
        this.price = 10;
        this.productName = "Still water";
        this.description = "Light colored smoth beverage with natural flavor";
        this.characteristics = "Cooling and hydrating";
    }



    @Override
    public String use() {

        return this.productName;
    }

}
