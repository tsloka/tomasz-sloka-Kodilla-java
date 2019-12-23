package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        BookA book1 = new BookA("author1", "Title1", 2004, "ISBN");
        BookA book2 = new BookA("author2", "Title2", 2004, "ISBN");
        BookA book3 = new BookA("author3", "Title3", 2003, "ISBN");
        BookA book4 = new BookA("author4", "Title4", 2004, "ISBN");
        BookA book5 = new BookA("author5", "Title5", 2005, "ISBN");
        BookA book6 = new BookA("author6", "Title6", 2006, "ISBN");
        BookA book7 = new BookA("author7", "Title7", 2007, "ISBN");
        BookA book8 = new BookA("author8", "Title8", 2019, "ISBN");
        Set<BookA> bookSet = new HashSet<>();
        bookSet.add(book1); bookSet.add(book2); bookSet.add(book3); bookSet.add(book4);
        bookSet.add(book5); bookSet.add(book6); bookSet.add(book7); bookSet.add(book8);
        //When
        MedianAdapter adapter = new MedianAdapter();
        double testMedian = adapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(2005, testMedian, 0.0);

    }

    @Test
    public void publicationYearAverageTest() {
        //Given
        BookA book1 = new BookA("author1", "Title1", 2004, "ISBN");
        BookA book2 = new BookA("author2", "Title2", 2004, "ISBN");
        BookA book3 = new BookA("author3", "Title3", 2003, "ISBN");
        BookA book4 = new BookA("author4", "Title4", 2004, "ISBN");
        BookA book5 = new BookA("author5", "Title5", 2005, "ISBN");
        BookA book6 = new BookA("author6", "Title6", 2006, "ISBN");
        BookA book7 = new BookA("author7", "Title7", 2007, "ISBN");
        BookA book8 = new BookA("author8", "Title8", 2019, "ISBN");
        Set<BookA> bookSet = new HashSet<>();
        bookSet.add(book1); bookSet.add(book2); bookSet.add(book3); bookSet.add(book4);
        bookSet.add(book5); bookSet.add(book6); bookSet.add(book7); bookSet.add(book8);
        //When
        MedianAdapter adapter = new MedianAdapter();
        double testAverage = adapter.averagePublicationYear(bookSet);
        //Then
        Assert.assertEquals(2006, testAverage, 0.0);
    }
}
