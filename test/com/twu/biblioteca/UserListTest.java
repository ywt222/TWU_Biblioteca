package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserListTest {
    UserList userList = new UserList();

    @Test
    public void loginSuccessTest() {
        String information = "Steve    456@email.com    12345677\n";
        assertEquals(information, userList.login("002-2112", "345678"));
    }

    @Test
    public void loginFailedTest() {
        String information = "Login wrong!";
        assertEquals(information, userList.login("002-2112", "445678"));
    }
}
