package models;

public class ChocolateCake extends Cake{
    private String filling;

    public ChocolateCake(String name, String baseFlour, int cost, String filling){
        super(name, baseFlour, cost);
        this.filling = filling;
    }
// do I still need this?
    public String getFilling() {
        return filling;
    }
    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    void displayCakeInfo(){
        System.out.println("The Flavour: " + name);
        System.out.println("Base Flour: " + baseFlour);
        System.out.println("Cost: £" + cost);
        System.out.println("Filling: " + filling);
    }

}
