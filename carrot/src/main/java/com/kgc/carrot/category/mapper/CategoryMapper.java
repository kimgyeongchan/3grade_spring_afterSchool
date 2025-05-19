package com.kgc.carrot.category.mapper;


import com.kgc.carrot.category.model.CategoryDetailDto;
import com.kgc.carrot.category.model.CategoryDto;
import com.kgc.carrot.local.model.LocalDetailDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {
    @Select("""
            select * from category;
            """)
    List<CategoryDto> findAll();

    @Select("""
            select * from category where id = #{id};
            """)
    CategoryDto findById(Long id);

    @Insert("""
            insert into category (name) values (#{name});
            """)
    void insertCategory(CategoryDto categoryDto);

    @Update("""
            UPDATE category
            SET name = #{name}
            WHERE id = 4;
            """)
    void updateCategory(CategoryDto categoryDto);

    @Delete("""
            delete from category where id = #{id};
            """)
    void deleteCategory(Long id);

    //xml 방식으로 Local테이블 User테이블 조인
    List<CategoryDetailDto> getTitlePostWithCategory();
}
