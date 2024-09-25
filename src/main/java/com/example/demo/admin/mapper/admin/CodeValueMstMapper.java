package com.example.demo.admin.mapper.admin;

import com.example.demo.admin.entity.admin.CodeValueMst;
import com.example.demo.admin.entity.admin.CodeValueMstExample;
import com.example.demo.admin.entity.admin.CodeValueMstKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeValueMstMapper {
    long countByExample(CodeValueMstExample example);

    int deleteByExample(CodeValueMstExample example);

    int deleteByPrimaryKey(CodeValueMstKey key);

    int insert(CodeValueMst row);

    int insertSelective(CodeValueMst row);

    List<CodeValueMst> selectByExample(CodeValueMstExample example);

    CodeValueMst selectByPrimaryKey(CodeValueMstKey key);

    int updateByExampleSelective(@Param("row") CodeValueMst row, @Param("example") CodeValueMstExample example);

    int updateByExample(@Param("row") CodeValueMst row, @Param("example") CodeValueMstExample example);

    int updateByPrimaryKeySelective(CodeValueMst row);

    int updateByPrimaryKey(CodeValueMst row);
}