package com.example.demo.admin.mapper.admin;

import com.example.demo.admin.entity.admin.MonsterCardMst;
import com.example.demo.admin.entity.admin.MonsterCardMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonsterCardMstMapper {
    long countByExample(MonsterCardMstExample example);

    int deleteByExample(MonsterCardMstExample example);

    int deleteByPrimaryKey(Short CARD_ID);

    int insert(MonsterCardMst row);

    int insertSelective(MonsterCardMst row);

    List<MonsterCardMst> selectByExample(MonsterCardMstExample example);

    MonsterCardMst selectByPrimaryKey(Short CARD_ID);

    int updateByExampleSelective(@Param("row") MonsterCardMst row, @Param("example") MonsterCardMstExample example);

    int updateByExample(@Param("row") MonsterCardMst row, @Param("example") MonsterCardMstExample example);

    int updateByPrimaryKeySelective(MonsterCardMst row);

    int updateByPrimaryKey(MonsterCardMst row);
}