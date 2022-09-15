package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        if (bookSet.isEmpty()) return 0;
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();

        Iterator<Book> iterator = bookSet.iterator();
        while (iterator.hasNext()) {
            bookMap.put(new BookSignature(iterator.next().getSignature()),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                            iterator.next().getAuthor(),
                            iterator.next().getTitle(),
                            iterator.next().getPublicationYear()
                    ));
        }
        return medianPublicationYear(bookMap);

    }
}
