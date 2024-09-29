
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a odd length word: ");
        String text = input.nextLine();
        while(text.length()%2 == 0){
            System.out.println("Enter a odd length word: ");
            text = input.nextLine();
        }
        int midIndex = (text.length()/2);
        System.out.println("The middle character is " + text.charAt(midIndex));
        
    }
}
