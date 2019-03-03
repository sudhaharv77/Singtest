package com.singtel.tech.SingTechTest;

/**
 * Rooster!
 * Sudhahar V
 */

public class Rooster extends Chicken {

    public String makeSound() {
        return "Cock-a-doodle-doo";
    }

    public String makeSound(String language) {
        return SoundTranslator.translate("Cock-a-doodle-doo", language);
    }
}
