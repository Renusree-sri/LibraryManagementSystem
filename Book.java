public class Book {
    int id;
    String title;
    boolean isIssued;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }

    public void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Issued: " + isIssued);
    }
}
