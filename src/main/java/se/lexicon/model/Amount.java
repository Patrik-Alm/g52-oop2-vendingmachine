package se.lexicon.model;

public enum Amount {

    ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100), TWOHUNDRED(200), FIVEHUNDRED(500), ONETOUSEND(1000);

    int amount;
    private Amount(int amount) {
    }
}
