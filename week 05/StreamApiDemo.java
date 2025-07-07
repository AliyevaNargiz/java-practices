import java.util.*;
import java.util.stream.*;

public class StreamApiDemo {
    public static void main(String[] args) {
        // Instantiating and initializing Streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> numberStream = numbers.stream();

        // i. allMatch/noneMatch/anyMatch
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        boolean anyDivBy3 = numbers.stream().anyMatch(n -> n % 3 == 0);
        System.out.println("All even: " + allEven);
        System.out.println("None negative: " + noneNegative);
        System.out.println("Any divisible by 3: " + anyDivBy3);

        // ii. count
        long countEven = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Count of even numbers: " + countEven);

        // iii. generate / limit
        Stream<Double> randoms = Stream.generate(Math::random).limit(5);
        System.out.print("Random numbers: ");
        randoms.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // iv. forEach
        System.out.print("Numbers: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // v. findFirst/findAny (with ifPresentOrElse)
        Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        firstEven.ifPresentOrElse(
            n -> System.out.println("First even: " + n),
            () -> System.out.println("No even number found")
        );
        Optional<Integer> anyGreaterThanFive = numbers.stream().filter(n -> n > 5).findAny();
        anyGreaterThanFive.ifPresentOrElse(
            n -> System.out.println("Any number > 5: " + n),
            () -> System.out.println("No number > 5 found")
        );

        // vi. filter/sorted/collect/map
        List<Integer> squaresOfEven = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Squares of even numbers (sorted): " + squaresOfEven);

        // vii. reduce
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum using reduce: " + sum);
    }
} 