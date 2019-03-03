package com.singtel.tech.SingTechTest;

/**
 * SoundTranslator!
 * Sudhahar V
 */

public class SoundTranslator {

    public static String translate(String sound, String temp) {
        if (!sound.equals("Cock-a-doodle-doo")) {
            System.out.println("Unable to translate sound: " + sound); // Proper exception handling needed.
            return sound;
        }

        switch (temp) {
            case "French":
                return "kuklooku";
            default:
                System.out.println("Unable to translate to: " + temp); // Proper exception handling needed.
                return sound;
        }
    }

}
