package com.thoughtworks.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book")
public class Book implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    private String id;
    @Column(name = "title")
    private String title;

    public Book() {
    }

    public Book( String title ) {
        this.title = title;
        this.id = title;
    }

    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    @Override public String toString() {
        return title;
    }
}
