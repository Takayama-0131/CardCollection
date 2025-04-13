package com.example.demo.admin.dto;

public class TrapKindSearchInfoDto {
    private String lgclCdName;
    private Integer cdVal;

    // ゲッター・セッター
    public String getLgclCdName() {
        return lgclCdName;
    }
    public void setLgclCdName(String lgclCdName) {
        this.lgclCdName = lgclCdName;
    }

    public Integer getCdVal() {
        return cdVal;
    }
    public void setCdVal(Integer cdVal) {
        this.cdVal = cdVal;
    }
}