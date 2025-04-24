package com.kgc.carrot.local.service;

import com.kgc.carrot.local.mapper.LocalMapper;
import com.kgc.carrot.local.model.LocalDto;
import lombok.RequiredArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor//생성자 만들어 줌
public class LocalServiceImpl implements LocalService{
    //의존성 주입 di가 되어서 객체를 사용할 수 있다
    private final LocalMapper localMapper;

    //지역 전체 조회
    @Override
    public List<LocalDto> getLocalAll() {
        return localMapper.findAll();
    }

    @Override
    public LocalDto getLocalById(Long id) {
        return localMapper.selectLocalById(id);

    }

    @Override
    public void saveLocal(LocalDto localDto) {
        localMapper.insertLocal(localDto);
    }

    @Override
    public void deleteLocal(Long id) {
        localMapper.deleteLocal(id);
    }

    @Override
    public void updateLocal(Long id, LocalDto updateDto) {
        updateDto.setId(id);
        localMapper.setById(updateDto);
    }


}
