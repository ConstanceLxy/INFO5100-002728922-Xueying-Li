public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159265359;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
