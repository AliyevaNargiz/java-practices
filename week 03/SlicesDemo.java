import java.util.Scanner;

public class SlicesDemo {
    public static void printSlices(String word) {
        System.out.println(word);
        for (int i = 1; i < word.length(); i++) {
            System.out.println(word.substring(0, i) + " " + word.substring(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        printSlices(word);
        sc.close();
    }
} 