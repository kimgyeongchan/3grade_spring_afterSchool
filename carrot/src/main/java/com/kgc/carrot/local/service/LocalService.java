package com.kgc.carrot.local.service;


import com.kgc.carrot.local.model.LocalDto;

import java.util.List;

public interface LocalService {
    List<LocalDto> getLocalAll();

    LocalDto getLocalById(Long id);

    void saveLocal(LocalDto localDto);

    void deleteLocal(Long id);

    void updateLocal(Long id, LocalDto localDto);
}
