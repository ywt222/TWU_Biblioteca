package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    @Test
    public void addMenuAndDisplayMenuTest() {
        Menu menu=new Menu();
        menu.addMenu("List Books");
        assertEquals("1. List Books\n", menu.displayMenuList());
    }
}
