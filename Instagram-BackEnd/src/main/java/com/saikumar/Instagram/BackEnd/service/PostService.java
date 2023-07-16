package com.saikumar.Instagram.BackEnd.service;

import com.saikumar.Instagram.BackEnd.model.Post;
import com.saikumar.Instagram.BackEnd.model.User;
import com.saikumar.Instagram.BackEnd.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {
    @Autowired
    IPostRepo postRepo;
    public String createInstagramPost(Post post) {
        post.setPostCreatedTimeStamp(LocalDateTime.now());
        postRepo.save(post);
        return "Post uploaded!!!!";
    }

    public String removeInstagramPost(Long postId, User user) {

        Post post  = postRepo.findById(postId).orElse(null);
        if(post != null && post.getPostOwner().equals(user))
        {
            postRepo.deleteById(postId);
            return "Removed successfully";
        }
        else if (post == null)
        {
            return "Post to be deleted does not exist";
        }
        else{
            return "Un-Authorized delete detected....Not allowed";
        }
    }

    public List<Post> getAllPosts() {
     return   postRepo.findAll();
    }
}
