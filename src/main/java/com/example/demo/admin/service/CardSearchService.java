package com.example.demo.admin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.admin.dto.MonsterCardDto;
import com.example.demo.admin.dto.ProsessResultDto;
import com.example.demo.admin.entity.admin.CardMst;
import com.example.demo.admin.entity.admin.CardMstExample;
import com.example.demo.admin.mapper.admin.CardMstMapper;
import com.example.demo.admin.mapper.admin.MonsterCardMapper;

@Service
public class CardSearchService{
	
	//ファイル読み込み完了メッセージ
	private static final String FILE_READ_SUCCESS_MESSAGE = "カード価格ファイル取り込みに成功しました。";
	
	@Autowired
	private CardMstMapper cardMstMapper;
	
	@Autowired
	private MonsterCardMapper monsterCardMapper;
	
	public ProsessResultDto search(String str) {
		//1. 内部変数定義
		//1.1. レスポンス初期化
		//[処理結果DTO.ステータス]=0（正常）
		//[処理結果DTO.メッセージ]=NULL
		ProsessResultDto prosessResultDto = new ProsessResultDto();
		
		//カード名を取得する。
		CardMstExample cardMstExample = new CardMstExample();
		List<CardMst> resultList =  new ArrayList<>();
		//<取得項目>
		//カード名
		//<検索テーブル>
		//カードマスタ
		//<検索条件>
		//カードマスタ.カード名 LIKE %カード名%
		cardMstExample.createCriteria().andCARD_NAMELike("%"+str+"%");
		resultList = cardMstMapper.selectByExample(cardMstExample);
		final String searchCardName = resultList.get(0).getCARD_NAME();

		//結合したテーブルから値を取得チェック
		final int cardId = 1000;
		//<取得項目>
		//カード名
		//レベル
		//<検索テーブル>
		//カードマスタ
		//モンスターカードマスタ
		//<検索条件>
		//カードマスタ.カードID
		MonsterCardDto monsterCardDto = monsterCardMapper.selectMonsterLevelAndCardName(cardId);
		
		
		//存在チェック
		if(Objects.isNull(resultList)) {
			//[処理結果DTO.メッセージ]がブランクの場合、下記を設定する。
			if(Objects.isNull(prosessResultDto.getMessage())) {
				//[処理結果DTO.メッセージ]=[行数]行目：カードID「[カード価格ファイルDTO.カードID]」はカードマスタ上に存在しません。
				prosessResultDto.setMessage(str+"を含むカード名はカードマスタ上に存在しません。");
			//[処理結果DTO.メッセージ]がブランク以外の場合、下記を設定する。
			} else {
				//[処理結果DTO.メッセージ]=[処理結果DTO.メッセージ] + 改行コード + [行数]行目：カードID「[カード価格ファイルDTO.カードID]」はカードマスタ上に存在しません。
				prosessResultDto.setMessage(prosessResultDto.getMessage() + "\n" +str+"を含むカード名はカードマスタ上に存在しません。");
			}
		}
		//5. 終了処理
		//5.1. 下記メッセージを設定する。
		//[処理結果DTO.メッセージ]=カード価格ファイル取り込みに成功しました。
		prosessResultDto.setMessage(searchCardName);
		return prosessResultDto;
	}
}
