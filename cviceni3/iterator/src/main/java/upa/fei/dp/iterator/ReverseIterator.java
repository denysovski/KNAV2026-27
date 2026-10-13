package upa.fei.dp.iterator;

import java.util.List;

public class ReverseIterator implements BookIterator {
    private final List<Book> books;
    private int index;

    public ReverseIterator(List<Book> books) {
        this.books = books;
        this.index = books.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Book next() {
        return books.get(index--);
    }
}
