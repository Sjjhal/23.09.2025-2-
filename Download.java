public class Download {
    private int id;
    private User user;
    private Book book;
    private String date;

    public Download(int id, User user, Book book, String date) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.date = date;
    }

    public void startDownload() {}

    @Override
    public String toString() {
        return "Download{" +
                "id=" + id +
                ", user=" + user +
                ", book=" + book +
                ", date='" + date + '\'' +
                '}';
    }
}
