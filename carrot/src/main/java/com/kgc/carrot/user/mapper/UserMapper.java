package com.kgc.carrot.user.mapper;


import com.kgc.carrot.user.model.UserDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("""
            select * from user
            """)
    List<UserDto> findAll();

    @Select("""
            select * from user where id = #{id};
            """)
    UserDto selectUserById(Long id);

    @Insert("""
            insert into user (local_id, email, password, name, status, create_dt, update_dt)
            values (#{localId}, #{email}, #{password}, #{name}, #{status}, now(), now())
            """)
    void insertUser(UserDto userDto);

    @Update("""
            update user set name = #{name} where id = #{id}
            """)
    void updateUserById(UserDto updateDto);

    @Delete("""
            delete from user where id = #{id}
            """)
    void deleteUserById(Long id);
}
