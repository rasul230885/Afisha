package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Moviel;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaTest {
    private AfishaManager manager = new AfishaManager();
    private Moviel first = new Moviel(1, 1, "movie1", "genre1");
    private Moviel second = new Moviel(2, 2, "movie2", "genre2");
    private Moviel third = new Moviel(3, 3, "movie3", "genre3");
    private Moviel fourth = new Moviel(4, 4, "movie4", "genre4");
    private Moviel fifth = new Moviel(5, 5, "movie5", "genre5");
    private Moviel sixth = new Moviel(6, 6, "movie6", "genre6");
    private Moviel seventh = new Moviel(7, 7, "movie7", "genre7");
    private Moviel eight = new Moviel(8, 8, "movie8", "genre8");
    private Moviel ninth = new Moviel(9, 9, "movie9", "genre9");
    private Moviel tenth = new Moviel(10, 10, "movie10", "genre10");
    private Moviel eleventh = new Moviel(11, 11, "movie11", "genre11");

    @BeforeEach
    void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(ninth);
    }

    @Test
    void shouldGetLessThenLengthMovie() {
        Moviel[] actual = manager.showLast();
        Moviel[] expected = new Moviel[]{ninth, eight, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetMoreThenLengthMovie() {
        manager.add(tenth);
        manager.add(eleventh);
        Moviel[] actual = manager.showLast();
        Moviel[] expected = new Moviel[]{eleventh, tenth, ninth, eight, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetEqualLengthMovie() {
        manager.add(tenth);
        Moviel[] actual = manager.showLast();
        Moviel[] expected = new Moviel[]{tenth, ninth, eight, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
}
