package AdapterDesignPattern2;

public class LanConnect implements LanAdapter {
    Adapter adapter;
    @Override
    public void connect(String connectionReq) {
        if(connectionReq.equalsIgnoreCase("LAN")){
            System.out.println("Connecting the computer to LAN via Adapter");
        } else if (connectionReq.equalsIgnoreCase("typec")|| connectionReq.equalsIgnoreCase("thunderbolt")) {
            adapter=new Adapter(connectionReq);
            adapter.connect(connectionReq);
        }
        else{
            System.out.println("The given type is not available TRY ANOTHER ADAPTER");
        }
    }
}
