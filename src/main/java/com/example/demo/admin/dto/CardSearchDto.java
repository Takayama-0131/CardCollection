package com.example.demo.admin.dto;

public class CardSearchDto {
    // 共通情報 (CARD_MST)
    private Integer cardId;
    private String cardName;
    private String cardKind;

    // モンスターカード情報 (MONSTER_CARD_MST)
    private String monsterKind;
    private String monsterCharac;
    private Integer monsterLevel;
    private Integer rank;
    private Integer link;
    private Integer leftScale;
    private Integer rightScale;
    private String attribute;
    private String tribe;
    private Integer atk;
    private Integer def;
    private String monsterEffect;
    private String flavorText;

    // 魔法カード情報 (MAGIC_CARD_MST)
    private String magicKind;
    private String magicEffect;

    // 罠カード情報 (TRAP_CARD_MST)
    private String trapKind;
    private String trapEffect;

    // --- ゲッター・セッター ---
    
    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardKind() {
        return cardKind;
    }

    public void setCardKind(String cardKind) {
        this.cardKind = cardKind;
    }

    public String getMonsterKind() {
        return monsterKind;
    }

    public void setMonsterKind(String monsterKind) {
        this.monsterKind = monsterKind;
    }

    public String getMonsterCharac() {
        return monsterCharac;
    }

    public void setMonsterCharac(String monsterCharac) {
        this.monsterCharac = monsterCharac;
    }

    public Integer getMonsterLevel() {
        return monsterLevel;
    }

    public void setMonsterLevel(Integer monsterLevel) {
        this.monsterLevel = monsterLevel;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getLink() {
        return link;
    }

    public void setLink(Integer link) {
        this.link = link;
    }

    public Integer getLeftScale() {
        return leftScale;
    }

    public void setLeftScale(Integer leftScale) {
        this.leftScale = leftScale;
    }

    public Integer getRightScale() {
        return rightScale;
    }

    public void setRightScale(Integer rightScale) {
        this.rightScale = rightScale;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public String getMonsterEffect() {
        return monsterEffect;
    }

    public void setMonsterEffect(String monsterEffect) {
        this.monsterEffect = monsterEffect;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public String getMagicKind() {
        return magicKind;
    }

    public void setMagicKind(String magicKind) {
        this.magicKind = magicKind;
    }

    public String getMagicEffect() {
        return magicEffect;
    }

    public void setMagicEffect(String magicEffect) {
        this.magicEffect = magicEffect;
    }

    public String getTrapKind() {
        return trapKind;
    }

    public void setTrapKind(String trapKind) {
        this.trapKind = trapKind;
    }

    public String getTrapEffect() {
        return trapEffect;
    }

    public void setTrapEffect(String trapEffect) {
        this.trapEffect = trapEffect;
    }
}
