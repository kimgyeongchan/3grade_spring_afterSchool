package com.kgc.carrot.category.controller;

import com.kgc.carrot.category.model.CategoryDto;
import com.kgc.carrot.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cate") //기본 엔드포인트
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<CategoryDto> categoryAll = categoryService.getCategoryAll();
        return ResponseEntity.ok(categoryAll);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) {
        CategoryDto categoryDto = categoryService.getCategoryById(id);
        return ResponseEntity.ok(categoryDto);
    }

    @PostMapping
    public ResponseEntity<?> setCategory(@RequestBody CategoryDto categoryDto){
        categoryService.saveCategory(categoryDto);
        return ResponseEntity.ok("카테고리 추가됨");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCategory(@RequestBody CategoryDto categoryDto, @PathVariable("id") Long id){
        categoryService.updateCategory(id, categoryDto);
        return ResponseEntity.ok("업데이트됐음");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable("id") Long id){
        categoryService.deleteCategory(id);
        return ResponseEntity.ok("삭제됐음");
    }
}
