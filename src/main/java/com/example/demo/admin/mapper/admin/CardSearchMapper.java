package com.example.demo.admin.mapper.admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.admin.dto.CardSearchCriteria;
import com.example.demo.admin.dto.CardSearchDto;
import com.example.demo.admin.dto.CardSearchInfoDto;

@Mapper
public interface CardSearchMapper {
    List<CardSearchDto> selectCardSearch(@Param("searchInfo") CardSearchCriteria searchInfo);
    
    // カード種別のリストを取得するメソッドを追加
    @Select("SELECT LGCL_CD_NAME, CD_VAL FROM CODE_VALUE_MST WHERE PHYSCL_CD_NAME = 'CARD_KIND'")
    List<CardSearchInfoDto> selectCardKinds();
}
