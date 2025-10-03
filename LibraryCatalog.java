public class LibraryCatalog {
    private String name;

    public LibraryCatalog(String name) {
        this.name = name;
    }

    public void searchByTitle(String title) {}
    public void searchByAuthor(String author) {}

    @Override
    public String toString() {
        return "LibraryCatalog{" +
                "name='" + name + '\'' +
                '}';
    }
}

