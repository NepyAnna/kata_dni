package com.sheoanna;

public class DNIModel {
    int dniNumber;

    public DNIModel(int number) {
        this.dniNumber = number;
    }

    public int getDniNumber() {
        return dniNumber;
    }

    public void setDniNumber(int dniNumber) {
        this.dniNumber = dniNumber;
    }

    public char calculateDniLetter() {
        final char[] LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int letterPosition = dniNumber % 23;
        return LETTERS[letterPosition];
    }
}
