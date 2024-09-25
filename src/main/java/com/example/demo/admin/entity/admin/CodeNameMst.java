package com.example.demo.admin.entity.admin;

import java.math.BigDecimal;
import java.util.Date;

public class CodeNameMst {
    private BigDecimal PHYSCL_CD_NAME;

    private Date CREATED_DATE;

    private String CREATED_USER;

    private String CREATED_PROGRAM;

    private Date LAST_EDITED;

    private String LAST_USER;

    private String LAST_PROGRAM;

    private Short VERSION_EX_KEY;

    private String LGCL_CD_NAME;

    public BigDecimal getPHYSCL_CD_NAME() {
        return PHYSCL_CD_NAME;
    }

    public void setPHYSCL_CD_NAME(BigDecimal PHYSCL_CD_NAME) {
        this.PHYSCL_CD_NAME = PHYSCL_CD_NAME;
    }

    public Date getCREATED_DATE() {
        return CREATED_DATE;
    }

    public void setCREATED_DATE(Date CREATED_DATE) {
        this.CREATED_DATE = CREATED_DATE;
    }

    public String getCREATED_USER() {
        return CREATED_USER;
    }

    public void setCREATED_USER(String CREATED_USER) {
        this.CREATED_USER = CREATED_USER == null ? null : CREATED_USER.trim();
    }

    public String getCREATED_PROGRAM() {
        return CREATED_PROGRAM;
    }

    public void setCREATED_PROGRAM(String CREATED_PROGRAM) {
        this.CREATED_PROGRAM = CREATED_PROGRAM == null ? null : CREATED_PROGRAM.trim();
    }

    public Date getLAST_EDITED() {
        return LAST_EDITED;
    }

    public void setLAST_EDITED(Date LAST_EDITED) {
        this.LAST_EDITED = LAST_EDITED;
    }

    public String getLAST_USER() {
        return LAST_USER;
    }

    public void setLAST_USER(String LAST_USER) {
        this.LAST_USER = LAST_USER == null ? null : LAST_USER.trim();
    }

    public String getLAST_PROGRAM() {
        return LAST_PROGRAM;
    }

    public void setLAST_PROGRAM(String LAST_PROGRAM) {
        this.LAST_PROGRAM = LAST_PROGRAM == null ? null : LAST_PROGRAM.trim();
    }

    public Short getVERSION_EX_KEY() {
        return VERSION_EX_KEY;
    }

    public void setVERSION_EX_KEY(Short VERSION_EX_KEY) {
        this.VERSION_EX_KEY = VERSION_EX_KEY;
    }

    public String getLGCL_CD_NAME() {
        return LGCL_CD_NAME;
    }

    public void setLGCL_CD_NAME(String LGCL_CD_NAME) {
        this.LGCL_CD_NAME = LGCL_CD_NAME == null ? null : LGCL_CD_NAME.trim();
    }
}