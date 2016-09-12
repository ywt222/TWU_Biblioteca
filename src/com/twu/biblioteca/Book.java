package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String yearPublished;
    private boolean isCheckout = false;

    public Book(String title, String author, String yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public boolean getIsCheckout() {
        return isCheckout;
    }

    public void setIsCheckout(boolean isCheckout) {
        this.isCheckout = isCheckout;
    }

    public String displayDetail() {
        String detail = this.title + "    " + this.author + "    " + this.yearPublished + "\n";
        return detail;
    }
}
