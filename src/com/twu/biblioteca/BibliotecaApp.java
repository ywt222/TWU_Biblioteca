package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        System.out.println(bibliotecaApp.welcome());
    }

    public String welcome() {
        return "Hi, Welcome to Bangalore Public Library!";
    }
}
