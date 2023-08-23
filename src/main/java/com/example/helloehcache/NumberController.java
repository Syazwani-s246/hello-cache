package com.example.helloehcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// simple REST service that produces the square of a number
// REST controller
// calls a service to square a number and returns the result as a JSON string


@RestController
@RequestMapping("/number")
public class NumberController {


    @Autowired
    private NumberService numberService;

    @GetMapping("/square/{number}")
    public String getSquare(@PathVariable Long number) {
        return String.format("{\"square\": %s}", numberService.square(number));
    }
}