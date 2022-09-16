package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<BookA> bookSet = new HashSet<>();
        BookA bookA1 = new BookA("autor", "title", 1987, "625");
        BookA book2 = new BookA("autor", "title", 2010, "195");
        BookA book3 = new BookA("autor", "title", 1999, "678");
        BookA book4 = new BookA("autor", "title", 2001, "765");
        BookA book5 = new BookA("autor", "title", 2002, "768");
        //When
        bookSet.add(bookA1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        //Then
        assertEquals(2001, medianAdapter.publicationYearMedian(bookSet));

    }
}
