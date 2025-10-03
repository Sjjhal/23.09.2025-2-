public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    private String genre;
    private String type;

    public Book(int id, String title, String author, int year, String genre, String type) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.type = type;
    }

    public void open() {}
    public void read() {}

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
