package com.example.demo.admin.entity.admin;

import java.util.Date;

public class CardPriceMst extends CardPriceMstKey {
    private Date CREATED_DATE;

    private String CREATED_USER;

    private String CREATED_PROGRAM;

    private Date LAST_EDITED;

    private String LAST_USER;

    private String LAST_PROGRAM;

    private Short VERSION_EX_KEY;

    private Short SELL_PRICE;

    private Short PURCHASE_PRICE;

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

    public Short getSELL_PRICE() {
        return SELL_PRICE;
    }

    public void setSELL_PRICE(Short SELL_PRICE) {
        this.SELL_PRICE = SELL_PRICE;
    }

    public Short getPURCHASE_PRICE() {
        return PURCHASE_PRICE;
    }

    public void setPURCHASE_PRICE(Short PURCHASE_PRICE) {
        this.PURCHASE_PRICE = PURCHASE_PRICE;
    }
}