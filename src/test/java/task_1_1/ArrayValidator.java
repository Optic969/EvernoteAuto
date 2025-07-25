package task_1_1;

import java.util.Arrays;
import java.util.List;

public class ArrayValidator {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 12);
        long count = count(numbers);
        System.out.println("Result: " + count);
    }

    public static long count(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 4 == 0 || n % 6 == 0)
                .count();
    }
}