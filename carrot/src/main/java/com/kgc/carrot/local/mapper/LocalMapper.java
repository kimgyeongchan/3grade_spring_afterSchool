package com.kgc.carrot.local.mapper;

import com.kgc.carrot.local.model.LocalDetailDto;
import com.kgc.carrot.local.model.LocalDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LocalMapper {
    //지역전체조회
    @Select("""
            SELECT * FROM local
            """)
    List<LocalDto> findAll(); //지역 전체 조회

    //지역상세조회
    @Select("""
            select * from local where id = #{id}
            """)
    LocalDto selectLocalById(Long id);

    //지역등록
    @Insert("""
            insert into
            local (city, district, neighborhood, create_dt, update_dt)
            values (#{city},#{district},#{neighborhood}, now(), now());
            """)
    void insertLocal(LocalDto localDto);

    @Delete("""
            delete from local where id = #{id};
            """)
    void deleteLocal(Long id);

    //업데이트
    @Update("""
            UPDATE local
            SET city = #{city},
                district = #{district},
                neighborhood = #{neighborhood},
                create_dt = NOW(),
                update_dt = NOW()
            WHERE id = #{id};
            """)
    void setById(LocalDto localDto);

    //xml 방식으로 Local테이블 User테이블 조인
    List<LocalDetailDto> findAllLocalWithUsers();
}
