package Facade_2;

public class App {
    static Details details=new Details();
    public static String deliverFood(ItemType item) {
        switch (item) {
            case FOOD:
                Maggi maggi = new Maggi();
                maggi.getItem(details.getMaggi());
                maggi.getTime(details.getMaggiTime());
                return maggi.getDelivery();
            case PERSONAL:
                Shampoo shampoo = new Shampoo();
                shampoo.getItem(details.getShampoo());
                shampoo.getTime(details.getShampooTime());
                return shampoo.getDelivery();
            case ENTERTAINMENT:
                Playstation ps = new Playstation();
                ps.getItem(details.getPlayStation());
                ps.getTime(details.getPlayStationTime());
                return ps.getDelivery();
            default:
                System.out.println("Invalid Item");
        }
        return null;
    }
}
