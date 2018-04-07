package ru.rstn.number;

public class NumberPreparer implements INumberPreparer {

    @Override
    public int findLongest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int maxLength = 0;
        String maxDigits = String.valueOf(numbers[0]);
        for (int number : numbers) {
            int actualNumber = number;
            if(number<0) {
                number = number * -1;
            }
            String digits = String.valueOf(number);
            if (digits.length() > maxLength) {
                maxDigits = String.valueOf(actualNumber);
                maxLength = digits.length();
            }
        }
        return Integer.valueOf(maxDigits);
    }
}
