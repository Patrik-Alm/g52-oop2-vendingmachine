package se.lexicon.model;

public enum Amount {

    ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50), ONEHUNDRED(100), TWOHUNDRED(200), FIVEHUNDRED(500), ONETHOUSEND(1000);

    int amount;

    Amount(int amount) {

        this.amount = amount;
    }

    public int getAmount() {

        return this.amount;
    }
}
