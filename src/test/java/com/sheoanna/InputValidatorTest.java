package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputValidatorTest {
    InputValidator validator;
    @BeforeEach
    public void setUp() {
        validator = new InputValidator();
    }
    
    @Test
    void testIsInRange() {
        int expectedInput = 999999;
        int expectedInput2 = -1;

        assertTrue(validator.isInRange(expectedInput));
        assertFalse(validator.isInRange(expectedInput2));
    }

    @Test
    void testIsNumeric() {
        String expectedInput = "w";
        String expectedInput2 = "3";
        String expectedInput3 = "-3";

        assertFalse(validator.isNumeric(expectedInput));
        assertTrue(validator.isNumeric(expectedInput2));
        assertTrue(validator.isNumeric(expectedInput3));
    }
}
