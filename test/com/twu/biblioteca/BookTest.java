package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book book = new Book("Hello World!", "ywt", "2000-01");

    @Test
    public void getTitleTest() {
        assertEquals("Hello World!", book.getTitle());
    }

    @Test
    public void getAuthorTest() {
        assertEquals("ywt", book.getAuthor());
    }

    @Test
    public void getYearPublishedTest() {
        assertEquals("2000-01", book.getYearPublished());
    }
}
