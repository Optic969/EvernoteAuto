package tests;

import task_1_1.ArrayValidator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayValidatorTest {

    @Test
    public void mixedNumbersTest() {
        List<Integer> input = Arrays.asList(3, 4, 6, 8, 9, 12, 15);
        int expected = 4;
        assertEquals(expected, ArrayValidator.count(input));
    }

    @Test
    public void onlyMultiplesOf4Or6Test() {
        List<Integer> input = Arrays.asList(4, 6, 12, 24, 36);
        int expected = 5;
        assertEquals(expected, ArrayValidator.count(input));
    }

    @Test
    public void noMultiplesOf4Or6Test() {
        List<Integer> input = Arrays.asList(1, 3, 5, 7, 11);
        int expected = 0;
        assertEquals(expected, ArrayValidator.count(input));
    }

    @Test
    public void withEmptyArrayTest() {
        List<Integer> input = Arrays.asList();
        int expected = 0;
        assertEquals(expected, ArrayValidator.count(input));
    }

    @Test
    public void negativeNumbersTest() {
        List<Integer> input = Arrays.asList(-4, -6, -8, -9, -12);
        int expected = 4;
        assertEquals(expected, ArrayValidator.count(input));
    }

    @Test
    public void zeroTest() {
        List<Integer> input = Arrays.asList(0);
        int expected = 1;
        assertEquals(expected, ArrayValidator.count(input));
    }
}