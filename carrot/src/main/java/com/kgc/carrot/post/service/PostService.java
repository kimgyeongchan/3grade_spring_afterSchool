package com.kgc.carrot.post.service;

import com.kgc.carrot.post.model.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> getAll();

    PostDto getById(Long id);

    void savePost(PostDto postDto);

    void setById(Long id, PostDto postDto);

    void rmById(Long id);
}
