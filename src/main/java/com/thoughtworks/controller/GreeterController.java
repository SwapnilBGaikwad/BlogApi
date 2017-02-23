package com.thoughtworks.controller;

import com.thoughtworks.model.Book;
import com.thoughtworks.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/" )
public class GreeterController {

    @Autowired
    private BookRepository repository;

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public Book hello(@ModelAttribute Book book) {
        return repository.findOne( "1" );
    }

}
