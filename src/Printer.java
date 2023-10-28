public class Printer implements ShapeInterfacePrinter {
    @Override
    public void print(Shape shape) {
        System.out.println(shape.getName());
    }
}
