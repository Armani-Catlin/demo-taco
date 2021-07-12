package com.example.demotaco.web;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Profile("development")
public class MyErrorController implements ErrorController {
    @RequestMapping(" /error")
    public String broke(){
        return "You too broke fam!";
    }
}
