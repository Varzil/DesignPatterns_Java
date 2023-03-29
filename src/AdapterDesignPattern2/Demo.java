package AdapterDesignPattern2;

public class Demo {
    public static void main(String[] args) {
        LanConnect connection=new LanConnect();
        connection.connect("LAN");
        connection.connect("typec");
        connection.connect("thunderbolt");
        connection.connect("typea");
    }
}
