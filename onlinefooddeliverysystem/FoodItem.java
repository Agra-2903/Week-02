package onlinefooddeliverysystem;

public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int quantity){
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails(){
        System.out.printf("%-25s%-8.2f%-4d%n", itemName, price, quantity);
    }
}
