package AbstractFactory_2;

public class Dell extends Device{
    private String processor;
    private String gpu;
    private String ram;

    public Dell(String processor, String gpu, String ram) {
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
    }

    @Override
    public String getDevice() {
        return "This is a DELL with "+this.ram+" RAM "+this.processor+" processor "+this.gpu+" gpu";
    }

    public String toString(){
        return "This is a DELL with "+this.ram+" RAM "+this.processor+" processor "+this.gpu+" gpu";
    }
}
