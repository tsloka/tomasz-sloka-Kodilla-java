package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.BookA;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.BookB;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        return medianPublicationYear(reworkBookSetToMap(bookSet));
    }

    public int averagePublicationYear(Set<BookA> bookSet) {
        return super.averagePublicationYear(reworkBookSetToMap(bookSet));
    }

    private Map<BookSignature, BookB> reworkBookSetToMap(Set<BookA> bookSet) {
        Map<BookSignature, BookB> bookMap
                = new HashMap<>();
        for (BookA bookA : bookSet) {
            BookSignature bookSignature = new BookSignature(bookA.getSignature());
            BookB finalBookB =
                    new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
            bookMap.put(bookSignature, finalBookB);
        }
        return bookMap;
    }
}
