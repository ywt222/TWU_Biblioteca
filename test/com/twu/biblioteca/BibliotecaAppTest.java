package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaAppTest {
    BibliotecaApp bibliotecaApp = new BibliotecaApp();

    @Test
    public void welcomeTest() {
        String welcomeMessage = "Hi, Welcome to Bangalore Public Library!";
        assertEquals(welcomeMessage, bibliotecaApp.welcome());
    }

    @Test
    public void addMenuListTest() {
        String menuList = "1. List Books\n" + "2. Checkout Books\n" + "3. Checkin Books\n" + "4. List Movies\n" + "5. Checkout Movies\n" + "6. Checkin Movies\n";
        assertEquals(menuList, bibliotecaApp.addMenuList());
    }
}
