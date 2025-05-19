package com.kgc.carrot.local.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class LocalDto {


    @Schema(description = "지역 ID", example = "1")
    private Long id;

    @Schema(description = "시/도", example = "서울특별시")
    private String city;

    @Schema(description = "구/군", example = "강남구")
    private String district;
    private String neighborhood;
    private LocalDateTime create_dt;
    private LocalDateTime update_dt;

}
