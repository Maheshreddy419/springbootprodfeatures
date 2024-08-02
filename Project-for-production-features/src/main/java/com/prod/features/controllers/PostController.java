package com.prod.features.controllers;

import com.prod.features.dto.PostDto;
import com.prod.features.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(path = "/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;


    @GetMapping
    public ResponseEntity<List<PostDto>> getAllPosts(){
        return ResponseEntity.ok(postService.getAllPosts());
    }

    @GetMapping(path = "/{postsId}")
    public PostDto getPostById(@PathVariable Long postsId){
        return postService.getPostById(postsId);
    }
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto inputPost){
        PostDto postDto = postService.createPost(inputPost);
        return new ResponseEntity<>(postDto, HttpStatus.CREATED);
    }

}
