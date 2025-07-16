package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import steps.CountMultiples;
import steps.Palindrome;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CountAndPalindromeTest {

    CountMultiples countMultiples = new CountMultiples();

    @Test
    @DisplayName("Unsuccessful login using invalid email/password")
    public void testCountMultiples() {
        List<Integer> input = List.of(2, 4, 5, 6, 8, 12, 15);
        long result = countMultiples.countMultiples(input);
        System.out.println("Result: " + result);
    }

    @Test
    @DisplayName("Check palindrome logic with valid and invalid cases")
    public void testIsPalindrome() {
        // valid palindrome
        assertTrue(Palindrome.isPalindrome("Racecar"));

        // with spaces and punctuation — still a palindrome
        assertTrue(Palindrome.isPalindrome("Was it a car or a cat I saw?"));

        // regular string — not a palindrome
        assertFalse(Palindrome.isPalindrome("Hello"));
    }
}
