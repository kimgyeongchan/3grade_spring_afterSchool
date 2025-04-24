package com.kgc.carrot.user.service;


import com.kgc.carrot.user.mapper.UserMapper;
import com.kgc.carrot.user.model.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserSerivceImpl implements UserService{
    private final UserMapper userMapper;

    @Override
    public List<UserDto> getAllUser() {
        return userMapper.findAll();
    }

    @Override
    public UserDto selectUserById(Long id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public void insertUser(UserDto userDto) {
        userMapper.insertUser(userDto);
    }

    @Override
    public void updateUser(Long id, UserDto updateDto) {
        updateDto.setId(id);
        userMapper.updateUserById(updateDto);
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.deleteUserById(id);
    }
}