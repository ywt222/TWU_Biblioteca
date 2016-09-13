package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<String> menu = new ArrayList();

    public void addMenu(String menu) {
        this.menu.add(menu);
    }

    public String displayMenuList() {
        String menuList = "";
        for (int i = 0; i < menu.size(); i++) {
            menuList = menuList + (i + 1) + ". " + menu.get(i) + "\n";
        }
        return menuList;
    }

    public void selectMenu() {
        BookList bookList = new BookList();
        Scanner inputId = new Scanner(System.in);
        int menuId = 0;
        int booId;
        while (menuId != 10) {
            System.out.println("Input the menu id you want to select!");
            menuId = inputId.nextInt();
            switch (menuId) {
                case 1:
                    System.out.println(bookList.getBookList());
                    break;
                case 2:
                    System.out.println("Input the book id you want to checkout!");
                    booId = inputId.nextInt();
                    System.out.println(bookList.checkoutBook(booId));
                    break;
                case 3:
                    System.out.println("Input the book id you want to checkin!");
                    booId = inputId.nextInt();
                    System.out.println(bookList.checkinBook(booId));
                    break;
                case 10:
                    System.out.println("You are quit, see you!");
                    break;
                default:
                    System.out.println("Select a valid option!");
                    break;
            }
        }
    }
}
