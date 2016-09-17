package com.twu.biblioteca;

public class Movie {
    private String name;
    private String year;
    private String director;
    private double movieRating;
    private boolean isCheckout = false;

    public Movie(String name, String year, String director, double movieRating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }

    public boolean getIsCheckout() {
        return isCheckout;
    }

    public void setIsCheckout(boolean isCheckout) {
        this.isCheckout = isCheckout;
    }

    public String displayDetail() {
        String detail = this.name + "    " + this.year + "    " + this.director + "    " + this.movieRating + "\n";
        return detail;
    }
}
