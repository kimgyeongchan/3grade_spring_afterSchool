package com.kgc.carrot.user.controller;


import com.kgc.carrot.user.model.UserDto;
import com.kgc.carrot.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<?> getAllUser() {
        List<UserDto> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> selectUser(@PathVariable("id") Long id) {
        UserDto userDto = userService.selectUserById(id);
        return ResponseEntity.ok(userDto);
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserDto userDto) {
        userService.insertUser(userDto);
        return ResponseEntity.ok("사용자 생성");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") Long id, @RequestBody UserDto updateDto) {
        userService.updateUser(id, updateDto);
        return ResponseEntity.ok("수정되었습니다.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("삭제되었습니다.");
    }
}