package lambdaExercises;


import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String Title;
    private String Author;
    private int pageCount;
    LocalDate publishDate;
    private CoverType coverType;

    public enum CoverType {
        HARD, PAPER
    }

    public Book(String title, String author, int pageCount, LocalDate publishDate, CoverType coverType) {
        Title = title;
        Author = author;
        this.pageCount = pageCount;
        this.publishDate = publishDate;
        this.coverType = coverType;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    public String getDebugStr() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", pageCount=" + pageCount +
                ", publishDate=" + publishDate +
                ", coverType=" + coverType +
                '}';
    }

    public static List<Book> createBookShelf() {

        List<Book> bookShelf = new ArrayList<>();
        bookShelf.add(
                new Book("Big Book of Java",
                        "Fred",
                        492,
                        IsoChronology.INSTANCE.date(1980, 6, 20),
                        CoverType.HARD));
        bookShelf.add(
                new Book("Functions Inside Out",
                        "Jane",
                        320,
                        IsoChronology.INSTANCE.date(1990, 7, 15),
                        CoverType.PAPER));
        bookShelf.add(
                new Book("The Curious Case of Lambdas",
                        "George",
                        231,
                        IsoChronology.INSTANCE.date(1991, 8, 13),
                        CoverType.HARD));
        bookShelf.add(
                new Book("Boring Beginner's Book of Pascal",
                        "Bob",
                        32,
                        IsoChronology.INSTANCE.date(2000, 9, 12),
                        CoverType.PAPER));

        return bookShelf;
    }

}
