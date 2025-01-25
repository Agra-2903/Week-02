package AssistedProblems.AnimalHierarchy;

public class AnimalHierarchy {
    public static void main(String[] args) {

        // Creating object of each subclasses using reference of superclass
        Animal dog = new Dog("Tuffy", 5);
        Animal cat = new Cat("Kitty", 6);
        Animal bird = new Bird("Meena", 3);

        // Calling overrided makeSound() method for every suitable object
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
