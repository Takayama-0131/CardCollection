package com.example.demo.admin.dto;

public class CardSearchInfoDto {
    private String lgclCdName;
    private Integer cdVal;

    // ゲッター・セッター
    public String getLGCL_CD_NAME() {
        return lgclCdName;
    }
    public void setLGCL_CD_NAME(String LGCL_CD_NAME) {
        this.lgclCdName = LGCL_CD_NAME;
    }

    public Integer getCD_VAL() {
        return cdVal;
    }
    public void setCD_VAL(Integer CD_VAL) {
        this.cdVal = CD_VAL;
    }
}