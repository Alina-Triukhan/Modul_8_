public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Quad quad = new Quad();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Trapezoid trapezoid = new Trapezoid();

        ShapeInterfacePrinter sip = new Printer();
        sip.print(circle);
        sip.print(quad);
        sip.print(triangle);
        sip.print(rectangle);
        sip.print(trapezoid);
    }
}