package onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable{
    private double newPrice = 0.0;

    public NonVegItem(String name, double price, int quantity){
        super(name, price, quantity);
    }

    public double calculateTotalPrice(){
        return (getPrice() + 55) * getQuantity();
    }

    public void applyDiscount(double discount){
        newPrice = (calculateTotalPrice() * discount) / 100;
    }

    public double getDiscountDetails(){
        return newPrice;
    }
}
