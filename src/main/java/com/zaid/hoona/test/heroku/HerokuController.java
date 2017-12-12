package com.zaid.hoona.test.heroku;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuController {

    @RequestMapping("/")
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
