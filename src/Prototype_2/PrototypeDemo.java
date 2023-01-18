package Prototype_2;

import java.io.InputStreamReader;
import java.util.Scanner;

public class PrototypeDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter values des name add sal");
        String edesignation=sc.nextLine();
        String ename=sc.nextLine();
        String eaddress=sc.nextLine();
        double esalary=sc.nextDouble();
        int eid=sc.nextInt();
        EmployeeRecord e1=new EmployeeRecord(ename,eid,edesignation,eaddress,esalary);
        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
