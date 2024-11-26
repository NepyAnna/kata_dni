package com.sheoanna;

import java.util.Scanner;

public class DNIView {
    private Scanner scanner = new Scanner(System.in);

    public String askForDniNumber() {
        System.out.println("Enter your DNI number (0-99999999): ");
        return scanner.nextLine();
    }

    public void showDniLetter(int dniNumber, char dniLetter) {
        System.out.println("The letter for DNI " + dniNumber + " is: " + dniLetter);
    }
    
}
