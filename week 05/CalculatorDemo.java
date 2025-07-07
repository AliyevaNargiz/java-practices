// Functional interface
@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;
        Calculator exp = (a, b) -> Math.pow(a, b);

        double x = 5, y = 3;
        System.out.println("Add: " + add.calculate(x, y));
        System.out.println("Subtract: " + sub.calculate(x, y));
        System.out.println("Multiply: " + mul.calculate(x, y));
        System.out.println("Divide: " + div.calculate(x, y));
        System.out.println("Exponentiate: " + exp.calculate(x, y));
    }
} 