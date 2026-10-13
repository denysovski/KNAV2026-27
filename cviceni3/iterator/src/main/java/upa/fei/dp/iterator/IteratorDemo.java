package upa.fei.dp.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Library library = new Library();
        library.add(new Book("Design Patterns", "Gamma a kol.", 1994));
        library.add(new Book("Clean Code", "Martin", 2008));
        library.add(new Book("Refactoring", "Fowler", 1999));

        System.out.println("Dopredu:");
        print(library.createForwardIterator());

        System.out.println("\nZpetne:");
        print(library.createReverseIterator());
    }

    private static void print(BookIterator it) {
        while (it.hasNext()) {
            System.out.println("  " + it.next());
        }
    }
}
