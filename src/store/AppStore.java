package store;

public class AppStore implements Store {

    @Override
    public void buyProduct(int productId) {
        System.out.println("AppStore buy product " + productId);
    }
}
