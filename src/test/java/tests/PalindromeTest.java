package tests;

import org.junit.jupiter.api.Test;
import task_1_1.PalindromeValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    void basicPalindromeTest() {
        assertTrue(PalindromeValidator.isPalindrome("madam"));
    }

    @Test
    void mixedCasePalindromeTest() {
        assertTrue(PalindromeValidator.isPalindrome("MadAm"));
    }

    @Test
    void palindromeWithSpacesAndPunctuationTest() {
        assertTrue(PalindromeValidator.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void notAPalindromeTest() {
        assertFalse(PalindromeValidator.isPalindrome("hello"));
    }

    @Test
    void emptyStringTest() {
        assertTrue(PalindromeValidator.isPalindrome(""));
    }

    @Test
    void onlyPunctuationTest() {
        assertTrue(PalindromeValidator.isPalindrome("!!!@@@"));
    }

    @Test
    void singleCharacterTest() {
        assertTrue(PalindromeValidator.isPalindrome("y"));
    }

    @Test
    void numericPalindromeTest() {
        assertTrue(PalindromeValidator.isPalindrome("12321"));
    }

    @Test
    void mixedAlphanumericPalindromeTest() {
        assertTrue(PalindromeValidator.isPalindrome("1a2b2a1"));
    }

    @Test
    void longNonPalindromeTest() {
        assertFalse(PalindromeValidator.isPalindrome("abcdefghij"));
    }
}