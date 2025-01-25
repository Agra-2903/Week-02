package AssistedProblems.AnimalHierarchy;

//Define subclasses Dog with unique implementation of makeSound().
class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("Dog");
        System.out.println(name + " Barks");
    }
}
