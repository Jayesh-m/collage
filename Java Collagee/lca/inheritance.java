// File: InheritanceExample.java

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from the parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Public class with the same name as the f e
public class inheritance {

    public static void main(String[] args)  
        // Creating an object of the child  ass
        Dog myDog = new Dog();

        // Accessing methods from both the  rent and child class
        myDog.eat();  // Inherited from Ani l class
        myDog.bark(); // Specific to Dog cl s
    }
}
