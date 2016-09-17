package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieListTest {
    MovieList movieList = new MovieList();

    String allMovieList =
            "1. The Twilight Saga    2008    Catherine Hardwicke    8.3\n" +
            "2. Harry Potter    2001    Chris Columbus    8.2\n" +
            "3. Forrest Gump    1994    Robert Zemeckis    8.8\n" +
            "4. Fast & Furious 7    2015    James Wan    8.6\n" +
            "5. Iron Man    2008    Jon Favreau    8.0\n";
    String partMovieList =
            "1. The Twilight Saga    2008    Catherine Hardwicke    8.3\n" +
            "3. Forrest Gump    1994    Robert Zemeckis    8.8\n" +
            "4. Fast & Furious 7    2015    James Wan    8.6\n" +
            "5. Iron Man    2008    Jon Favreau    8.0\n";

    @Test
    public void getBookListTest() {
        assertEquals(allMovieList, movieList.getMovieList());
    }

    @Test
    public void checkoutAndCheckinMovieSuccessTest() {
        String checkoutSuccessResponse ="Thank you! Enjoy the movie.";
        String checkinSuccessResponse ="Thank you for returning the movie.";

        assertEquals(checkoutSuccessResponse, movieList.checkoutMovie(2));
        assertEquals(partMovieList, movieList.getMovieList());

        assertEquals(checkinSuccessResponse, movieList.checkinMovie(2));
        assertEquals(allMovieList, movieList.getMovieList());
    }

    @Test
    public void checkoutMovieFailedTest() {
        String checkoutFailedResponse ="That movie is not available.";

        assertEquals(checkoutFailedResponse, movieList.checkoutMovie(6));
        assertEquals(allMovieList, movieList.getMovieList());
    }

    @Test
    public void checkinMovieFailedTest() {
        String checkinFailedResponse ="That is not a valid movie to return.";

        assertEquals(checkinFailedResponse, movieList.checkinMovie(6));
        assertEquals(allMovieList, movieList.getMovieList());
    }
}
