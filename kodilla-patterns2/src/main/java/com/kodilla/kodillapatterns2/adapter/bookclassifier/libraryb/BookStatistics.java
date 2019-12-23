package com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, BookB> books);
    int medianPublicationYear(Map<BookSignature, BookB> books);
}