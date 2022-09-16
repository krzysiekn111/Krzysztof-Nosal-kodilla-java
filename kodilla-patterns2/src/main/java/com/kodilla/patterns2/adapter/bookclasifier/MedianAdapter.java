package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        if (bookSet.isEmpty()) return 0;
        Map<BookSignature, BookB> bookMap = new HashMap<>();

        for (BookA bookA : bookSet) {
            bookMap.put(new BookSignature(bookA.getSignature()),
                    new BookB(
                            bookA.getAuthor(),
                            bookA.getTitle(),
                            bookA.getPublicationYear()
                    ));
        }
        return medianPublicationYear(bookMap);

    }
}
