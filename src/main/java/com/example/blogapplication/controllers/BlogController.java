package com.example.blogapplication.controllers;

import com.example.blogapplication.models.Blog;
import com.example.blogapplication.models.User;
import com.example.blogapplication.repositories.BlogRepository;
import com.example.blogapplication.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blogs")
public class BlogController {

    private final BlogRepository blogDao;
    private final UserRepository userDao;

    public BlogController(BlogRepository blogDao, UserRepository userDao){
        this.blogDao = blogDao;
        this.userDao = userDao;
    }

//    @GetMapping()
//    public String homeRedirect(){
//        return "/index";
//    }

    @GetMapping
    public String homePage(Model model){
        List<Blog> allBlogs = blogDao.findAll();
        model.addAttribute("allBlogs", allBlogs);
        return "index";
    }



    @GetMapping("/create")
    public String postPage(){
        return "create";
    }

    @PostMapping("/create")
    public String postBlog(@RequestParam(name="title") String title, @RequestParam(name="body") String body){
        User user = userDao.findById(1);
        Blog blog = new Blog(title, body, user);
        blogDao.save(blog);
        return "redirect:/blogs";
    }

    @GetMapping("/{id}")
    public String showPosts(@PathVariable long id, Model model){
        Blog blog = blogDao.findById(id);
        model.addAttribute("blog", blog);
        return "show";
    }










}
