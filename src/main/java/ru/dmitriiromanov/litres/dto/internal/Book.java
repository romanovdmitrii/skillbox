package ru.dmitriiromanov.litres.dto.internal;

import lombok.Data;

@Data
public class Book {

    private int id;

    private String author;

    private String title;

    private int size;
}