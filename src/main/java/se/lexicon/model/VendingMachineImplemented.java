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
        // Or better a message with product not found
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

                StringBuilder sb = new StringBuilder();

                sb.append(System.lineSeparator());
                sb.append("Product id: ");
                sb.append(products[i].id);
                sb.append(System.lineSeparator());
                sb.append("Product name: ");
                sb.append(products[i].productName);
                sb.append(System.lineSeparator());
                sb.append("Description: ");
                sb.append(products[i].description);
                sb.append(System.lineSeparator());
                sb.append("Characteristics: ");
                sb.append(products[i].characteristics);
                sb.append(System.lineSeparator());
                sb.append("Product price: ");
                sb.append(products[i].price);
                sb.append(System.lineSeparator());

                return sb.toString();
            }
        }
        return null;
    }

    @Override
    public int getBalance() {

        return depositPool;
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

