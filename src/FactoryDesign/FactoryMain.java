package FactoryDesign;
import FactoryDesign.Phone.*;

class FactoryMain{
    public static void main(String[] args){
        OS obj=new IOS();
        obj.spec();
    }
}