package AbstractFactory_2;

public class IPhone12 extends Device {
    private String processor;
    private String ram;

    public IPhone12(String processor, String ram) {
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String getDevice() {
        return "This iPhone12 has "+processor+" processor "+this.ram+" ram";
    }
}
