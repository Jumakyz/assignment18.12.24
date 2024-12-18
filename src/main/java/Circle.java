public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double circumference(double radius){
        return 2*3.14*radius;
    }
    public double area(double radius){
        return 3.14*radius*radius;
    }
    @Override
    public String toString(){
        return "Circle with radius:"+radius;
    }

}
