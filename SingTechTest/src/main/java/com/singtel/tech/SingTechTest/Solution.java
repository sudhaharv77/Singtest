package com.singtel.tech.SingTechTest;

/**
 * Solution!
 * Sudhahar V
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Bird(), // Walk (Not all birds fly)
                new Duck(), // Fly, Walk
                new Chicken(), // Walk
                new Rooster(), // Walk
                new Parrot(), // Fly, Walk
                new Fish(), // Swim
                new Shark(), // Swim
                new Clownfish(), // Swim
                new Dolphin(), // Swim
                // new Frog(), // Don't have a frog class.
                new Dog(), // Walk, Sound
                new Butterfly(), // Fly
                new Cat() // Walk, Sound
        };

        List<Object> flyingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof FlyingAnimal)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<Object> walkingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof WalkingAnimal)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> singingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Sound())
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> swimmingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof SwimmingAnimal)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        System.out.println("List contains...");
        System.out.println(" -> " + flyingAnimals.size() + " flying animals (not all birds fly) " + flyingAnimals);
        System.out.println(" -> " + walkingAnimals.size() + " walking animals " + walkingAnimals);
        System.out.println(" -> " + singingAnimals.size() + " singing animals or animals that make sounds " + singingAnimals);
        System.out.println(" -> " + swimmingAnimals.size() + " swimming animals " + swimmingAnimals);
    }
}
