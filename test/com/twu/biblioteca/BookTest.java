package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book book = new Book("Hello World!", "ywt", "2000");

    @Test
    public void getIsCheckoutTest() {
        assertEquals(false, book.getIsCheckout());
    }

    @Test
    public void setIsCheckoutTest() {
        book.setIsCheckout(true);
        assertEquals(true, book.getIsCheckout());
    }

    @Test
    public void displayDetailTest() {
        String detail = "Hello World!    ywt    2000\n";
        assertEquals(detail, book.displayDetail());
    }
}
