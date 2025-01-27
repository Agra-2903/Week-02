package HybridInheritance.RestaurantManagementSystem;

//Define subclasses Waiter that inherit from Person1 and implement the Worker interface, each providing a unique implementation of performDuties().
class Waiter extends Person implements Worker{
    Waiter(String name, int id){
        super(name,id);
    }
    public void performDuties(){
        System.out.println("Waiter is serving food");
    }
}

