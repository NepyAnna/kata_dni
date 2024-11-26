package com.sheoanna;

public class DniController {
    private DNIModel model;
    private DNIView view;

    public DniController(DNIModel model, DNIView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        boolean isValid = false;
        int dniNumber = -1;

        while (!isValid) {
            String input = view.askForDniNumber();

            if (InputValidator.isNumeric(input)) {
                dniNumber = Integer.parseInt(input);

                if (InputValidator.isInRange(dniNumber)) {
                    isValid = true;
                } else {
                    view.showError("Number is out of range. Please try again.");
                }
            } else {
                view.showError("Invalid input. Please enter a numeric value.");
            }
        }
        model.setDniNumber(dniNumber);
        char dniLetter = model.calculateDniLetter();
        view.showDniLetter(dniNumber, dniLetter);
    }
}