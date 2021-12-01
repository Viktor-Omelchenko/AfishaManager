package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import ru.netology.domain.Poster;


@AllArgsConstructor
@RequiredArgsConstructor

    public class Manager {

    private Manager repo;
    private int limit = 10;
    private int i;


    public Poster[] save(String poster) {
        repo.add(poster);



    public Poster[] lastFilms(Poster poster){
            Poster[] allFromRepo = repo.findAll();

            Poster[] tmp = new Poster[Math.min(allFromRepo.length, limit)];
            for (int i = 0; i < tmp.length; i++){

                tmp[i] = allFromRepo[allFromRepo.length - 1 - i];
                {
                    {
                        return tmp;

                    }

                }
            }
        }
    }

    private void add(Poster poster) {
    }


}

