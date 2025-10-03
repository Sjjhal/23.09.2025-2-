public class Admin {
    private int id;
    private String name;

    public Admin(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addBook(Book book) {}
    public void removeBook(Book book) {}
    public void blockUser(User user) {}

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
