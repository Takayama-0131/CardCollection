package com.example.demo.admin.dto;

import java.math.BigDecimal;

public class CardPriceFileDto {
	/**
	 * カードID
	 */
    private Short cardId;

	/**
	 * レアリティ
	 */
    private String rarity;

	/**
	 * 販売価格
	 */
    private BigDecimal sellPrice;

	/**
	 * 買取価格
	 */
    private BigDecimal purchasePrice;

    public Short getCardId() {
        return cardId;
    }

    public void setCardId(Short cardId) {
        this.cardId = cardId;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}