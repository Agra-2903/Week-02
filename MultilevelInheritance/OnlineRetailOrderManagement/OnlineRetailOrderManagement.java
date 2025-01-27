package MultilevelInheritance.OnlineRetailOrderManagement;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        //creating objects of superclass and subclass
        Order order = new Order("568788" , "24-01-2020");
        ShippedOrder shippedOrder = new ShippedOrder("3436565", "18-08-2024" , 674454549);
        DeliveredOrder deliveredOrder = new DeliveredOrder("4536453" , "24-01-2025", 65474, "3-02-25");
        //calling out their respective methods
        order.getOrderStatus();
        shippedOrder.getOrderStatus();
        deliveredOrder.getOrderStatus();

    }
}

