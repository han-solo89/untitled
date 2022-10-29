import java.util.Objects;


public class Book {
    private final String bookName;
    private final Author author;
    private int publishYear;

    public Book(String bookName, Author autor, int publishYear) {
        this.bookName = bookName;
        this.author = autor;
        this.publishYear = publishYear;


    }

    public String getBookName() { return bookName; }
    public Author getAuthor() { return author; }
    public int getPublishYear() { return publishYear; }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return  publishYear == book.publishYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);

    }

    public int hashCode() {
        return Objects.hash(bookName, author, publishYear);

    }

    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", autor=" + author +
                ", publishYear=" + publishYear +
                '}';
    }

}
