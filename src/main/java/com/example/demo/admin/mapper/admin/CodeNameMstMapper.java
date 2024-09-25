package com.example.demo.admin.mapper.admin;

import com.example.demo.admin.entity.admin.CodeNameMst;
import com.example.demo.admin.entity.admin.CodeNameMstExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeNameMstMapper {
    long countByExample(CodeNameMstExample example);

    int deleteByExample(CodeNameMstExample example);

    int deleteByPrimaryKey(BigDecimal PHYSCL_CD_NAME);

    int insert(CodeNameMst row);

    int insertSelective(CodeNameMst row);

    List<CodeNameMst> selectByExample(CodeNameMstExample example);

    CodeNameMst selectByPrimaryKey(BigDecimal PHYSCL_CD_NAME);

    int updateByExampleSelective(@Param("row") CodeNameMst row, @Param("example") CodeNameMstExample example);

    int updateByExample(@Param("row") CodeNameMst row, @Param("example") CodeNameMstExample example);

    int updateByPrimaryKeySelective(CodeNameMst row);

    int updateByPrimaryKey(CodeNameMst row);
}