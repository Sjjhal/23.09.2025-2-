public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String role;

    public User(int id, String firstName, String lastName, String login, String password, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public void register() {}
    public void login() {}
    public void addToFavorites(Book book) {}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
