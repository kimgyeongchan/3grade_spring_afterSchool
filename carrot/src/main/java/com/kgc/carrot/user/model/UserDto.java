package com.kgc.carrot.user.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserDto {
    private Long id;
    private Long localId;
    private String email;
    private String password;
    private String name;
    private int status;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
}
