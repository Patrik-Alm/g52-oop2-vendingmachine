package se.lexicon.model;

public class VendingMachineImplemented implements VendingMachine {

    @Override
    public void addCurrency(Amount amount) {

    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public int request(Product id) {
        return 0;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(Product id) {
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
