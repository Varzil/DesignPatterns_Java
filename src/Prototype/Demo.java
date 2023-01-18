package Prototype;
import java.util.List;
class Demo{
    public static void main(String[] args)throws CloneNotSupportedException {
        Vehicle a = new Vehicle();
        a.insertVehicle();
        Vehicle b=(Vehicle) a.clone();
        System.out.println("A"+a.getVehicleList());
        System.out.println("B"+b.getVehicleList());
        List<String> list=b.getVehicleList();
        list.add("XYZ");
        System.out.println("B"+b.getVehicleList());
        b.getVehicleList().remove("EFG");
        System.out.println("B"+list);
        b.modify();
    }
}
