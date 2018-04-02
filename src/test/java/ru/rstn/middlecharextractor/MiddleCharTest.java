package ru.rstn.middlecharextractor;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * You are going to be given a word. Your job is to return the middle character of the word.
 * If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
 */
public class MiddleCharTest {

    private IMiddleCharExtractor extractor = new MiddleCharExtractor();

    @Test
    public void middleCharsInEvenWord() {
        Assertions.assertEquals("dd", extractor.getMiddleChar("middle"));
    }

    @Test
    public void middleCharsInOddWord() {
        Assertions.assertEquals("b", extractor.getMiddleChar("table"));
    }

    @Test
    public void middleCharsNullOrEmptyWord() {
        Assertions.assertEquals("", extractor.getMiddleChar(""));
        Assertions.assertEquals("", extractor.getMiddleChar(null));
    }

    @Test
    public void middleCharsOneChar() {
        Assertions.assertEquals("A", extractor.getMiddleChar("A"));
    }
}
