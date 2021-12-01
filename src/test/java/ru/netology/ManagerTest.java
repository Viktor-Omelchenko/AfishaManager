package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import ru.netology.domain.Poster;
import ru.netology.manager.Manager;
import ru.netology.repository.repoPoster;


import static org.junit.jupiter.api.AssertArrayEquals.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

class ManagerTest {

    private final Manager manager = new Manager(repo);
    private final repoPoster repo = Mockito.mock(repoPoster.class);




    @Test
    void save() {


        doNothing().when(repo).add(ArgumentMatchers.any());
        manager.save("Number One");
        assertArrayEquals(new Poster[]{numberOne}, manager.lastFilms());
    }

    @Test
    void LastFilms() {

        doReturn(new Poster[]{numberOne, troll}).when(repo).findAll();
        assertArrayEquals(new Poster[]{troll, casper}, manager.lastFilms());
        }

    @Test
    void LastFilmsWithLimit() {
        doReturn(new Poster[]{numberOne, troll, casper}).when(repo).findAll();
        assertArrayEquals(new Poster[]{casper, troll}, manager.lastFilms());

        }

    }
