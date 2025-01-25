package AssistedProblems.AnimalHierarchy;

// Define a superclass Animal with attributes name and age, and a method makeSound().
class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void makeSound(){
        System.out.print("Animal: ");
    }
}
