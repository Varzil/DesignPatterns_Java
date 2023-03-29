package Facade;

public class Pasta implements Food{
    String preparedItems;
    @Override
    public void prepareFood(String itemRequired) {
        preparedItems="Cheese pasta with mushrooms and corn = "+itemRequired;
    }

    @Override
    public String getDelivery() {
        return preparedItems;
    }
}
