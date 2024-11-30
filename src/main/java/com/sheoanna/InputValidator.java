package com.sheoanna;

public class InputValidator {
    public static boolean isNumeric(String input) {
<<<<<<< HEAD
    if (input == null || input.isEmpty()) {
        return false;
    }

    int start = 0;
        if (input.charAt(0) == '-') {
            start = 1;
        }

=======
        if (input == null || input.isEmpty()) {
            return false;
        }
        int start = 0;
        if (input.charAt(0) == '-') {
            start = 1;
        }
>>>>>>> feature/MVVmC
        for (int i = start; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
<<<<<<< HEAD
    }
    return true;
}

=======
        }
        return true;
    }
>>>>>>> feature/MVVmC
    public static boolean isInRange(int number) {
        return number >= 0 && number <= 99999999;
    }
}
