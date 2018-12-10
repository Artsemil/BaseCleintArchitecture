package store;

public class GoogleStore implements Store {

    @Override
    public void buyProduct(int productId) {
        System.out.println("GoogleStore buy product " + productId);
    }
}
