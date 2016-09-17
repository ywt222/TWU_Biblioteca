package com.twu.biblioteca;

public class UserList {
    private User[] userList = new User[5];

    public UserList() {
        userList[0] = new User("001-1234", "123456", "Bob", "123@email.com", "12345678");
        userList[1] = new User("001-1211", "234567", "Alice", "abc@email.com", "12345666");
        userList[2] = new User("002-2112", "345678", "Steve", "456@email.com", "12345677");
        userList[3] = new User("003-1234", "456789", "Amy", "def@email.com", "12345688");
        userList[4] = new User("001-4567", "567890", "Lily", "789@email.com", "12345699");
    }

    public String login(String libraryNumber, String password) {
        for (int i = 0; i < 5; i++) {
            if ((userList[i].getLibraryNumber().equals(libraryNumber)) && (userList[i].getPassword().equals(password))) {
                userList[i].setIsLogin(true);
                return userList[i].getName() + "    " + userList[i].getEmail() + "    " + userList[i].getPhone() + "\n";
            }
        }
        return "Login wrong!";
    }
}
