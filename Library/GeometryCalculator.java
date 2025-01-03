package Library;

public class GeometryCalculator {

    public static void main(String[] args) {

        System.out.println("Value of Pi: " + MathOperations.getPi());
        double circleArea = MathOperations.calculateCircleArea(5);
        System.out.println("Area of Circle with radius 5: " + circleArea);

        double squareArea = MathOperations.calculateSquareArea(4);
        System.out.println("Area of Square with side length 4: " + squareArea);
    }
}