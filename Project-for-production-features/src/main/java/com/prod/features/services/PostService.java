package com.prod.features.services;

import com.prod.features.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    List<PostDto> getAllPosts();

    PostDto createPost(PostDto inputPost);

    PostDto getPostById(Long postsId);
}
