package com.thoughtworks.controller;

import com.thoughtworks.model.Book;
import com.thoughtworks.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/" )
public class BookController {

    @Autowired
    private BookRepository repository;

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public Book findBook( @ModelAttribute Book book ) {
        String id = book.getId();
        if ( id == null ) {
            id = "1";
        }
        return repository.findOne( id );
    }

    @RequestMapping( method = RequestMethod.POST )
    @ResponseBody
    public Book saveBook( @ModelAttribute Book book ) {
        return repository.save( book );
    }

}
