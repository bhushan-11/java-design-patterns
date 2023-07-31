public class Driver {

    public static void main (String args[]){

        ShapeFactory factory = new ShapeFactory();

        Shape triangle = factory.getShapeInstance("Triangle");
        triangle.draw();

        Shape square = factory.getShapeInstance("Square");
        square.draw();

        Shape rectangle = factory.getShapeInstance("Rectangle");
        rectangle.draw();
    }
}
