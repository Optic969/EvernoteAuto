package steps;

import java.util.List;

public class CountMultiples {

    public long countMultiples(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 4 == 0 || n % 6 == 0)
                .count();
    }
}
