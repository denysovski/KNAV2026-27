package upa.fei.dp.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ForwardIterator implements BookIterator {
    private final List<Book> books;
    private int index = 0;

    public ForwardIterator(List<Book> books) {
        this.books = new ArrayList<>(Objects.requireNonNull(books, "books nesmi byt null"));
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Dalsi kniha uz neni");
        }
        return books.get(index++);
    }
}
