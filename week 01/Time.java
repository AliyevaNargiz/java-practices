import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter seconds: ");
        int totalSeconds = input.nextInt();
        
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds%n", 
                         totalSeconds, hours, minutes, seconds);
        
        input.close();
    }
} 