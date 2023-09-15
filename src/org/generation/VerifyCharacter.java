package org.generation;

public class VerifyCharacter {
    public static String tipoDeDato(String str) {
        char primerChar = str.charAt(0);

        if (Character.isDigit(primerChar)) {
            return "Number";
        }
        if (Character.isUpperCase(primerChar)) {
            return "Mayus";
        }
        if (Character.isLowerCase(primerChar)) {
            return "Minus";
        }
        return "Other";
    }
}
