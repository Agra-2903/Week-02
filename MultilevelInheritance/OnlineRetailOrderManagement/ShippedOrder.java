package MultilevelInheritance.OnlineRetailOrderManagement;

//Create a subclass ShippedOrder with additional attributes like trackingNumber.
class  ShippedOrder extends Order{
    protected int trackingNumber;
    ShippedOrder(String orderId, String orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public void getOrderStatus(){
        System.out.println("Shipping details are :");
        super.getOrderStatus();
        System.out.println("TrackingNUmber :" +this.trackingNumber);
    }
}

