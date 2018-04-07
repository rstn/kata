package ru.rstn.number;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberPreparerTest {
    private INumberPreparer preparer = new NumberPreparer();

    @Test
    public void nullOrEmptyMaxDigits() {
        assertEquals(0, preparer.findLongest(null));
        assertEquals(0, preparer.findLongest(new int[0]));
    }

    @Test
    public void maxDigits() {
        assertEquals(100, preparer.findLongest(new int[]{5, 100, 99}));
        assertEquals(-100, preparer.findLongest(new int[]{-100, 100, 99}));
    }
}
