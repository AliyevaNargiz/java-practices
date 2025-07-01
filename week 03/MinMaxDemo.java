import java.util.Scanner;
import java.util.Arrays;

public class MinMaxDemo {
    // Method to find minimum in an array
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method to find maximum in an array
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to return both min and max
    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        // i. Take array from command line
        if (args.length > 0) {
            int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            System.out.println("From command line:");
            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Min: " + min(arr));
            System.out.println("Max: " + max(arr));
            int[] minMaxArr = minMax(arr);
            System.out.println("Min and Max: " + Arrays.toString(minMaxArr));
        }

        // ii. Take array from Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of elements: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("From Scanner:");
        System.out.println("Array: " + Arrays.toString(arr2));
        System.out.println("Min: " + min(arr2));
        System.out.println("Max: " + max(arr2));
        int[] minMaxArr2 = minMax(arr2);
        System.out.println("Min and Max: " + Arrays.toString(minMaxArr2));
        sc.close();
    }
} 