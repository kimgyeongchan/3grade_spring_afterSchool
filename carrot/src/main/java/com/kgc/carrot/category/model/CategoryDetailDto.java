package com.kgc.carrot.category.model;

import com.kgc.carrot.post.model.PostCategoryDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryDetailDto {
    private Long id;
    private String name;
    private List<PostCategoryDto> posts;
}
