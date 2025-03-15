import java.util.Objects;

public class Book {
    private  String name;
    private int yearPublication;
    private Author author;

    public Book() {}

    public Book(Author author, int yearPublication, String name) {
        this.author = author;
        this.yearPublication = yearPublication;
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearPublication, author);
    }

    @Override
    public String toString() {
        return "Книга. название: " + name + ", " + author + ", " + yearPublication;
    }
}

