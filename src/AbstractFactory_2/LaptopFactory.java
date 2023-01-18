package AbstractFactory_2;

public class LaptopFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType){
            case MAC:return new Mac("M1","MPS","8GB");
            case DELl:return new Dell("i3","0",">2 GB");
        }
        return null;
    }
}
