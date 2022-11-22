package com.example.blogapplication.controllers;

import com.example.blogapplication.repositories.BlogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BlogController {

    private final BlogRepository blogDao;

    public BlogController(BlogRepository blogDao){
        this.blogDao = blogDao;
    }


    @GetMapping
    public String homePage(){
        return "index";
    }

    @GetMapping("/")




}
