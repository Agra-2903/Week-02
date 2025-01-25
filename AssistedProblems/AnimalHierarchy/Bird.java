package AssistedProblems.AnimalHierarchy;

//Define subclasses Bird with unique implementation of makeSound().
class Bird extends Animal{

    public Bird(String name, int age){
        super(name, age);
    }

    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("Bird");
        System.out.println(name + " chirps");
    }
}
