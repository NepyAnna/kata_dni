package com.sheoanna;

import java.util.Scanner;

public final class App {
    private App() {
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int dniNumber = -1;
            boolean isValid = false;

            while (!isValid) {
                System.out.println("Enter your DNI number (0-99999999): ");
                String input = scanner.nextLine();
                    if (InputValidator.isInRange(dniNumber)) {
                        dniNumber = Integer.parseInt(input);
                        isValid = true;
                    } else {
                        System.out.println("Invalid input. Please enter a numeric value.");
                    }
                }
            char dniLetter = DniCalculator.calculateDniLetter(dniNumber);
            System.out.println("The letter for DNI " + dniNumber + " is: " + dniLetter);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
