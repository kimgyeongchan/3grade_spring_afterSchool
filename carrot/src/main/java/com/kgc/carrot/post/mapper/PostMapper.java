package com.kgc.carrot.post.mapper;


import com.kgc.carrot.post.model.PostLocalDetailDto;
import com.kgc.carrot.post.model.PostDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostMapper {
    @Select("""
            select * from user;
            """)
    List<PostDto> findAll();
    @Select("""
            select * from post where id=#{id};
            """)
    PostDto findById(Long id);
    @Insert("""
            insert into
            post (user_id, category_id, title, content,	price,status, created_dt, update_dt)
            values (#{userId}, #{categoryId}, #{title}, #{content}, #{price}, #{status}, now(), now());
            """)
    void insertAll(PostDto postDto);
    @Update("""
            update post set
            title = #{title},
            content = #{content},
            price = #{price},
            status = #{status},
            update_dt = now()
            where id = #{id};
            """)
    void updateAll(PostDto postDto);
    @Delete("""
            delete from post where id = #{id};
            """)
    void deleteById(Long id);

    List<PostLocalDetailDto> findPostWithLocal();

}
