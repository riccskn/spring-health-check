package org.riccskn.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ExampleController {

    @GetMapping(value = "example")
    public String example() {
        return "Hello World!";
    }

}
