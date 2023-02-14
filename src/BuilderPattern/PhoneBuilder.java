package BuilderPattern;

// In Builder DP we use Setters
// These setters set the values of the different parameters

public class PhoneBuilder{
    String os;
    String processor;
    double screenSize;
    int battery;
    int camera;

    public PhoneBuilder setOs(String os){
        this.os=os;
        return this;
    }
    public PhoneBuilder setScreenSize(double screenSize){
        this.screenSize=screenSize;
        return this;
    }
    public PhoneBuilder setBattery(int battery){
        this.battery=battery;
        return this;
    }
    public int setCamera(int camera){
        this.camera=camera;
        return camera;
    }
}