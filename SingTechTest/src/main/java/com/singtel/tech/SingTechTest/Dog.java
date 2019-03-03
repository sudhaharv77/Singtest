package com.singtel.tech.SingTechTest;

/**
 * Animal!
 * Sudhahar V
 */

public class Dog implements WalkingAnimal, Sound {

    public String walk() {
        return "I am walking";
    }

    public String makeSound() {
        return "Woof, woof";
    }
}
