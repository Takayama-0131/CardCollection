package com.example.demo.admin.mapper.admin;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.example.demo.admin.dto.MonsterCardDto;

@Mapper
public interface MonsterCardMapper {
    MonsterCardDto selectMonsterLevelAndCardName(@Param("cardId") Integer cardId);
}