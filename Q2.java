
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name in the format first middle last: ");
        String fullName = input.nextLine();
        String[] array = fullName.split(" ");

        if (array.length == 3) {
            String firstName = array[0];
            String middleName = array[1];
            String lastName = array[2];
            System.out.println("The output is: " + lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        } else {
            System.out.println("Invalid name");
        }

    }
}
