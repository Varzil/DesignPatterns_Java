package AbstractFactory_2;

public class Mac extends Device{
    private String processor;
    private String gpu;
    private String ram;

    public Mac(String processor, String gpu, String ram) {
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
    }

    @Override
    public String getDevice() {
        return "This is a Mac with "+this.ram+" RAM "+this.processor+" processor "+this.gpu+" gpu";
    }

    public String toString(){
        return "This is a Mac with "+this.ram+" RAM "+this.processor+" processor "+this.gpu+" gpu";
    }

}
