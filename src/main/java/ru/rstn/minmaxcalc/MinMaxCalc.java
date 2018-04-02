package ru.rstn.minmaxcalc;

public class MinMaxCalc implements IMinMaxCalc {
    @Override
    public int[] calcMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return new int[]{min, max};
    }
}
