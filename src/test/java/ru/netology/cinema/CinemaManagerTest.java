package ru.netology.cinema;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieManagerTest {

    private Cinema movie1 = new Cinema(1, "Бладшот");
    private Cinema movie2 = new Cinema(2, "Вперёд");
    private Cinema movie3 = new Cinema(3, "Отель Белград");
    private Cinema movie4 = new Cinema(4, "Джентельмены");
    private Cinema movie5 = new Cinema(5, "Человек-невидимка");
    private Cinema movie6 = new Cinema(6, "Тролли.");
    private Cinema movie7 = new Cinema(7, "Титаник");
    private Cinema movie8 = new Cinema(8, "Человек-паук");
    private Cinema movie9 = new Cinema(9, "Аватар");
    private Cinema movie10 = new Cinema(10, "Ешь Люби Молись");
    private Cinema movie11 = new Cinema(11, "Фиксики");

    @Test
    public void shouldAddMovie() {
        CinemaManager movie = new CinemaManager();

        movie.add(movie1);
        movie.add(movie2);

        Cinema[] expected = {movie1, movie2};
        Cinema[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullMovie() {
        CinemaManager movie = new CinemaManager();
        Cinema[] expected = {};
        Cinema[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit() {
        CinemaManager movie = new CinemaManager();

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        Cinema[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        Cinema[] actual = movie.findAll();

       Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllOverLimit() {
        CinemaManager movie = new CinemaManager();

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);
        movie.add(movie11);

        Cinema[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        Cinema[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit4() {
        CinemaManager movie = new CinemaManager(4);

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);

        Cinema[] expected = {movie1, movie2, movie3, movie4};
        Cinema[] actual = movie.findAll();

       Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenMovie() {
        CinemaManager movie = new CinemaManager();

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);

        Cinema[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Cinema[] actual = movie.findLastTen();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenLimit() {
        CinemaManager movie = new CinemaManager();

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        Cinema[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Cinema[] actual = movie.findLastTen();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenLimit5() {
        CinemaManager movie = new CinemaManager(5);

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        Cinema[] expected = {movie10, movie9, movie8, movie7, movie6};
        Cinema[] actual = movie.findLastTen();

        Assertions.assertArrayEquals(expected, actual);
    }
}