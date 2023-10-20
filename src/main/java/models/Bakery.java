package models;

import interfaces.ISell;

import java.util.ArrayList;

public class Bakery implements ISell {
    private String name;
    private int till;
    protected ArrayList<Cake> stock = new ArrayList<>();
//    ArrayList<Cake> getStock();

//    private int cost; // do I delete from other classes?

    public Bakery(String name) {
        this.name = name;
        this.till = 0;
    }

    public int getTill() {
        return till;
    }

    @Override
    public int displayAvailableCakes() {
        for (Cake cake : stock) {
            cake.displayCakeInfo();
        }
        return 0;
    }

    @Override
    public void addCake(Cake cake) {
        stock.add(cake);
    }

    @Override
    public void removeCake(Cake cake) {
        stock.remove(cake);
    }

    @Override
    public void sellCake(Cake cake) {
        if (stock.contains(cake)) {
            stock.remove(cake);
            till += cake.calculateTotalCost();
        }

    }
}
