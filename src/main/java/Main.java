public class Main {
    public static void main(String[] args) {

        Circle circle= new Circle(5);
        System.out.println(circle.toString());
        System.out.println((int)  circle.circumference());
        System.out.println((int) circle.area());

//        Cylinder cylinder=new Cylinder(4,10);
//        System.out.println(cylinder.toString());
//        System.out.println(cylinder.surfaceArea());
//        System.out.println(cylinder.volume());
    }
}
