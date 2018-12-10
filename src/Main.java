import client.Client;
import constant.ClientType;
import constant.UserType;
import factory.ClientFactory;
import factory.UserFactory;
import user.User;

public class Main {
    public static void main(String[] args) {
        User user = UserFactory.createUser(UserType.FACEBOOK);
        Client client = ClientFactory.createClient(user, ClientType.ANDROID);
        client.login();
        client.buy(1);
        client.buy(2);
        client.setClientType(ClientType.IOS);
        client.buy(3);
    }
}
