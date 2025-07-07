import java.util.*;

// Functional interface
interface SpecificProperty<T> {
    boolean test(T t);
}

class Point {
    int x, y;
    Point(int x, int y) { this.x = x; this.y = y; }
    public String toString() { return "(" + x + ", " + y + ")"; }
}

class Person {
    String firstname, lastname;
    int age;
    Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public String toString() { return firstname + " " + lastname + ", age " + age; }
}

public class SpecificPropertyDemo {
    // Generic filter method
    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        Collection<T> result = new ArrayList<>();
        for (T item : c) {
            if (p.test(item)) result.add(item);
        }
        return result;
    }

    // Pangram check helper
    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // i. Integer is odd
        SpecificProperty<Integer> isOdd = n -> n % 2 != 0;
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println("Odd numbers: " + filter(nums, isOdd));

        // ii. Point in first quadrant
        SpecificProperty<Point> inFirstQuadrant = p -> p.x > 0 && p.y > 0;
        List<Point> points = Arrays.asList(new Point(1,2), new Point(-1,2), new Point(2,-3));
        System.out.println("Points in first quadrant: " + filter(points, inFirstQuadrant));

        // iii. String is Pangram
        SpecificProperty<String> isPangramProp = SpecificPropertyDemo::isPangram;
        List<String> strings = Arrays.asList("The quick brown fox jumps over the lazy dog", "Hello World");
        System.out.println("Pangrams: " + filter(strings, isPangramProp));

        // iv. Person older than 20
        SpecificProperty<Person> olderThan20 = person -> person.age > 20;
        List<Person> people = Arrays.asList(
            new Person("Nargiz", "Aliyeva", 21),
            new Person("Diego", "Barcenas", 24),
            new Person("Tessa", "Ornelas", 21)
        );
        System.out.println("People older than 20: " + filter(people, olderThan20));
    }
} 