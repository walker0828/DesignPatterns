public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIngoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIngoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIngoreCase("SQUARE")){
            return new Square();
        }
    }

    public static<T> T getClass(){

    }
}