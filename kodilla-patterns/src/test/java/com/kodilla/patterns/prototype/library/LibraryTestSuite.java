package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        Library library = new Library("library");
        library.getBooks().add(new Book("t1", "a1", LocalDate.of(1970, 5, 12)));
        library.getBooks().add(new Book("t2", "a2", LocalDate.of(2010, 1, 6)));
        library.getBooks().add(new Book("t3", "a3", LocalDate.of(1999, 2, 19)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library clonedLibrary2 = null;
        try {
            clonedLibrary2 = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //shallow copy
        assertEquals(library.getBooks(), clonedLibrary.getBooks());
        assertNotEquals(library.getBooks(), clonedLibrary2.getBooks());
    }
}
