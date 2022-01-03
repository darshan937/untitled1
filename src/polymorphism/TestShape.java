package polymorphism;

public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("area of circle " + circle.area(4f));
        Shape rectangle = new Rectangle();
        System.out.println("area of rectangle "+ rectangle.area(2,3));
        Shape triangle = new Triangle();
        System.out.println("area of triangle " + triangle.area(2,3));
    }
}
