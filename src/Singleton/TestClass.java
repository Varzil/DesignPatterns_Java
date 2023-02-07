package Singleton;

public class TestClass {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        s1.setI(5);
        s2.setI(10);
        System.out.println(s1.getI());
        s2.i=s1.i+s2.i;
        print("S1",s1);
        print("S2",s2);
    }
    static void print(String name,Singleton obj){
        System.out.println(String.format("Object:%s,Hascode:%d",name,obj.hashCode()));
    }
}
