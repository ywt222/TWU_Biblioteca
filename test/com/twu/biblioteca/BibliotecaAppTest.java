package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaAppTest {

    @Test
    public void welcomeTest() {
        String welcomeMessage = "Hi, Welcome to Bangalore Public Library!";
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        assertEquals(welcomeMessage, bibliotecaApp.welcome());
    }
}
