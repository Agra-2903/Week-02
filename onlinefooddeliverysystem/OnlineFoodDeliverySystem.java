package onlinefooddeliverysystem;

import java.util.*;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        ArrayList<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 200.0, 2));
        order.add(new NonVegItem("Chicken Curry", 300.0, 1));

        double totalOrderCost = 0.0;

        for (FoodItem item : order) {
            System.out.println("----------------------------------");
            item.getItemDetails();
            double itemTotalPrice = item.calculateTotalPrice();
            System.out.println("Total Price: " + itemTotalPrice);

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(10.0); // Applying 10% discount
                System.out.println(discountable.getDiscountDetails());
            }

            totalOrderCost += item.calculateTotalPrice();
        }

        System.out.println("----------------------------------");
        System.out.println("Total Order Cost: " + totalOrderCost);
    }
}
