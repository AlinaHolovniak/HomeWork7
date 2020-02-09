package shapes;

public class Main {
    static void showShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + " , area: " + shape.calcArea());
        }
    }

    static double calcTotalArea(Shape[] shapes) {
        double area = 0.0;
        for (Shape shape : shapes) {
            area += shape.calcArea();
        }
        return area;
    }

    static double calcTotalArea(Shape[] shapes, Class someClass) {
        double area = 0.0;
        for (Shape shape : shapes) {
            if (shape.getClass().equals(someClass)) {
                area += shape.calcArea();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle("blue", 10.0, 5.0),
                new Rectangle("green", 3.7, 7.3),
                new Rectangle("red", 6.5, 5.6),
                new Rectangle("violet", 14.8, 8.14),
                new Circle("orange", 8.0),
                new Circle("green", 20.2),
                new Circle("yellow", 7.7),
                new Triangle("blue", 5.7, 4.5, 3.8),
                new Triangle("red", 6.3, 7.5, 5.5),
        };

        System.out.println("Shapes:");
        showShapes(shapes);

        System.out.println("The total area of all shapes: ");
        System.out.println(calcTotalArea(shapes));

        System.out.println("The total area of rectangles: ");
        System.out.println(calcTotalArea(shapes, Rectangle.class));

        System.out.println("The total area of circles: ");
        System.out.println(calcTotalArea(shapes, Circle.class));

        System.out.println("The total area of triangles: ");
        System.out.println(calcTotalArea(shapes, Triangle.class));
    }
}

