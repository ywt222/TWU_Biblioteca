package com.twu.biblioteca;

public class BookList {
    private Book[] bookList = new Book[6];

    public BookList() {
        bookList[0] = new Book("Twilight", "Stephanie Meyer", "2005");
        bookList[1] = new Book("Harry Potter", "J. K. Rowling", "2007");
        bookList[2] = new Book("Romeo and Juliet", "William Shakespeare", "1990");
        bookList[3] = new Book("Head First Java", "Kathy Sierra & Bert Bates", "2015");
        bookList[4] = new Book("C++ Primer Plus", "Stephen Prata", "2012");
    }

    public String getBookList() {
        String allBookList = "";
        for (int i = 0; i < 5; i++) {
            if (!bookList[i].getIsCheckout()) {
                allBookList = allBookList + (i + 1) + ". " + bookList[i].displayDetail();
            }
        }
        return allBookList;
    }

    public String checkoutBook(int id) {
        if ((id - 1) < 5 && !bookList[id - 1].getIsCheckout()) {
            bookList[id - 1].setIsCheckout(true);
            return "Thank you! Enjoy the book.";
        } else {
            return "That book is not available.";
        }
    }

    public String checkinBook(int id) {
        if ((id - 1) < 5 && bookList[id - 1].getIsCheckout()) {
            bookList[id - 1].setIsCheckout(false);
            return "Thank you for returning the book.";
        } else {
            return "That is not a valid book to return.";
        }
    }
}
