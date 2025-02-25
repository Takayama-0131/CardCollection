package com.example.demo.admin.mapper.admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.admin.dto.CardSearchCriteria;
import com.example.demo.admin.dto.CardSearchDto;

@Mapper
public interface CardSearchMapper {
    List<CardSearchDto> selectCardSearch(@Param("searchInfo") CardSearchCriteria searchInfo);
}
