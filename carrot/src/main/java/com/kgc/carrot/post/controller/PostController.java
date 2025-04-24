package com.kgc.carrot.post.controller;

import com.kgc.carrot.post.model.PostDto;
import com.kgc.carrot.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping
    public ResponseEntity<?> getAllPost(){
        List<PostDto> PostFind = postService.getAll();
        return ResponseEntity.ok(PostFind);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getByIdPost(@PathVariable("id") Long id) {
        PostDto byId = postService.getById(id);
        return ResponseEntity.ok(byId);
    }

    @PostMapping
    public ResponseEntity<?> savePost(@RequestBody PostDto postDto) {
        postService.savePost(postDto);
        return ResponseEntity.ok("게시판 생성");
    }
    
    @PutMapping("/{id}")
    public  ResponseEntity<?> updatePost(@PathVariable("id") Long id, @RequestBody PostDto postDto){
        postService.setById(id, postDto);
        return ResponseEntity.ok("업데이트 완료");
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePost(@PathVariable("id") Long id){
        postService.rmById(id);
        return ResponseEntity.ok("삭제 완료");
    }
}
