package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("autor", "title", 1987, "625");
        Book book2 = new Book("autor", "title", 2010, "195");
        Book book3 = new Book("autor", "title", 1999, "678");
        Book book4 = new Book("autor", "title", 2001, "765");
//        Book book5 = new Book("autor", "title", 2002, "765");
        //When
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
//        bookSet.add(book5);
        //Then
        assertEquals(2000, medianAdapter.publicationYearMedian(bookSet));

    }
}
