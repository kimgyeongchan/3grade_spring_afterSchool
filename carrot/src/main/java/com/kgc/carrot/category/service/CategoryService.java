package com.kgc.carrot.category.service;


import com.kgc.carrot.category.model.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> getCategoryAll();

    CategoryDto getCategoryById(Long id);

    void saveCategory(CategoryDto categoryDto);

    void updateCategory(Long id, CategoryDto categoryDto);

    void deleteCategory(Long id);




}
