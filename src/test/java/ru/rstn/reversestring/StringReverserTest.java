package ru.rstn.reversestring;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


/**
 * Complete the solution so that it reverses the string value passed into it.
 * </p>
 * {@code Kata.solution("world") //return "dlrow"}
 */
public class StringReverserTest {

    private IStringReverser reverser = new StringReverser();

    @Test
    public void sampleTest() {
        System.out.println("Hello world");
    }

    @Test
    public void emptyAndNullReverse() {
        String res = reverser.reverse(null);
        assertNull(res);
        assertEquals("", reverser.reverse(""));
    }

    @Test
    public void wordReverse() {
        String source = "world";
        assertEquals("dlrow", reverser.reverse(source));

        source = "  world ";
        assertEquals("dlrow", reverser.reverse(source));
    }

    @Test
    public void sentenceReverse() {
        String source = "hello world";

        assertEquals("dlrow olleh", reverser.reverse(source));

        source = "  Hello World  ";
        assertEquals("dlroW olleH", reverser.reverse(source));
    }

    @Test
    public void randomReverse() {
        String source = "[ ]klv7!x8";
        assertEquals("8x!7vlk] [", reverser.reverse(source));
    }
}
