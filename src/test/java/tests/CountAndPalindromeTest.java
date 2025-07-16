package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import steps.CountMultiples;

import java.util.List;

public class CountAndPalindromeTest {

    CountMultiples countMultiples = new CountMultiples();

    @Test
    @Order(1)
    @DisplayName("Unsuccessful login using invalid email/password")
    public void testCountMultiples() {
        List<Integer> input = List.of(2, 4, 5, 6, 8, 12, 15);
        long result = countMultiples.countMultiples(input);
        System.out.println("Result: " + result);
    }
}
