package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.*;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
//
//    @Override
//    public int averagePublicationYear(Map<BookSignature, BookB> books) {
//        if (books.size() == 0) return 0;
//        int sum = 0;
//        for (Map.Entry<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB> entry : books.entrySet()) {
//            sum += entry.getValue().getYearOfPublication();
//        }
//        return sum / books.size();
//    }
//
//    @Override
//    public int medianPublicationYear(Map<BookSignature, BookB> books) {
//        if (books.size() == 0) return 0;
//        List<Integer> years = new ArrayList<>();
//        int n = 0;
//        for (Map.Entry<BookSignature, BookB> entry : books.entrySet()) {
//            years.add(entry.getValue().getYearOfPublication());
//            n++;
//        }
//        Collections.sort(years);
//        return years.get(years.size() / 2);
//    }
}
