package com.kgc.carrot.post.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class PostDto {
    private Long id;
    private Long userId;
    private Long categoryId;
    private String title;
    private String content;
    private String price;
    private String status;
    private LocalDateTime created_dt;
    private LocalDateTime update_dt;
}
