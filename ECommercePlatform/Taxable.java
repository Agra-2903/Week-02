package ECommercePlatform;

// Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories
interface Taxable {
    void calculateTax(double percent);

    double getTaxDetails();
}
