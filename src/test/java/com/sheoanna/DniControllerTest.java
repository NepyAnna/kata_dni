package com.sheoanna;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DniControllerTest {
    private DNIModel mockModel;
    private DNIView mockView;
    private DniController controller;

    @BeforeEach
    void setUp() {
        mockModel = mock(DNIModel.class);
        mockView = mock(DNIView.class);
        controller = new DniController(mockModel, mockView);
    }

    @Test
    void testStart() {
        when(mockView.askForDniNumber()).thenReturn("999999999", "12345678");
        when(mockModel.calculateDniLetter()).thenReturn('M');    

        controller.start();

        verify(mockView, times(2)).askForDniNumber(); 
        verify(mockView, times(1)).showError("Number is out of range. Please try again.");
        verify(mockModel, times(1)).setDniNumber(12345678);
        verify(mockModel, times(1)).calculateDniLetter();
        verify(mockView, times(1)).showDniLetter(12345678, 'M');
    }
}
