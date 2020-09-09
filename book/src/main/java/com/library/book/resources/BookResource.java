package com.library.book.resources;

import com.library.models.Author;
import com.library.models.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("book")
public class BookResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookResource.class);
    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public Book getBook() {
        Author author = restTemplate.getForObject("http://AUTHOR-SERVICE/author", Author.class);

        return new Book(101L, "Wings of Fire", author);
    }
}
