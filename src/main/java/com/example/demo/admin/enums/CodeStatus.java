package com.example.demo.admin.enums;

import lombok.Getter;

public class CodeStatus {

	@Getter
	public enum ResultStatus {
		/**
		 * 処理結果ステータス_正常
		 */
		NORMAL("0"),
		
		/**
		 * 処理結果ステータス_警告
		 */
		WARN("1"),

		/**
		 * 処理結果ステータス_異常
		 */
		ERROR("9");
		;

		ResultStatus(String string) {
			// TODO 自動生成されたコンストラクター・スタブ
		}
	}
	
	public enum CardKind {
	/**
	 * カード種別_モンスターカード
	 */
	MONSTER("1)"),
	
	/**
	 * カード種別_魔法カード
	 */
	MAGIC("2"),
	
	/**
	 * カード種別_罠カード
	 */
	TRAP("3");
	;

	CardKind(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}}
	
	@Getter
	public enum MonsterKind {
	/**
	 * モンスター種別_通常
	 */
	NOMAL("1"),
	
	/**
	 * モンスター種別_効果
	 */
	EFFECT("2"),
	
	/**
	 * モンスター種別_儀式
	 */
	RITUALS("3"),
	
	/**
	 * モンスター種別_融合
	 */
	FUSION("4"),
	
	/**
	 * モンスター種別_シンクロ
	 */
	SYNCHRO("5"),
	
	/**
	 * モンスター種別_エクシーズ
	 */
	XYZ("6"),
	
	/**
	 * モンスター種別_ペンデュラム
	 */
	PENDULUM("7"),
	
	/**
	 * モンスター種別_リンク
	 */
	LINK("8"),
	;
	;

	MonsterKind(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}}
	
	@Getter
	public enum MonsterCharac {
	/**
	 * モンスター特性_特殊召喚
	 */
	SPECIAL_SUMMON("1"),
	
	/**
	 * モンスター特性_チューナー
	 */
	TUNER("2"),
	
	/**
	 * モンスター特性_リバース
	 */
	REVERSE("3"),
	
	/**
	 * モンスター特性_スピリット
	 */
	SPILIT("4"),
	
	/**
	 * モンスター特性_ユニオン
	 */
	UNION("5"),
	
	/**
	 * モンスター特性_トゥーン
	 */
	TOON("6"),
	;

	MonsterCharac(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}}
	
	@Getter
	public enum Attribute {
	/**
	 * 属性_闇
	 */
	DARK("1"),
	
	/**
	 * 属性_光
	 */
	LIGHT("2"),
	
	/**
	 * 属性_地
	 */
	EARTH("3"),
	
	/**
	 * 属性_水
	 */
	WATER("4"),
	
	/**
	 * 属性_炎
	 */
	FIRE("5"),
	
	/**
	 * 属性_風
	 */
	WIND("6"),
	
	/**
	 * 属性_神
	 */
	DIVINE("7"),
	;
	;

	Attribute(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}}
	
	@Getter
	public enum RACE {
	/**
	 * 種族_魔法使い族
	 */
	RACE_01("01"),
	
	/**
	 * 種族_ドラゴン族
	 */
	RACE_02("02"),
	
	/**
	 * 種族_アンデット族
	 */
	RACE_03("03"),
	
	/**
	 * 種族_戦士族
	 */
	RACE_04("04"),
	
	/**
	 * 種族_獣戦士族
	 */
	RACE_05("05"),
	
	/**
	 * 種族_獣族
	 */
	RACE_06("06"),
	
	/**
	 * 種族_鳥獣族
	 */
	RACE_07("07"),
	
	/**
	 * 種族_悪魔族
	 */
	RACE_08("08"),
	
	/**
	 * 種族_天使族
	 */
	RACE_09("09"),
	
	/**
	 * 種族_昆虫族
	 */
	RACE_10("10"),
	
	/**
	 * 種族_恐竜族
	 */
	RACE_11("11"),
	
	/**
	 * 種族_爬虫類族
	 */
	RACE_12("12"),
	
	/**
	 * 種族_魚族
	 */
	RACE_13("13"),
	
	/**
	 * 種族_海竜族
	 */
	RACE_14("14"),
	
	/**
	 * 種族_水族
	 */
	RACE_15("15"),
	
	/**
	 * 種族_炎族
	 */
	RACE_16("16"),
	
	/**
	 * 種族_雷族
	 */
	RACE_17("17"),
	
	/**
	 * 種族_岩石族
	 */
	RACE_18("18"),
	
	/**
	 * 種族_植物族
	 */
	RACE_19("19"),
	
	/**
	 * 種族_機械族
	 */
	RACE_20("20"),
	
	/**
	 * 種族_サイキック族
	 */
	RACE_21("21"),
	
	/**
	 * 種族_幻神獣族
	 */
	RACE_22("22"),
	
	/**
	 * 種族_創造神族
	 */
	RACE_23("23"),
	
	/**
	 * 種族_幻竜族
	 */
	RACE_24("24"),
	
	/**
	 * 種族_サイバース族
	 */
	RACE_25("25"),
	
	/**
	 * 種族_幻想魔族
	 */
	RACE_26("26"),
	;

	RACE(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}}
	
	@Getter
	public enum MagicKind {
	/**
	 * 魔法種別_通常魔法
	 */
	NOMAL("1"),
	
	/**
	 * 魔法種別_永続魔法
	 */
	CONTINUOUS("2"),
	
	/**
	 * 魔法種別_速攻魔法
	 */
	QUICK("3"),
	
	/**
	 * 魔法種別_装備魔法
	 */
	EQUIPMENT("4"),
	
	/**
	 * 魔法種別_儀式魔法
	 */
	RITUAL("5"),
	;
	;

	MagicKind(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}}
	
	@Getter
	public enum TrapKind {
	/**
	 * 罠種別_通常罠
	 */
	NOMAL("1"),
	/**
	 * 罠種別_永続罠
	 */
	CONTINUOUS("2"),
	
	/**
	 * 罠種別_カウンター罠
	 */
	COUNTER("3"),
	;

	TrapKind(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}}
	
	@Getter
	public enum Rarity {
	/**
	 * レアリティ_ノーマル
	 */
	NORMAL("01"),
	
	/**
	 * レアリティ_レア
	 */
	RARE("02"),
	
	/**
	 * レアリティ_スーパー
	 */
	SUPER("03"),
	
	/**
	 * レアリティ_ウルトラ
	 */
	ULTRA("04"),
	
	/**
	 * レアリティ_アルティメット
	 */
	ULTIMATE("05"),
	
	/**
	 * レアリティ_レリーフ
	 */
	RELIEF("06"),
	
	/**
	 * レアリティ_ホログラフィック
	 */
	HOLOGRAPHIC("07"),
	
	/**
	 * レアリティ_プリズマティック
	 */
	PRISMATIC("08"),
	
	/**
	 * レアリティ_パラレル
	 */
	PARALLEL("09"),
	
	/**
	 * レアリティ_20th
	 */
	ANNIVERSARY20th("10"),
	
	/**
	 * レアリティ_25th
	 */
	ANNIVERSARY25th("11"),
	;
	;

	Rarity(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}}
}