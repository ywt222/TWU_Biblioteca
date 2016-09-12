package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookListTest {
    @Test
    public void getBookListTest() {
        String allBookList =
                "1. Twilight    Stephanie Meyer    2005\n" +
                "2. Harry Potter    J. K. Rowling    2007\n" +
                "3. Romeo and Juliet    William Shakespeare    1990\n" +
                "4. Head First Java    Kathy Sierra & Bert Bates    2015\n" +
                "5. C++ Primer Plus    Stephen Prata    2012\n";
        BookList bookList = new BookList();
        assertEquals(allBookList, bookList.getBookList());
    }
}
