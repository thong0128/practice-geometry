public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "indigo", false );
        Rectangle rectangle = new Rectangle(2.5, 3.8, "orange", true);
        Square square = new Square(5.8, "yellow", true);

        System.out.println("Pre-resize:");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        circle.resize(20);
        rectangle.resize(30);
        square.resize(100);

        System.out.println("After-resize:");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
