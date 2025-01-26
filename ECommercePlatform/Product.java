package ECommercePlatform;

// Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount()
abstract class Product {
    private String productId;
    String name;
    private double price;

    public Product(String id, String name, double price){
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    String getProductId(){
        return this.productId;
    }

    void setProductId(String id){
        this.productId = id;
    }

    double getPrice(){
        return this.price;
    }

    void setUpdatedPrice(double pr){
        this.price = pr;
    }

    void setPrice(double tax, double discount){
        this.price = price + tax - discount;
    }

    abstract double calculateDiscount();

    void displayDetails(){
        System.out.printf("%-8s%-20s%-10.2f%n", productId, name, price);
    }
}
