package ECommercePlatform;

public class ECommercePlatform {
    public static void main(String[] args) {

        // Creating objects of the Electronics, Clothing and Groceries classes
        Electronics elec = new Electronics("EL645", "Realme narzo 70 pro", 21469, 10.5);
        elec.calculateTax(15.8);

        Clothing cloth = new Clothing("CL154", "Cardigan", 1024, 15.3);
        cloth.calculateTax(4.3);

        Groceries grocery = new Groceries("GR165", "Sugar 5Kg", 126, 2.4);
        grocery.calculateTax(1.6);

        // Display details and perform operations on various products
        elec.displayDetails();
        System.out.println("Payable tax: " + elec.getTaxDetails());
        elec.finalPrice();
        elec.displayDetails();

        cloth.displayDetails();
        System.out.println("Payable tax: " + cloth.getTaxDetails());
        cloth.finalPrice();
        cloth.displayDetails();

        grocery.displayDetails();
        System.out.println("Payable tax: " + grocery.getTaxDetails());
        grocery.finalPrice();
        grocery.displayDetails();
    }
}
