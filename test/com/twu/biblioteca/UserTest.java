package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user = new User("001-1111", "123456", "ywt", "ywt@email.com", "1234567");

    @Test
    public void getLibraryNumberTest() {
        assertEquals("001-1111", user.getLibraryNumber());
    }

    @Test
    public void getPasswordTest() {
        assertEquals("123456", user.getPassword());
    }

    @Test
    public void getIsLoginTest() {
        assertEquals(false, user.getIsLogin());
    }

    @Test
    public void setIsLoginTest() {
        user.setIsLogin(true);
        assertEquals(true, user.getIsLogin());
    }

    @Test
    public void showInformationTest() {
        String information = "ywt    ywt@email.com    1234567\n";
        assertEquals(information, user.showInformation());
    }
}
