package com.twu.biblioteca;

public class Movie extends Information {
    private double movieRating;

    public Movie(String name, String year, String author, double movieRating) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.movieRating = movieRating;
    }

    public String displayDetail() {
        String detail = this.name + "    " + this.year + "    " + this.author + "    " + this.movieRating + "\n";
        return detail;
    }
}
