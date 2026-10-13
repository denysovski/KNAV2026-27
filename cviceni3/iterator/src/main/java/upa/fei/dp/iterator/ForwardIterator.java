package upa.fei.dp.iterator;

import java.util.List;

public class ForwardIterator implements BookIterator {
    private final List<Book> books;
    private int index = 0;

    public ForwardIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        return books.get(index++);
    }
}
