package ECommercePlatform;

// Create Clothing class extending Product class and implementing Taxable interface
class Clothing extends Product implements Taxable{
    private double discountPercent;
    private double tax;

    public Clothing(String id, String name, double price, double percent){
        super(id, name, price);
        this.discountPercent = percent;
    }

    @Override
    public void calculateTax(double percent) {
        this.tax = (getPrice() * percent) / 100;
    }

    @Override
    public double getTaxDetails() {
        return tax;
    }

    @Override
    double calculateDiscount() {
        return (getPrice() * discountPercent) / 100;
    }

    void finalPrice(){
        setPrice(tax, calculateDiscount());
    }
}
