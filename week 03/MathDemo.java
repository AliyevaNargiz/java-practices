public class MathDemo {
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int n : args) {
            total += n;
        }
        return total;
    }

    public static float mean(int[] args) {
        if (args.length == 0) return 0;
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        System.out.println("min(3, 7): " + min(3, 7));
        System.out.println("max(3, 7): " + max(3, 7));
        System.out.println("sum({2,4,6,8}): " + sum(arr));
        System.out.println("mean({2,4,6,8}): " + mean(arr));
        System.out.println("factorial(5): " + factorial(5));
        System.out.println("\nStatic methods are useful because you can call them without creating an object of MathDemo.");
    }
} 