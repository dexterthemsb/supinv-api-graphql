package com.dexter.graph.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dexter.graph.models.Book;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BookResolver implements GraphQLQueryResolver {
    public Book getBook(UUID id) {
        Book newBook = new Book();
        newBook.setId(id);
        newBook.setTitle("Hello There");
        newBook.setGenre("Horror");

        return newBook;
    }
}
