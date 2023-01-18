package Prototype_2;

public class EmployeeRecord implements Prototype {
    private int id;
    private String name,designation,address;
    private double salary;

    public EmployeeRecord(){
        System.out.println("   Employee Records of Oracle Corporation ");
        System.out.println("---------------------------------------------");
        System.out.println("E_id"+"\t"+"E_name"+"\t"+"E_designation"+"\t"+"E_salary"+"\t"+"E_address");
    }

    public EmployeeRecord(String name,int id,String designation,String address,double salary){
        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }
    public void showRecord(){
        System.out.println(id+"\t\t"+name+"\t\t"+designation+"\t\t\t"+salary+"\t\t"+address);
    }
    @Override
    public Prototype getClone() {
        return new EmployeeRecord(name,id,designation,address,salary);
    }
}
