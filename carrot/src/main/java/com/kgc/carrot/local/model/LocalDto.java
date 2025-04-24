package com.kgc.carrot.local.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class LocalDto {

    private Long id;
    private String city;
    private String district;
    private String neighborhood;
    private LocalDateTime create_dt;
    private LocalDateTime update_dt;

}
