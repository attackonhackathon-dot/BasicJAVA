public class Abstraction {
    public static void main(String[] args) {
        Shape obj1 = new Circle(6);
        System.out.println(obj1.area());
        
    }

}
abstract class Shape{
    abstract double area();
    public abstract String toString();
    
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double area(){
        return Math.PI * Math.pow(radius,2);
    }
    public String toString(){
        return "area of circle is:" +area();
    }

}