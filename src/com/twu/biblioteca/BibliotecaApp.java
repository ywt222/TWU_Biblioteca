package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        System.out.println(bibliotecaApp.welcome());
        System.out.println(bibliotecaApp.logIn());
        if (!bibliotecaApp.logIn().equals("Login wrong!")) {
            System.out.println(bibliotecaApp.addMenuList());
            bibliotecaApp.selectMenuList();
        }
    }

    public String welcome() {
        return "Hi, Welcome to Bangalore Public Library!\n" +
                "Please input libraryNumber and password to log in!";
    }

    public String logIn() {
        UserList userList = new UserList();
        Scanner input = new Scanner(System.in);
        String libraryNumber = input.next();
        String password = input.next();
        return userList.login(libraryNumber, password);
    }

    public String addMenuList() {
        Menu menu = new Menu();
        menu.addMenu("List Books");
        menu.addMenu("Checkout Books");
        menu.addMenu("Checkin Books");
        menu.addMenu("List Movies");
        menu.addMenu("Checkout Movies");
        menu.addMenu("Checkin Movies");
        menu.addMenu("Admin");
        return menu.displayMenuList();
    }

    public void selectMenuList() {
        Menu menu = new Menu();
        menu.selectMenu();
    }
}
