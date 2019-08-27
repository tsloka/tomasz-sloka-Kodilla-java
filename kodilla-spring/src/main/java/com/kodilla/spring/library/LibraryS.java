package com.kodilla.spring.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class LibraryS {
    private final List<String> books = new ArrayList<>();
    private LibraryDbControllerS libraryDbControllerS;

    public LibraryS(final LibraryDbControllerS libraryDbControllerS) {
        this.libraryDbControllerS = libraryDbControllerS;
    }

    public LibraryS() {
    }

    public void saveToDb() {
        libraryDbControllerS.saveData();
    }

    public void loadFromDb() {
        libraryDbControllerS.loadData();
    }
}