package onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable{
    private double newPrice = 0.0;

    public VegItem(String name, double price, int quantity){
        super(name, price, quantity);
    }

    public double calculateTotalPrice(){
        return getPrice() * getQuantity();
    }

    public void applyDiscount(double discount){
        newPrice = (calculateTotalPrice() * discount) / 100;
    }

    public double getDiscountDetails(){
        return newPrice;
    }
}
