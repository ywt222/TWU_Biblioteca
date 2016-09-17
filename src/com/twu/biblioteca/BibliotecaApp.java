package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        System.out.println(bibliotecaApp.welcome());
        System.out.println(bibliotecaApp.addMenuList());
        bibliotecaApp.selectMenuList();
    }

    public String welcome() {
        return "Hi, Welcome to Bangalore Public Library!";
    }

    public String addMenuList() {
        Menu menu = new Menu();
        menu.addMenu("List Books");
        menu.addMenu("Checkout Books");
        menu.addMenu("Checkin Books");
        menu.addMenu("List Movies");
        menu.addMenu("Checkout Movies");
        menu.addMenu("Checkin Movies");
        return menu.displayMenuList();
    }

    public void selectMenuList() {
        Menu menu = new Menu();
        menu.selectMenu();
    }
}
