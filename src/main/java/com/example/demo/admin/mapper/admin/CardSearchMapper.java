package com.example.demo.admin.mapper.admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.admin.dto.CardKindSearchInfoDto;
import com.example.demo.admin.dto.CardSearchCriteria;
import com.example.demo.admin.dto.CardSearchDto;
import com.example.demo.admin.dto.MagicKindSearchInfoDto;
import com.example.demo.admin.dto.MonsterKindSearchInfoDto;
import com.example.demo.admin.dto.TrapKindSearchInfoDto;

@Mapper
public interface CardSearchMapper {
    List<CardSearchDto> selectCardSearch(@Param("searchInfo") CardSearchCriteria searchInfo);
    
    // カード種別のリストを取得するメソッドを追加
    List<CardKindSearchInfoDto> selectCardKinds();
    
    // モンスター種別のリストを取得するメソッドを追加
    List<MonsterKindSearchInfoDto> selectMonsterKinds();
    
    // 魔法種別のリストを取得するメソッドを追加
    List<MagicKindSearchInfoDto> selectMagicKinds();
    
    // 罠種別のリストを取得するメソッドを追加
    List<TrapKindSearchInfoDto> selectTrapKinds();
}
