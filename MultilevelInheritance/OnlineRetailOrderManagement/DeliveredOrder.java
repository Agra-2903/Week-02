package MultilevelInheritance.OnlineRetailOrderManagement;

//Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
class DeliveredOrder extends ShippedOrder{
    protected String deliveryDate;
    DeliveredOrder(String orderId, String orderDate,int trackingNumber, String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public void getOrderStatus(){
        System.out.println("Delivering Details are :");
        super.getOrderStatus();
        System.out.println("Delivery Date :" +this.deliveryDate);
    }
}

