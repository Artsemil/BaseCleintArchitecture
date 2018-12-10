package factory;

import constant.UserType;
import user.FacebookUser;
import user.GuestUser;
import user.User;

public class UserFactory {
    private UserFactory() {
    }

    public static User createUser(UserType userType) {
        User user;
        switch (userType) {
            case FACEBOOK:
                return new FacebookUser("FBTestUser", "111222", "ABC=123");
            case GUEST:
                return new GuestUser("GuestTestUser", "333444");
            default:
                throw new RuntimeException("Unknown user type");
        }
    }
}
