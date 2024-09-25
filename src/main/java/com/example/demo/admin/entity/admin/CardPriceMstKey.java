package com.example.demo.admin.entity.admin;

public class CardPriceMstKey {
    private Short CARD_ID;

    private String RARITY;

    public Short getCARD_ID() {
        return CARD_ID;
    }

    public void setCARD_ID(Short CARD_ID) {
        this.CARD_ID = CARD_ID;
    }

    public String getRARITY() {
        return RARITY;
    }

    public void setRARITY(String RARITY) {
        this.RARITY = RARITY == null ? null : RARITY.trim();
    }
}