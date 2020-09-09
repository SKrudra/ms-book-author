package com.library.authorservice.resource;

import com.library.authorservice.models.Author.Author;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("author")
public class AuthorResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorResource.class);

    @GetMapping
    public Author get() {
        LOGGER.info("I'm book service");
        return new Author(201L, "Dr. APJ Abdul Kalam");
    }
}
