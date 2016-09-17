package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    Movie movie = new Movie("Hello World!", "2000", "ywt", 9.0);

    @Test
    public void getIsCheckoutTest() {
        assertEquals(false, movie.getIsCheckout());
    }

    @Test
    public void setIsCheckoutTest() {
        movie.setIsCheckout(true);
        assertEquals(true, movie.getIsCheckout());
    }

    @Test
    public void displayDetailTest() {
        String detail = "Hello World!    2000    ywt    9.0\n";
        assertEquals(detail, movie.displayDetail());
    }
}
