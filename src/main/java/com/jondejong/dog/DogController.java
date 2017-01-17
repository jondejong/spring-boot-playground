package com.jondejong.dog;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jondejong on 1/16/17.
 */
@RestController
public class DogController {


    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }
}
