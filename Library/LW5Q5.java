package Library;

public class LW5Q5 {

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateSquareArea(double sideLength) {
        return sideLength * sideLength;
    }

    public static void main(String[] args) {

        double rectangleLength = 5.0;
        double rectangleWidth = 8.0;
        double squareSideLength = 4.0;

        double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
        System.out.println("Area of Rectangle (Length: " + rectangleLength + ", Width: " + rectangleWidth + "): " + rectangleArea);

        double squareArea = calculateSquareArea(squareSideLength);
        System.out.println("Area of Square (Side Length: " + squareSideLength + "): " + squareArea);
    }
}