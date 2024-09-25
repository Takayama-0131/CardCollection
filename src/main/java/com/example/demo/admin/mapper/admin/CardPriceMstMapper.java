package com.example.demo.admin.mapper.admin;

import com.example.demo.admin.entity.admin.CardPriceMst;
import com.example.demo.admin.entity.admin.CardPriceMstExample;
import com.example.demo.admin.entity.admin.CardPriceMstKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardPriceMstMapper {
    long countByExample(CardPriceMstExample example);

    int deleteByExample(CardPriceMstExample example);

    int deleteByPrimaryKey(CardPriceMstKey key);

    int insert(CardPriceMst row);

    int insertSelective(CardPriceMst row);

    List<CardPriceMst> selectByExample(CardPriceMstExample example);

    CardPriceMst selectByPrimaryKey(CardPriceMstKey key);

    int updateByExampleSelective(@Param("row") CardPriceMst row, @Param("example") CardPriceMstExample example);

    int updateByExample(@Param("row") CardPriceMst row, @Param("example") CardPriceMstExample example);

    int updateByPrimaryKeySelective(CardPriceMst row);

    int updateByPrimaryKey(CardPriceMst row);
}