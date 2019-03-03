package com.singtel.tech.SingTechTest;

/**
 * Animal!
 * Sudhahar V
 */

public class Duck extends Bird implements FlyingAnimal {

    @Override
    public String makeSound() {
        return "Quack, quack";
    }

    public String fly() {
        return "I am flying";
    }

    public String swim() {
        return "I am swimming";
    }
}
