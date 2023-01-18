package AbstractFactory_2;

public class MobileFactory extends AbstractDeviceFactory {
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType){
            case IPHONE12: return new IPhone12("A16","4GB");
            case NOKIA:return new Nokia("Pata Nahi kya",">0 GB");
        }
        return null;
    }
}
