package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserListTest {
    UserList userList = new UserList();

    @Test
    public void loginSuccessTest() {
        boolean loginStatus = userList.login("002-2112", "345678");
        assertEquals(true, loginStatus);
    }

    @Test
    public void loginFailedTest() {
        boolean loginStatus = userList.login("002-2112", "445678");
        assertEquals(false, loginStatus);
    }
}
