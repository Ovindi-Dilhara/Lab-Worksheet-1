
import java.util.Scanner;


public class Q3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a centimetre value: ");
        float centimetre = input.nextFloat();
        int inches = (int)(centimetre/2.54);
        int feet = inches/12;        
        int inch = inches%12;
        System.out.println("The length is " + feet + " feet and " + inch + " inches.");

    }
}
