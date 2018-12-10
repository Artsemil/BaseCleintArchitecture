package factory;

import constant.ClientType;
import store.AppStore;
import store.GoogleStore;
import store.Store;

public class StoreFactory {
    private StoreFactory() {
    }

    public static Store createStore(ClientType clientType) {
        switch (clientType) {
            case IOS:
                return new AppStore();
            case ANDROID:
                return new GoogleStore();
            default:
                throw new RuntimeException("Unknown store type");
        }
    }
}
