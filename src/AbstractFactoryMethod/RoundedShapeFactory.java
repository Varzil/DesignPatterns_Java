package AbstractFactoryMethod;

public class RoundedShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }
        else if(shape.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        else{
            return null;
        }
    }
}
