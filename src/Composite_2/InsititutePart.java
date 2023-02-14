package Composite_2;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void showDetails();
}

class Leaf implements Component {

    String name;
    String designation;

    public Leaf(String designation,String name){
        this.name=name;
        this.designation=designation;
    }

    @Override
    public void showDetails() {
        System.out.println("        "+name+" : "+designation);
    }
}

class Composite implements Component {
    String name;

    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component com) {
        components.add(com);
    }

    @Override
    public void showDetails() {
        System.out.println(name+" ---");
        for (Component c : components) {
            c.showDetails();
        }
    }
}

public class InsititutePart {

}
