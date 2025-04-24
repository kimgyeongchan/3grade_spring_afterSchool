package com.kgc.carrot.user.service;



import com.kgc.carrot.user.model.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUser();
    // Get
    UserDto selectUserById(Long id);
    // Post
    void insertUser(UserDto userDto);
    // Put
    void updateUser(Long id, UserDto updateDto);
    // Delete
    void deleteUser(Long id);
}
