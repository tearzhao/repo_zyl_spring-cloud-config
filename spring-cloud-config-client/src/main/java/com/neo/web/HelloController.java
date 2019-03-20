package com.neo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @Value("${neo.hello}")
    private String hello;

    /**
     * http://localhost:8002/hello
     * @return
     */
    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}