package AbstractFactory_2;

import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        Device dell= Objects.requireNonNull(FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY)).getGadget(DeviceType.DELl);
        System.out.println(dell.getDevice());
        Device iPhone= Objects.requireNonNull(FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY)).getGadget(DeviceType.IPHONE12);
        System.out.println(iPhone.getDevice());
    }

}
