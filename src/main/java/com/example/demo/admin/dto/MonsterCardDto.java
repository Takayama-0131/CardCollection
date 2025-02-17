package com.example.demo.admin.dto;

public class MonsterCardDto {
    private Integer monsterLevel;
    private String cardName;

    // ゲッター・セッター
    public Integer getMonsterLevel() {
        return monsterLevel;
    }
    public void setMonsterLevel(Integer monsterLevel) {
        this.monsterLevel = monsterLevel;
    }

    public String getCardName() {
        return cardName;
    }
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}