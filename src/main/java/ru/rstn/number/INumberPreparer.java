package ru.rstn.number;

public interface INumberPreparer {

    /**
     * Find the number with the most digits.
     *
     * If two numbers in the argument array have the same number of digits, return the first one in the array.
     *
     * @param numbers array of integers
     * @return number with the most digits
     */
    int findLongest(int[] numbers);
}
