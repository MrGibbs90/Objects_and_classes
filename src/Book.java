import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publishYear;

    public Book(String bookName, Author author, int publishYear) {
        this.name = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && name.equals(book.name) && author.equals(book.author);
    }

    public int hashCode() {
        return Objects.hash(name, author, publishYear);
    }

    public String toString() {
        return "Book{" +
                "bookName='" + name + '\'' +
                ", author=" + author +
                ", publishYear" + publishYear +
                '}';
    }
}
