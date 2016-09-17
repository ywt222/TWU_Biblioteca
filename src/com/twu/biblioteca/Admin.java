package com.twu.biblioteca;

public class Admin {
    private String id = "ywt";
    private String password = "123";

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String showCheckoutBooks() {
        BookList bookList = new BookList();
        return bookList.getAdminBookList();
    }
}
