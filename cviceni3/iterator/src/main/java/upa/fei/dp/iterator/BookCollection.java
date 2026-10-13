package upa.fei.dp.iterator;

public interface BookCollection {
    BookIterator createForwardIterator();
    BookIterator createReverseIterator();
}
