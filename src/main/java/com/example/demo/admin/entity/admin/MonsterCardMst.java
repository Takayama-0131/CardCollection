package com.example.demo.admin.entity.admin;

import java.util.Date;

public class MonsterCardMst {
    private Short CARD_ID;

    private Date CREATED_DATE;

    private String CREATED_USER;

    private String CREATED_PROGRAM;

    private Date LAST_EDITED;

    private String LAST_USER;

    private String LAST_PROGRAM;

    private Short VERSION_EX_KEY;

    private String MONSTER_KIND;

    private String MONSTER_CHARAC;

    private Integer MONSTER_LEVEL;

    private Integer RANK;

    private Integer LINK;

    private Integer LEFT_SCALE;

    private Integer RIGHT_SCALE;

    private String ATTRIBUTE;

    private String TRIBE;

    private Integer ATK;

    private Integer DEF;

    private String EFFECT;

    private String FLAVOR_TEXT;

    public Short getCARD_ID() {
        return CARD_ID;
    }

    public void setCARD_ID(Short CARD_ID) {
        this.CARD_ID = CARD_ID;
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

    public String getMONSTER_KIND() {
        return MONSTER_KIND;
    }

    public void setMONSTER_KIND(String MONSTER_KIND) {
        this.MONSTER_KIND = MONSTER_KIND == null ? null : MONSTER_KIND.trim();
    }

    public String getMONSTER_CHARAC() {
        return MONSTER_CHARAC;
    }

    public void setMONSTER_CHARAC(String MONSTER_CHARAC) {
        this.MONSTER_CHARAC = MONSTER_CHARAC == null ? null : MONSTER_CHARAC.trim();
    }

    public Integer getMONSTER_LEVEL() {
        return MONSTER_LEVEL;
    }

    public void setMONSTER_LEVEL(Integer MONSTER_LEVEL) {
        this.MONSTER_LEVEL = MONSTER_LEVEL;
    }

    public Integer getRANK() {
        return RANK;
    }

    public void setRANK(Integer RANK) {
        this.RANK = RANK;
    }

    public Integer getLINK() {
        return LINK;
    }

    public void setLINK(Integer LINK) {
        this.LINK = LINK;
    }

    public Integer getLEFT_SCALE() {
        return LEFT_SCALE;
    }

    public void setLEFT_SCALE(Integer LEFT_SCALE) {
        this.LEFT_SCALE = LEFT_SCALE;
    }

    public Integer getRIGHT_SCALE() {
        return RIGHT_SCALE;
    }

    public void setRIGHT_SCALE(Integer RIGHT_SCALE) {
        this.RIGHT_SCALE = RIGHT_SCALE;
    }

    public String getATTRIBUTE() {
        return ATTRIBUTE;
    }

    public void setATTRIBUTE(String ATTRIBUTE) {
        this.ATTRIBUTE = ATTRIBUTE == null ? null : ATTRIBUTE.trim();
    }

    public String getTRIBE() {
        return TRIBE;
    }

    public void setTRIBE(String TRIBE) {
        this.TRIBE = TRIBE == null ? null : TRIBE.trim();
    }

    public Integer getATK() {
        return ATK;
    }

    public void setATK(Integer ATK) {
        this.ATK = ATK;
    }

    public Integer getDEF() {
        return DEF;
    }

    public void setDEF(Integer DEF) {
        this.DEF = DEF;
    }

    public String getEFFECT() {
        return EFFECT;
    }

    public void setEFFECT(String EFFECT) {
        this.EFFECT = EFFECT == null ? null : EFFECT.trim();
    }

    public String getFLAVOR_TEXT() {
        return FLAVOR_TEXT;
    }

    public void setFLAVOR_TEXT(String FLAVOR_TEXT) {
        this.FLAVOR_TEXT = FLAVOR_TEXT == null ? null : FLAVOR_TEXT.trim();
    }
}