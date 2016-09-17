package com.twu.biblioteca;

public class User {
    private String libraryNumber;
    private String password;
    private String name;
    private String email;
    private String phone;
    protected boolean isLogin = false;

    public User(String libraryNumber, String password, String name, String email, String phone) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }

    public void checkoutBook(int id) {
        BookList bookList = new BookList();
        bookList.checkoutBook(id, this.name);
    }
}
