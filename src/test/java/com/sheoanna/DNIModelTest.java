package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DNIModelTest {
    DNIModel model;
    char letter;

    @BeforeEach
    public void setUp(){
        model = new DNIModel(2);
        letter = model.calculateDniLetter();
    }
    @Test
    void testCalculateDniLetter() {
        assertEquals('W', letter);
    }

    @Test
    void testGetDniNumber() {
        assertEquals(2, model.getDniNumber());
    }

    @Test
    void testSetDniNumber() {
         model.setDniNumber(3);
        assertEquals(3, model.getDniNumber());
    }
}
