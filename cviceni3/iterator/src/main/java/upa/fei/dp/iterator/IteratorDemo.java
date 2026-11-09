package upa.fei.dp.iterator;

import java.util.NoSuchElementException;

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

        boolean added = library.add(new Book("Clean Code", "Martin", 2008));
        System.out.println("\nPridani duplicity: " + added + " (v knihovne je " + library.size() + " knih)");

        System.out.println("\nPrazdna knihovna:");
        print(new Library().createForwardIterator());

        System.out.println("\n--- Kontrola vstupu ---");
        try {
            new Book(null, null, -5);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            new Book("Kniha", "Autor", 3000);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            library.add(null);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            BookIterator it = new Library().createForwardIterator();
            it.next();
        } catch (NoSuchElementException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
    }

    private static void print(BookIterator it) {
        if (!it.hasNext()) {
            System.out.println("  (zadne knihy)");
            return;
        }
        while (it.hasNext()) {
            System.out.println("  " + it.next());
        }
    }
}
