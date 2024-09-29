
public class Circle {
    
    public double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double computeArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double computeCircumference(){
        return Math.PI * 2 * radius;
    }
    
}
