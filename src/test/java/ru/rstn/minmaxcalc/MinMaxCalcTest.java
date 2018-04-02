package ru.rstn.minmaxcalc;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Write a function that returns both the minimum and maximum number of the given list/array.
 */
public class MinMaxCalcTest {
    private IMinMaxCalc calc = new MinMaxCalc();

    @Test
    public void minMax() {
        int[] array = {5, 3, -29, 16, -3, 50, 3};
        assertArrayEquals(new int[]{-29, 50}, calc.calcMinMax(array));

        assertArrayEquals(new int[]{5,5},calc.calcMinMax(new int[]{5}));
    }
}
