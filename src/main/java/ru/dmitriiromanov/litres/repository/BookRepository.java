package ru.dmitriiromanov.litres.repository;

import ru.dmitriiromanov.litres.dto.internal.Book;

import java.util.List;

public interface BookRepository {

    List<Book> findAll();
}
