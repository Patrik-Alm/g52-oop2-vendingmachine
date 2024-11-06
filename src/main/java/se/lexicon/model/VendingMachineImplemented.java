package se.lexicon.model;

public class VendingMachineImplemented implements VendingMachine {

    static Product[] products = new Product[0];
    static int depositPool;


    public VendingMachineImplemented(Product products) {


    }

    @Override
    public void addCurrency(Amount amount) {

        depositPool = amount.getAmount();
    }

    @Override
    public int getBalance() {

        return depositPool;
    }

    @Override
    public Product request(int id) {

        for (int i = 0; i < products.length; i++) {

            if (id == products[i].id) {

                if (products[i].price < depositPool) {

                    return products[i];

                } else {

                    return null;
                }

            }
        }
        return null;
    }

    @Override
    public int endSession() {
        int change = this.getBalance();
        depositPool = 0;
        return change;
    }

    @Override
    public String getDescription(int id) {

        for (int i = 0; i < products.length; i++) {

            if (id == products[i].id) {

                return products[i].examine();
            }
        }
        return null;
    }


    @Override
    public String[] getProducts() {

        String tempProduct;
        String[] stringProducts = new String[products.length];

        for (int i = 0; i < products.length; i++) {

            tempProduct = products[i].id + ", " + products[i].productName + ", " + products[i].price;

            stringProducts[i] = tempProduct;
        }
        return stringProducts;
    }
}

