package Facade_2;

public class Customer {
    public static void main(String[] args) {
        System.out.println(App.deliverFood(ItemType.FOOD));
        System.out.println(App.deliverFood(ItemType.ENTERTAINMENT));
        System.out.println(App.deliverFood(ItemType.PERSONAL));
    }
}
