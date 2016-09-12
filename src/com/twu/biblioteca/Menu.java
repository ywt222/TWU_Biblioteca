package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> menu = new ArrayList();
    private boolean isQuit = false;

    public boolean getIsQuit() {
        return isQuit;
    }

    public void setIsQuit(boolean isQuit) {
        this.isQuit = isQuit;
    }

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

    public String inValidMenu(int id) {
        if (id > menu.size()) {
            return "Select a valid option!";
        } else return null;
    }

    public String selectMenu(int id) {
        if (inValidMenu(id) == null)
            return menu.get(id - 1);
        else if (id == 10) {
            setIsQuit(true);
            return null;
        } else
            return null;
    }
}
