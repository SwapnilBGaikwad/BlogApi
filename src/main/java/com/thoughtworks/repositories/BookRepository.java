package com.thoughtworks.repositories;

import com.thoughtworks.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book , String> {
    @Override Book findOne( String id );

    @Override Book save( Book book );
}
