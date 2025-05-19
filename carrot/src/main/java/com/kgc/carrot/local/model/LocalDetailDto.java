package com.kgc.carrot.local.model;

import com.kgc.carrot.user.model.LocalUserDto;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class LocalDetailDto {

    private Long id;
    private String city;
    private String district;
    private String neighborhood;
    private List<LocalUserDto> users; //이름, 이메일 리스트

}
