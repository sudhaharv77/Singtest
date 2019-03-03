package com.singtel.tech.SingTechTest;

/**
 * Animal!
 * Sudhahar V
 */

public class Bird implements WalkingAnimal, Sound {

    public String walk() {
        return "I am walking";
    }

    public String makeSound() {
        return "I am singing";
    }
}
