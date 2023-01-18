package Prototype;
import java.util.*;

public class Vehicle implements Cloneable{
    private List<String> vehicleList;

    public Vehicle(){
        this.vehicleList=new ArrayList<String>();
    }

    public Vehicle(List<String> list){
        this.vehicleList=list;
    }

    public void insertVehicle(){
        vehicleList.add("ABC");
        vehicleList.add("DEF");
        vehicleList.add("GHI");
        vehicleList.add("JK");
        vehicleList.add("L");
    }

    public String modify(){
        return vehicleList.get(0);
    }

    public List<String> getVehicleList() {
        return this.vehicleList;
    }

    public Object clone() throws CloneNotSupportedException{
        List<String> temp=new ArrayList<String>();
        for (String s:this.vehicleList){
            temp.add(s);
        }
        return new Vehicle(temp);
    }
}
