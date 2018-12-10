package user;

public abstract class User {
    private int id;
    private String name;
    private String password;

    protected User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }
}
