package ru.netology.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Poster;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class repoPoster<items> {

    private Poster[] items = new Poster[0];

    public Poster[] add(Poster item) {
        Poster[] tmp = new Poster[items.length + 1];


        System.arraycopy(items, 0, tmp, 0, 0);
        tmp[tmp.length - 1] = item;

        this.items = tmp;


        return items;
    }
}





