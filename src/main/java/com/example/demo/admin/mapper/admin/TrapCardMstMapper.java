package com.example.demo.admin.mapper.admin;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.admin.entity.admin.TrapCardMst;
import com.example.demo.admin.entity.admin.TrapCardMstExample;

public interface TrapCardMstMapper {
    long countByExample(TrapCardMst trapCardMst);

    int deleteByExample(TrapCardMstExample example);

    int deleteByPrimaryKey(Short CARD_ID);

    int insert(TrapCardMst row);

    int insertSelective(TrapCardMst row);

    List<TrapCardMst> selectByExample(TrapCardMstExample example);

    TrapCardMst selectByPrimaryKey(Short CARD_ID);

    int updateByExampleSelective(@Param("row") TrapCardMst row, @Param("example") TrapCardMstExample example);

    int updateByExample(@Param("row") TrapCardMst row, @Param("example") TrapCardMstExample example);

    int updateByPrimaryKeySelective(TrapCardMst row);

    int updateByPrimaryKey(TrapCardMst row);
}