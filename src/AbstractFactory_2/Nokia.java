package AbstractFactory_2;

public class Nokia extends Device {
    private String processor;
    private String ram;

    public Nokia(String processor, String ram) {
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String getDevice() {
        return "This Nokia has "+processor+" processor "+this.ram+" ram";
    }
}
