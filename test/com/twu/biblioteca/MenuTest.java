package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {
    public Menu menu;

    @Before
    public void initialize() {
        menu = new Menu();
        menu.addMenu("List Books");
    }

    @Test
    public void displayMenuTest() {
        assertEquals("1. List Books\n", menu.displayMenuList());
    }

    @Test
    public void inValidMenuTest() {
        assertEquals("Select a valid option!", menu.inValidMenu(2));
    }

    @Test
    public void selectValidMenuTest() {
        assertEquals("List Books", menu.selectMenu(1));
    }

    @Test
    public void selectInvalidMenuTest() {
        assertEquals(null, menu.selectMenu(2));
    }

    @Test
    public void selectQuitMenuTest() {
        assertEquals(null, menu.selectMenu(10));
        assertEquals(true, menu.getIsQuit());
    }
}
