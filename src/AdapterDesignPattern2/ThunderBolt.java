package AdapterDesignPattern2;

public class ThunderBolt implements Mac {

    @Override
    public void typeC(int num) {
        System.out.println("No Type C " );
    }

    @Override
    public void thunderBolt(int num) {
        System.out.println("Number of Thunder Bolt = "+num );
    }
}
