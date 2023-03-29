package AdapterDesignPattern2;

public class TypeC implements Mac{

    @Override
    public void typeC(int num) {
        System.out.println("Number of Type C = "+num );
    }

    @Override
    public void thunderBolt(int num) {
        System.out.println("No Thunder Bolt ");
    }
}
