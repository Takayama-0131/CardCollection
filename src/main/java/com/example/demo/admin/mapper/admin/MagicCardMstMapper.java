package com.example.demo.admin.mapper.admin;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.admin.entity.admin.MagicCardMst;
import com.example.demo.admin.entity.admin.MagicCardMstExample;

public interface MagicCardMstMapper {
    long countByExample(MagicCardMst magicCardMst);

    int deleteByExample(MagicCardMstExample example);

    int deleteByPrimaryKey(Short CARD_ID);

    int insert(MagicCardMst row);

    int insertSelective(MagicCardMst row);

    List<MagicCardMst> selectByExample(MagicCardMstExample example);

    MagicCardMst selectByPrimaryKey(Short CARD_ID);

    int updateByExampleSelective(@Param("row") MagicCardMst row, @Param("example") MagicCardMstExample example);

    int updateByExample(@Param("row") MagicCardMst row, @Param("example") MagicCardMstExample example);

    int updateByPrimaryKeySelective(MagicCardMst row);

    int updateByPrimaryKey(MagicCardMst row);
}