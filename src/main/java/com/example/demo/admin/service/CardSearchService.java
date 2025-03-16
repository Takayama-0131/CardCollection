package com.example.demo.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.admin.dto.CardSearchCriteria;
import com.example.demo.admin.dto.CardSearchDto;
import com.example.demo.admin.mapper.admin.CardSearchMapper;

@Service
public class CardSearchService {
    
    @Autowired
    private CardSearchMapper cardSearchMapper;

    public List<CardSearchDto> search(CardSearchCriteria searchInfo) {
        // 1. `CardSearchInfo` を `CardSearchCriteria` に変換
        CardSearchCriteria criteria = new CardSearchCriteria();
        // カードID
        if ("".equals(searchInfo.getCardId())) {
            criteria.setCardId(null);
        } else {
            criteria.setCardId(searchInfo.getCardId());
        }
        
        // カード名（中間一致） - 空文字の場合はnullに設定
        if ("".equals(searchInfo.getCardName())) {
            criteria.setCardName(null);
        } else {
            criteria.setCardName(searchInfo.getCardName());
        }
        
        // カード種別 - 空文字の場合はnullに設定
        if ("".equals(searchInfo.getCardKind())) {
            criteria.setCardKind(null);
        } else {
            criteria.setCardKind(searchInfo.getCardKind());
        }
        
        // モンスター種別 - 空文字の場合はnullに設定
        if ("".equals(searchInfo.getMonsterKind())) {
            criteria.setMonsterKind(null);
        } else {
            criteria.setMonsterKind(searchInfo.getMonsterKind());
        }
        
        // 魔法種別 - 空文字の場合はnullに設定
        if ("".equals(searchInfo.getMagicKind())) {
            criteria.setMagicKind(null);
        } else {
            criteria.setMagicKind(searchInfo.getMagicKind());
        }
        
        // 罠種別 - 空文字の場合はnullに設定
        if ("".equals(searchInfo.getTrapKind())) {
            criteria.setTrapKind(null);
        } else {
            criteria.setTrapKind(searchInfo.getTrapKind());
        }

        // 攻撃力 - 空文字の場合はnullに設定
        if ("".equals(searchInfo.getAtk())) {
            criteria.setAtk(null);
            criteria.setAtkCondition(null);
        } else {
            criteria.setAtk(searchInfo.getAtk());
            criteria.setAtkCondition(searchInfo.getAtkCondition());
        }

        // 守備力 - 空文字の場合はnullに設定
        if ("".equals(searchInfo.getDef())) {
            criteria.setDef(null);
            criteria.setDefCondition(null);
        } else {
            criteria.setDef(searchInfo.getDef());
            criteria.setDefCondition(searchInfo.getDefCondition());
        }

        // 2. カードマスタからカード名を検索
		List<CardSearchDto> cardSearchDto = cardSearchMapper.selectCardSearch(criteria);

        // 3. カード名が見つからなかった場合は空のリストを返す
        //if (cardSearchDto.isEmpty()) {
        //    return new ArrayList<>(); // 検索結果がない場合、空のリストを返す
        //}

        // 4. カード情報を返す
        return cardSearchDto;
    }
}
