package task_1_1;

public class PalindromeValidator {

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("MadAm"));
        System.out.println(isPalindrome("Ma dAm"));
        System.out.println(isPalindrome("ababbbbaba"));
    }

    public static boolean isPalindrome(String input) {
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}