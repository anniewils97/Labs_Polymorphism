package models;

public class CarrotCake extends Cake {
    private boolean isHealthier;
    private String topping;

    public CarrotCake(String name, String baseFlour, int cost, boolean isHealthier, String topping){
        super(name, baseFlour, cost);
        this.isHealthier = isHealthier;
        this.topping = topping;
    }

    public boolean isHealthier() {
        return this.isHealthier;
    }

    public String hasTopping() {
        return this.topping;
    }

    @Override
    void displayCakeInfo() {
        System.out.println("The Flavour: " + name);
        System.out.println("Base Flour: " + baseFlour);
        System.out.println("Cost: £" + cost);
        System.out.println("Healthier: " + isHealthier);
        System.out.println("Topping: " + topping);
    }
}
