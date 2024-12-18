public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea(double radius, double height) {
        return 2 * 3.14 * radius * height;
    }

    public double volume(double radius, double height) {
        return 3.14 * radius * radius * height;
    }

    @Override
    public String toString(){
        return "Cylinder with radius:"+ radius+" " +"and height:"+height;
    }
}
