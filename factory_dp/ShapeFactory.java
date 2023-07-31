public class ShapeFactory {

    public Shape getShapeInstance(String type){

        if(type == null)
        return null;

        if(type.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        if(type.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if(type.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
