package com.saikumar.Instagram.BackEnd.controller;

import com.saikumar.Instagram.BackEnd.model.Post;
import com.saikumar.Instagram.BackEnd.model.User;
import com.saikumar.Instagram.BackEnd.model.dto.SignInInput;
import com.saikumar.Instagram.BackEnd.model.dto.SignUpOutput;
import com.saikumar.Instagram.BackEnd.service.AuthenticationService;
import com.saikumar.Instagram.BackEnd.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    AuthenticationService authenticationService;
    //sign up, sign in , sign out a particular instagram user
    @PostMapping("user/signup")
    public SignUpOutput signUpInstagramUser(@RequestBody User user)
    {

        return userService.signUpUser(user);
    }

    @PostMapping("user/signIn")
    public String signInInstagramUser(@RequestBody @Valid SignInInput signInInput)
    {
        return userService.signInUser(signInInput);
    }

    @DeleteMapping("user/signOut")
    public String signOutInstagramUser(String email, String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.signOutUser(email);
        }
        else {
            return "Sign out not allowed for non authenticated user.";
        }

    }
    @PostMapping("post")
    public String createInstagramPost(@RequestBody Post post, @RequestParam String email, @RequestParam String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.createInstagramPost(post,email);
        }
        else {
            return "Not an Authenticated user activity!!!";
        }
    }
    @DeleteMapping("post")
    public String removeInstagramPost(@RequestParam Long postId, @RequestParam String email, @RequestParam String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.removeInstagramPost(postId,email);
        }
        else {
            return "Not an Authenticated user activity!!!";
        }
    }

}
