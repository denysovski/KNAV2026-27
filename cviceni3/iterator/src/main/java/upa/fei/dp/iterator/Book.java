package upa.fei.dp.iterator;

import java.time.Year;
import java.util.Objects;

public class Book {
    private static final int FIRST_PRINTED_YEAR = 1450;

    private final String title;
    private final String author;
    private final int year;

    public Book(String title, String author, int year) {
        this.title = Check.text(title, "title");
        this.author = Check.text(author, "author");
        this.year = Check.range(year, FIRST_PRINTED_YEAR, Year.now().getValue(), "year");
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book other = (Book) o;
        return year == other.year && title.equals(other.title) && author.equals(other.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        return title + " (" + author + ", " + year + ")";
    }
}
