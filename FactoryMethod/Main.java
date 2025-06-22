public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get a Circle object
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get a Rectangle object
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
