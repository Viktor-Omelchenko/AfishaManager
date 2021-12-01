package ru.netology.domain;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Poster {
    private int id;
    private String name;
    private int year;
    private String genre;

}

