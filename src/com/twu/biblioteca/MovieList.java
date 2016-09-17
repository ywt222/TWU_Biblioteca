package com.twu.biblioteca;

public class MovieList {
    private Movie[] movieList = new Movie[5];

    public MovieList() {
        movieList[0] = new Movie("The Twilight Saga", "2008", "Catherine Hardwicke", 8.3);
        movieList[1] = new Movie("Harry Potter", "2001", "Chris Columbus", 8.2);
        movieList[2] = new Movie("Forrest Gump", "1994", "Robert Zemeckis", 8.8);
        movieList[3] = new Movie("Fast & Furious 7", "2015", "James Wan", 8.6);
        movieList[4] = new Movie("Iron Man", "2008", "Jon Favreau", 8.0);
    }

    public String getMovieList() {
        String allMovieList = "";
        for (int i = 0; i < 5; i++) {
            if (!movieList[i].getIsCheckout()) {
                allMovieList = allMovieList + (i + 1) + ". " + movieList[i].displayDetail();
            }
        }
        return allMovieList;
    }

    public String checkoutMovie(int id) {
        if ((id - 1) < 5 && !movieList[id - 1].getIsCheckout()) {
            movieList[id - 1].setIsCheckout(true);
            return "Thank you! Enjoy the movie.";
        } else {
            return "That movie is not available.";
        }
    }

    public String checkinMovie(int id) {
        if ((id - 1) < 5 && movieList[id - 1].getIsCheckout()) {
            movieList[id - 1].setIsCheckout(false);
            return "Thank you for returning the movie.";
        } else {
            return "That is not a valid movie to return.";
        }
    }
}
