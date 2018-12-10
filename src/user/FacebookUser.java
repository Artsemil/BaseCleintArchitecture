package user;

public class FacebookUser extends User {
    private String fbToken;

    public FacebookUser(String name, String password, String token) {
        super(name, password);
        this.fbToken = token;
    }
}
