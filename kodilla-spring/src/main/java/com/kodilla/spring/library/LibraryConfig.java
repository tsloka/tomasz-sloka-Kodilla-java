package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
    @Bean
    public LibraryS library() {
        return new LibraryS(libraryDbController());
    }

    @Bean
    public LibraryDbControllerS libraryDbController() {
        return new LibraryDbControllerS();
    }
}