package com.yeonnnnjs.catalogservice.domain;

public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String isbn) {
        super("The Book with ISBN " + isbn + " already exists.");
    }
}
