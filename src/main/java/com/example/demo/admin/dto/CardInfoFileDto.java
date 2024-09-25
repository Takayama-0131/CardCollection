package com.example.demo.admin.dto;

public class CardInfoFileDto {
	/**
	 * カードID
	 */
    private Short cardId;

	/**
	 * カード名
	 */
    private String cardName;

	/**
	 * カード種別
	 */
    private String cardKind;

	/**
	 * カードサブ種別
	 */
    private String cardSubKind;

	/**
	 * カードテキスト
	 */
    private String cardText;

	/**
	 * モンスター特性
	 */
    private String monsterKind;

	/**
	 * レベル/ランク/リンク
	 */
    private Integer levelRankLink;

	/**
	 * 左スケール
	 */
    private Integer leftScale;

	/**
	 * 右スケール
	 */
    private Integer rightScale;

	/**
	 * 属性
	 */
    private String attribute;

	/**
	 * 種族
	 */
    private String tribe;

	/**
	 * 攻撃力
	 */
    private Integer atk;

	/**
	 * 防御力
	 */
    private Integer def;

    /**
	 * 登録済みフラグ
	 */
    private boolean registeredFlg;


    public Short getCardId() {
        return cardId;
    }

    public void setCardId(Short cardId) {
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

    public String getCardSubKind() {
        return cardSubKind;
    }

    public void setCardSubKind(String cardSubKind) {
        this.cardSubKind = cardSubKind;
    }

    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    public String getMonsterKind() {
        return monsterKind;
    }

    public void setMonsterKind(String monsterKind) {
        this.monsterKind = monsterKind;
    }

    public Integer getLevelRankLink() {
        return levelRankLink;
    }

    public void setLevelRankLink(Integer levelRankLink) {
        this.levelRankLink = levelRankLink;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
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

    public boolean getRegisteredFlg() {
        return registeredFlg;
    }

    public void setRegisteredFlg(boolean registeredFlg) {
        this.registeredFlg = registeredFlg;
    }
}