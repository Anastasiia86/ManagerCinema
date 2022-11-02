package ru.netology.cinema;

public class CinemaManager {

    private int countMovie = 10;
    private Cinema[] movies = new Cinema[0];

    public CinemaManager(int countMovie) {
        this.countMovie = countMovie;
    }

    public CinemaManager() {
    }

    public void add(Cinema movie) {
        int length = movies.length + 1;
        Cinema[] tmp = new Cinema[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Cinema[] findLastTen() {

        int resultLength = movies.length;
        if (resultLength > countMovie) {
            resultLength = countMovie;
        } else {
            resultLength = movies.length;
        }
        Cinema[] result = new Cinema[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public Cinema[] findAll() {
        int resultLength = movies.length;
        if (resultLength > countMovie) {
            resultLength = countMovie;
        } else {
            resultLength = movies.length;
        }
        Cinema[] result = new Cinema[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[i];
        }
        return result;
    }


}


