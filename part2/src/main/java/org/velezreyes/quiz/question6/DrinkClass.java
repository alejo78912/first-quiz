package org.velezreyes.quiz.question6;

public class DrinkClass implements Drink {
    private String name;
    private int priceInCents;
    private boolean isFizzy;

    public DrinkClass(String name, int priceInCents, boolean isFizzy) {
        this.name = name;
        this.priceInCents = priceInCents;
        this.isFizzy = isFizzy;
    }

    public String getName() {
        return name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public boolean isFizzy() {
        return isFizzy;
    }
}
