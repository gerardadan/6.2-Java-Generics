package org.ex2;

import org.Person;

public class Main {
    public static void main(String[] args) {
        executeGenericMethods();
    }

    private static void executeGenericMethods() {
        Person persona = new Person("Gerard", 32);
        String color = "Blue";
        int number = 23;

        try {
            new GenericMethods(persona, color, number);

        } catch (Exception e) {
            System.out.println("An error occurred during execution: " + e.getMessage());
        }

    }
}