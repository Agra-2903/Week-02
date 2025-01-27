package MultilevelInheritance.OnlineRetailOrderManagement;

//Create a multilevel hierarchy to manage orders, where Order is the base class,
// ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
//Define a base class Order with common attributes like orderId and orderDate.
//Implement a method getOrderStatus() to return the current order status based on the class level.
class Order{
    protected String orderId;
    protected String orderDate;
    Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public void getOrderStatus(){
        System.out.println("OrderId :" +this.orderId);
        System.out.println("OrderDate :" +this.orderDate);
    }
}

