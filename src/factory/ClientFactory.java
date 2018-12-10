package factory;

import client.Client;
import constant.ClientType;
import user.User;

public class ClientFactory {
    private ClientFactory() {
    }

    public static Client createClient(User user, ClientType clientType) {
        return new Client(user, clientType);
    }
}
