package com.example.demo.admin.mapper.admin;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.admin.entity.admin.CardMst;
import com.example.demo.admin.entity.admin.CardMstExample;

public interface CardMstMapper {
    long countByExample(CardMstExample example);

    int deleteByExample(CardMstExample example);

    int deleteByPrimaryKey(Short CARD_ID);

    int insert(CardMst row);

    int insertSelective(CardMst row);

    List<CardMst> selectByExampleWithBLOBs(CardMstExample example);

    List<CardMst> selectByExample(CardMstExample example);

    long selectByPrimaryKey(CardMst cardMst);

    int updateByExampleSelective(@Param("row") CardMst row, @Param("example") CardMstExample example);

    int updateByExampleWithBLOBs(@Param("row") CardMst row, @Param("example") CardMstExample example);

    int updateByExample(@Param("row") CardMst row, @Param("example") CardMstExample example);

    int updateByPrimaryKeySelective(CardMst row);

    int updateByPrimaryKeyWithBLOBs(CardMst row);

    int updateByPrimaryKey(CardMst row);
}