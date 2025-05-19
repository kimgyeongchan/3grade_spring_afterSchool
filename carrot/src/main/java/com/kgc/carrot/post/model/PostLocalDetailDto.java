package com.kgc.carrot.post.model;


import com.kgc.carrot.local.model.LocalPostDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PostLocalDetailDto {
    private Long id;
    private String city;
    private String district;
    private String neighborhood;
    private List<LocalPostDto> posts;
}
