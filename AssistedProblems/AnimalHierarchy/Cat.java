package AssistedProblems.AnimalHierarchy;

//Define subclasses Cat with unique implementation of makeSound().
class Cat extends Animal{

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("Cat");
        System.out.println(name + " meows");
    }
}
