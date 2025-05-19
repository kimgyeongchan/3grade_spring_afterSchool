package com.kgc.carrot.local.service;


import com.kgc.carrot.local.model.LocalDetailDto;
import com.kgc.carrot.local.model.LocalDto;

import java.util.List;

public interface LocalService {
    List<LocalDto> getLocalAll();

    //지역별 유저 조회
    List<LocalDetailDto> getAllLocalWithUsers();

    LocalDto getLocalById(Long id);

    void saveLocal(LocalDto localDto);

    void deleteLocal(Long id);

    void updateLocal(Long id, LocalDto localDto);


}
