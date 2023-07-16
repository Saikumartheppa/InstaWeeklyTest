package com.saikumar.Instagram.BackEnd.controller;

import com.saikumar.Instagram.BackEnd.model.Post;
import com.saikumar.Instagram.BackEnd.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
}
