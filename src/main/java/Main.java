public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle(5);
        System.out.println(circle.toString());
        System.out.println(circle.circumference(5));
        System.out.println(circle.area(5));
        Cylinder cylinder=new Cylinder(4,10);
        System.out.println(cylinder.toString());
        System.out.println(cylinder.surfaceArea(4,10));
        System.out.println(cylinder.volume(54,10)); }
}
