package upa.fei.dp.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library implements BookCollection {
    private final List<Book> books = new ArrayList<>();

    public boolean add(Book book) {
        Objects.requireNonNull(book, "book nesmi byt null");
        if (books.contains(book)) {
            return false;
        }
        return books.add(book);
    }

    public int size() { return books.size(); }

    public boolean isEmpty() { return books.isEmpty(); }

    @Override
    public BookIterator createForwardIterator() {
        return new ForwardIterator(books);
    }

    @Override
    public BookIterator createReverseIterator() {
        return new ReverseIterator(books);
    }
}
