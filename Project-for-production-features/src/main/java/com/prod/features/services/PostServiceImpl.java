package com.prod.features.services;

import com.prod.features.dto.PostDto;
import com.prod.features.entities.PostEntity;
import com.prod.features.exception.ResourceNotFoundException;
import com.prod.features.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<PostDto> getAllPosts() {
        List<PostEntity> postEntities = postRepository.findAll();
          List<PostDto> dtos = postEntities.stream()
                            .map(postEntity -> modelMapper.map(postEntity, PostDto.class))
                            .collect(Collectors.toList());
          return dtos;
    }

    @Override
    public PostDto createPost(PostDto inputPost) {
        PostEntity postEntity = modelMapper.map(inputPost, PostEntity.class);
        postEntity = postRepository.save(postEntity);
        return modelMapper.map(postEntity, PostDto.class);
    }

    @Override
    public PostDto getPostById(Long postsId) {
        PostEntity postEntity =  postRepository.findById(postsId).orElseThrow(() -> new ResourceNotFoundException("Post not found for this id :: " + postsId));
        return modelMapper.map(postEntity, PostDto.class);
    }
}
