package com.kodilla.spring.library;

import com.kodilla.spring.SpringRunnerS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRunnerS.class)
public class LibrarySTestSuite {
    @Test
    public void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(LibraryConfig.class);

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

//    @Test
//    public void testLoadFromDb() {
//        //Given
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        LibraryS libraryS = context.getBean(LibraryS.class);
//        //When
//        libraryS.loadFromDb();
//        //Then
//        //do nothing
//    }
//
//    @Test
//    public void testSaveToDb() {
//        //Given
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        LibraryS libraryS = context.getBean(LibraryS.class);
//        //When
//        libraryS.saveToDb();
//        //Then
//        //do nothing
//    }
}