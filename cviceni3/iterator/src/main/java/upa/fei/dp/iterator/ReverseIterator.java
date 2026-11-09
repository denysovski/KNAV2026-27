package upa.fei.dp.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ReverseIterator implements BookIterator {
    private final List<Book> books;
    private int index;

    public ReverseIterator(List<Book> books) {
        this.books = new ArrayList<>(Objects.requireNonNull(books, "books nesmi byt null"));
        this.index = this.books.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Dalsi kniha uz neni");
        }
        return books.get(index--);
    }
}
