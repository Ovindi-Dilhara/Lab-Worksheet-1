package Answers;
import java.util.Scanner;

public class LW2Q2 {

    public static int countDigits(int number) {
        
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        }
        
        int digitCount = 0;
        while (number > 0) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
        
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Enter integers to count their digits (enter a negative number to stop):");
        
        while (true) {
            System.out.print("Enter an integer: ");
            input = scanner.nextInt();
            
            if (input < 0) {
                System.out.println("Negative number entered. Program terminated.");
                break;
            }
            
            int digits = countDigits(input);
            System.out.println("Number of digits: " + digits);
        }
        
    }
}