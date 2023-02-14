package Composite_2;

public class Demo {
    public static void main(String[] args) {
        Component head=new Leaf("Head","Kathan");
        Component faculty=new Leaf("Faculty","Debabrata");
        Component interviewer=new Leaf("Interviewer","Madhuram");
        Component teacher=new Leaf("Placement teacher","Vatsal");
        Component petroLab=new Leaf("Petroleum Lab Instructor","Harsh Patel");
        Component nonTech=new Leaf("Non Technical Teacher","Mann Shah");

        Composite techTeacher=new Composite("techTeacher");
        Composite placement=new Composite("placement");
        Composite sot=new Composite("Shakti Mishra");
        Composite sls=new Composite("Nigam sir");
        Composite spt=new Composite("Kushal");
        Composite institute=new Composite("Mukesh Ambani");

        techTeacher.addComponent(head);
        techTeacher.addComponent(faculty);

        sls.addComponent(nonTech);

        placement.addComponent(interviewer);
        placement.addComponent(teacher);
        sot.addComponent(techTeacher);
        sot.addComponent(placement);

        spt.addComponent(petroLab);
        institute.addComponent(sls);
        institute.addComponent(sot);
        institute.addComponent(spt);

        institute.showDetails();

    }
}
