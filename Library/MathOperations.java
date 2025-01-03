package Library;

public class MathOperations {

    private static final double pi = 3.14159;

    public static double calculateCircleArea(double radius) {
        return pi * radius * radius;
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double getPi() {
        return pi;
    }
    
}