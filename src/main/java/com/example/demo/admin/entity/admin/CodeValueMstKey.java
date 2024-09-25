package com.example.demo.admin.entity.admin;

import java.math.BigDecimal;

public class CodeValueMstKey {
    private String PHYSCL_CD_NAME;

    private BigDecimal CD_VAL;

    public String getPHYSCL_CD_NAME() {
        return PHYSCL_CD_NAME;
    }

    public void setPHYSCL_CD_NAME(String PHYSCL_CD_NAME) {
        this.PHYSCL_CD_NAME = PHYSCL_CD_NAME == null ? null : PHYSCL_CD_NAME.trim();
    }

    public BigDecimal getCD_VAL() {
        return CD_VAL;
    }

    public void setCD_VAL(BigDecimal CD_VAL) {
        this.CD_VAL = CD_VAL;
    }
}