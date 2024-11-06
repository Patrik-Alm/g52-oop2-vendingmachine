package se.lexicon.model;

public interface VendingMachine {

    public void addCurrency(Amount amount);

    public int getBalance();

    public int request(Product id);

    public int endSession();

    public String getDescription(Product id);

    public String [] getProducts();

}


