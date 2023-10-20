package models;

public abstract class Cake{
     protected String name;
     protected String baseFlour;
    protected int cost;

    public Cake(String name, String baseFlour, int cost){
        this.name = name;
        this.baseFlour = baseFlour;
        this.cost = cost;
    }

    abstract void displayCakeInfo();
    int calculateTotalCost(){
        return cost;
    }


    public String getName(){
        return this.name;
    }

    public String getBaseFlour(){
        return this.baseFlour;
    }

    public int getCost(){
        return this.cost;
    }

//    @Override
//
//    public  String setUp(){
//        return name + " (Base Flour: " + ", Cost: £" + cost + ")";
//    }

}
