package com.sheoanna;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scanner = new Scanner(System.in);
        int dniNumber = -1;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Enter your DNI number (0-99999999): ");
            String input = scanner.nextLine();

            if (InputValidator.isNumeric(input)) {
                dniNumber = Integer.parseInt(input);
                if (InputValidator.isInRange(dniNumber)) {
                    isValid = true; // Valid input, exit loop
                } else {
                    System.out.println("Number is out of range. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }

        char dniLetter = DniCalculator.calculateDniLetter(dniNumber);
        System.out.println("The letter for DNI " + dniNumber + " is: " + dniLetter);
=======
        System.out.println("Welcome to the DNI Calculator!");
        System.out.println("------------------------------");

        DNIView view = new DNIView();
        DNIModel model = new DNIModel(0);
        DniController controller = new DniController(model, view);

        controller.start();
>>>>>>> feature/MVVmC
    }
}