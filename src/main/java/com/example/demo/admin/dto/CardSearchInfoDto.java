package com.example.demo.admin.dto;

import java.util.List;

public class CardSearchInfoDto {

	 private List<CardKindSearchInfoDto> cardKinds;
	 private List<MonsterKindSearchInfoDto> monsterKinds;
	 private List<MagicKindSearchInfoDto> magicKinds;
	 private List<TrapKindSearchInfoDto> trapKinds;

	 // --- Getters & Setters ---
	 public List<CardKindSearchInfoDto> getCardKinds() {
	     return cardKinds;
	 }

	 public void setCardKinds(List<CardKindSearchInfoDto> cardKinds) {
	     this.cardKinds = cardKinds;
	 }

	 public List<MonsterKindSearchInfoDto> getMonsterKinds() {
	     return monsterKinds;
	 }

	 public void setMonsterKinds(List<MonsterKindSearchInfoDto> monsterKinds) {
	     this.monsterKinds = monsterKinds;
	 }

	 public List<MagicKindSearchInfoDto> getMagicKinds() {
	     return magicKinds;
	 }

	 public void setMagicKinds(List<MagicKindSearchInfoDto> magicKinds) {
	     this.magicKinds = magicKinds;
	 }

	 public List<TrapKindSearchInfoDto> getTrapKinds() {
	     return trapKinds;
	 }

	 public void setTrapKinds(List<TrapKindSearchInfoDto> trapKinds) {
	     this.trapKinds = trapKinds;
	 }
}