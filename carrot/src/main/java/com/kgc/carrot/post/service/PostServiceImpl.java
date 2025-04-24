package com.kgc.carrot.post.service;

import com.kgc.carrot.post.mapper.PostMapper;
import com.kgc.carrot.post.model.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostMapper postMapper;

    @Override
    public List<PostDto> getAll() {
        return postMapper.findAll();
    }

    @Override
    public PostDto getById(Long id) {
        return postMapper.findById(id);
    }

    @Override
    public void savePost(PostDto postDto) {
        postMapper.insertAll(postDto);
    }

    @Override
    public void setById(Long id, PostDto postDto) {
        postDto.setId(id);
        postMapper.updateAll(postDto);
    }

    @Override
    public void rmById(Long id) {
        postMapper.deleteById(id);
    }
}
