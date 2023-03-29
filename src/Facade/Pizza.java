package Facade;

public class Pizza implements Food {
    String preparedItems;
    @Override
    public void prepareFood(String itemRequired) {
        preparedItems="Thin crust pizza with ingredients = "+itemRequired;
    }

    @Override
    public String getDelivery() {
        return preparedItems;
    }
}
