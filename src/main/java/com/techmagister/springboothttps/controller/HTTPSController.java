package com.techmagister.springboothttps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HTTPSController {

    @RequestMapping(value = "/hello")
    public String httpsexample() throws Exception {
        return "Hello, World";

    }
}
