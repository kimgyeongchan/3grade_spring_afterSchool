package com.kgc.carrot.local.controller;


import com.kgc.carrot.local.model.LocalDto;
import com.kgc.carrot.local.service.LocalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //rest-api
@RequiredArgsConstructor //final이 붙은 생성자를 초기화 한다
@RequestMapping("/api") //공통적으로 url 선언
public class LocalController {
    private final LocalService localService;

    //get post put delete patch

    @GetMapping
    public ResponseEntity<?> findAll () {
        List<LocalDto> localAll = localService.getLocalAll();
        return ResponseEntity.ok(localAll);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getLocalByid (@PathVariable("id") long id){
        LocalDto localById = localService.getLocalById(id);
        return ResponseEntity.ok(localById);
    }

    //등록
    @PostMapping
    public ResponseEntity<?> createLocal (@RequestBody LocalDto localDto){
        localService.saveLocal(localDto);
        return ResponseEntity.ok("유저생성!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLocal(@PathVariable("id") Long id){
        localService.deleteLocal(id);
        return ResponseEntity.ok("삭제되었습니다");
    }


    @PutMapping("/{id}")
    ResponseEntity<?> updateLocal(@PathVariable("id") Long id, @RequestBody LocalDto updateDto) {
        localService.updateLocal(id,updateDto);
        return ResponseEntity.ok("수정되었습니다.");
    }


    //수정,삭제 과제


}
