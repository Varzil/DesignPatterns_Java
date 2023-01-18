package AbstractFactoryMethod;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        else{
            return null;
        }
    }
}
