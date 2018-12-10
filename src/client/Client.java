package client;

import constant.ClientType;
import factory.StoreFactory;
import store.Store;
import user.User;

public class Client {
    private User user;
    private ClientType clientType;
    private Store store;

    public Client(User user, ClientType clientType) {
        this.user = user;
        this.clientType = clientType;
    }

    public void login() {
        user.setId(789);
        System.out.println("Login completed");
    }

    public void buy(int productId) {
        if (store == null) {
            System.out.println("Creating Store");
            this.store = StoreFactory.createStore(clientType);
        }
        store.buyProduct(productId);
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
        this.store = StoreFactory.createStore(clientType);
    }
}
