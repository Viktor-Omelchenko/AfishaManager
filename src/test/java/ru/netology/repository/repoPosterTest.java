package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.*;

class repoPosterTest {

    private final repoPoster repo = new repoPoster();

    private final Poster numberOne = new Poster(1, "Number One", 2021, comedy);
    private final Poster troll = new Poster(2, "Troll", 2020, cartoon);
    private final Poster casper = new Poster(3, "Casper", 2012, horror);


    @BeforeEach

    void setUp(){

        repo.add(numberOne);
        repo.add(troll);
        repo.add(casper);
    }


    @Test

    void findAll(){

        assertArrayEquals({numberOne, troll, casper}, repo.findAll());
    }


}