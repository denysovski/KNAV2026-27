package upa.fei.dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookCollection {
    private final List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    @Override
    public BookIterator createForwardIterator() {
        return new ForwardIterator(books);
    }

    @Override
    public BookIterator createReverseIterator() {
        return new ReverseIterator(books);
    }
}
