package HybridInheritance.RestaurantManagementSystem;

//Define subclasses Chef  that inherit from Person1 each providing a unique implementation of performDuties().
class Chef extends Person implements Worker{
    Chef(String name, int id){
        super(name,id);
    }
    public void performDuties(){
        System.out.println("Chef is cooking food");
    }
}

