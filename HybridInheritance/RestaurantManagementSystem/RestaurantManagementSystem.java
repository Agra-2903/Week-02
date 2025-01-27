package HybridInheritance.RestaurantManagementSystem;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        //creating objects of subclass
        Chef chef = new Chef("James", 78339);
        Waiter waiter = new Waiter("Boony", 67363);
        //calling out their respective methods
        chef.performDuties();
        waiter.performDuties();
    }

}
