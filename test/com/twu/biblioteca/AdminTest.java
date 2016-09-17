package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdminTest {
    Admin admin = new Admin();

    @Test
    public void getIdTest(){
        assertEquals("ywt", admin.getId());
    }

    @Test
    public void getPasswordTest(){
        assertEquals("123", admin.getPassword());
    }
}
