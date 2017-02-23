package com.thoughtworks.controller;

import com.thoughtworks.model.Greeter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/" )
public class GreeterController {

    @RequestMapping( method = RequestMethod.GET )
    @ResponseBody
    public Greeter hello() {
        return new Greeter( "New method" );
    }

}
