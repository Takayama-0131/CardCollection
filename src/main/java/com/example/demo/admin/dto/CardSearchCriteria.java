package com.example.demo.admin.dto;

import lombok.Data;

@Data
public class CardSearchCriteria {
    private String cardId;
    private String cardName;
    private String cardKind;
    private String monsterKind;
    private String magicKind;
    private String trapKind;
}
