package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Creation of books set for tests
        Set<Book> testBooks = new HashSet<>();
        IntStream.iterate(0, n -> n + 1)
                .limit(10)
                .forEach(n -> testBooks.add(
                        new Book("Book" + n,"Author" + n, LocalDate.now().plusMonths(n))));

        //Creating new library and adding test books
        Library library = new Library("Original library");
        library.getBooks().addAll(testBooks);

        //Shallow copying library
        Library shallowCopy = null;
        try {
            shallowCopy = library.shallowCopy();
            shallowCopy.setName("Shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Deep copying library
        Library deepCopy = null;
        try {
            deepCopy = library.deepCopy();
            deepCopy.setName("Deep copy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(new Book
                ("Book2","Author2", LocalDate.of(2019,10,29)));

        //Then
        System.out.println(library);
        System.out.println(shallowCopy);
        System.out.println(deepCopy);
        Assert.assertEquals(10,library.getBooks().size());
        Assert.assertEquals(10,shallowCopy.getBooks().size());
        Assert.assertEquals(10,deepCopy.getBooks().size());
        Assert.assertEquals(library.getBooks(),shallowCopy.getBooks());
        Assert.assertEquals(testBooks,deepCopy.getBooks());
    }

}