package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookListTest {
    BookList bookList = new BookList();

    String allBookList =
            "1. Twilight    Stephanie Meyer    2005\n" +
            "2. Harry Potter    J. K. Rowling    2007\n" +
            "3. Romeo and Juliet    William Shakespeare    1990\n" +
            "4. Head First Java    Kathy Sierra & Bert Bates    2015\n" +
            "5. C++ Primer Plus    Stephen Prata    2012\n";
    String partBookList =
            "1. Twilight    Stephanie Meyer    2005\n" +
            "3. Romeo and Juliet    William Shakespeare    1990\n" +
            "4. Head First Java    Kathy Sierra & Bert Bates    2015\n" +
            "5. C++ Primer Plus    Stephen Prata    2012\n";

    String checkoutBookList = "2. Harry Potter    J. K. Rowling    2007\nlend by Amy";

    @Test
    public void getBookListTest() {
        assertEquals(allBookList, bookList.getBookList());
    }

    @Test
    public void checkoutAndCheckinBookSuccessTest() {
        String checkoutSuccessResponse ="Thank you! Enjoy the book.";
        String checkinSuccessResponse ="Thank you for returning the book.";

        assertEquals(checkoutSuccessResponse, bookList.checkoutBook(2, "Amy"));
        assertEquals(partBookList, bookList.getBookList());
        assertEquals(checkoutBookList, bookList.getAdminBookList());

        assertEquals(checkinSuccessResponse, bookList.checkinBook(2));
        assertEquals(allBookList, bookList.getBookList());
    }

    @Test
    public void checkoutBookFailedTest() {
        String checkoutFailedResponse ="That book is not available.";

        assertEquals(checkoutFailedResponse, bookList.checkoutBook(6, "Amy"));
        assertEquals(allBookList, bookList.getBookList());
    }

    @Test
    public void checkinBookFailedTest() {
        String checkinFailedResponse ="That is not a valid book to return.";

        assertEquals(checkinFailedResponse, bookList.checkinBook(6));
        assertEquals(allBookList, bookList.getBookList());
    }
}
