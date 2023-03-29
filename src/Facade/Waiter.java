package Facade;

public class Waiter {
    static Ingridient ingridient=new Ingridient();
    public static String deliverFood(FoodType food){
        switch (food){
            case PASTA:
                Pasta pasta=new Pasta();
                pasta.prepareFood(ingridient.getPastaItems());
                return pasta.getDelivery();
            case PIZZA:
                Pizza pizza=new Pizza();
                pizza.prepareFood(ingridient.getPizzaItems());
                return pizza.getDelivery();
            default:
                System.out.println("Invalid");
        }
        return null;
    }
}
