package Composite;
import java.util.*;
interface Component{
    void showPrice();
}
class Leaf implements Component{

    int price;
    String name;

    public Leaf(int price,String name){
        this.name=name;
        this.price=price;
    }

    @Override
    public void showPrice() {
        System.out.println(name+" : "+price);
    }
}
class Composite implements Component {
    String Name;
    List<Component> components = new ArrayList<>();

    // Constructor
    public Composite(String Name) {
        // super(); // Why????
        this.Name = Name;
    }


    public void addComponent(Component com) {
        components.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println("---------------" + Name + "---------------");
        for (Component c : components) {
            c.showPrice();
        }
    }
}
public class ComputerPart {

}
