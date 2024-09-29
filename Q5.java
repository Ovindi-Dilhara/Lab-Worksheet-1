
import java.util.Scanner;


public class Q5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the inner radius r1: ");
        double r1 = input.nextDouble();
        System.out.println("Enter the outer radius r0: ");
        double r0 = input.nextDouble();
        
        Circle inner = new Circle(r1);
        Circle outer = new Circle(r0);
        
        System.out.println("The area of the circular region is " + Math.round(outer.computeArea() - inner.computeArea()));
        
    }
}
