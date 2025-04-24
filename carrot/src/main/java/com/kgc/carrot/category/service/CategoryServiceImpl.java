package com.kgc.carrot.category.service;

import com.kgc.carrot.category.mapper.CategoryMapper;
import com.kgc.carrot.category.model.CategoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryMapper categoryMapper;

    @Override
    public List<CategoryDto> getCategoryAll() {
        return categoryMapper.findAll();
    }

    @Override
    public CategoryDto getCategoryById(Long id) {
        return categoryMapper.findById(id);
    }

    @Override
    public void saveCategory(CategoryDto categoryDto) {
        categoryMapper.insertCategory(categoryDto);
    }

    @Override
    public void updateCategory(Long id, CategoryDto categoryDto) {
        categoryDto.setId(id);
        categoryMapper.updateCategory(categoryDto);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryMapper.deleteCategory(id);
    }


}
