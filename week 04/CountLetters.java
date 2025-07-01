import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = text.split(" ");
        int totalLetters = 0;
        for (String word : words) {
            try {
                if (!word.matches("[a-zA-Z]+")) {
                    throw new Exception("Non-alphabetic word ignored: " + word);
                }
                totalLetters += word.length();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Total letters: " + totalLetters);
        sc.close();
    }
}