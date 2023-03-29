package AdapterDesignPattern2;

public class Adapter implements LanAdapter {
    Mac obj;
    public Adapter(String inp){
        if(inp.equalsIgnoreCase("TypeC")){
            obj=new TypeC();
        }
        else if(inp.equalsIgnoreCase("thunderbolt")){
            obj=new ThunderBolt();
        }
    }

    @Override
    public void connect(String connectionReq) {
        if(connectionReq.equalsIgnoreCase("TypeC")){
            obj.typeC(1);
        }
        else if(connectionReq.equalsIgnoreCase("thunderbolt")){
            obj.thunderBolt(1);
        }
    }
}
