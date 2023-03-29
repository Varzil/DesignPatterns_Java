package Facade_2;

public class Maggi implements Item{
    String item;
    int hour;
    @Override
    public void getItem(String itemRequired) {
        item="You get "+itemRequired;
    }

    @Override
    public void getTime(int hours) {
        hour=hours;
    }

    @Override
    public String getDelivery() {
        return item+hour;
    }
}
