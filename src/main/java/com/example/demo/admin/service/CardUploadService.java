package com.example.demo.admin.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.admin.dto.CardInfoFileDto;
import com.example.demo.admin.dto.ProsessResultDto;
import com.example.demo.admin.entity.admin.CardMst;
import com.example.demo.admin.entity.admin.MagicCardMst;
import com.example.demo.admin.entity.admin.MonsterCardMst;
import com.example.demo.admin.entity.admin.MonsterCardMstExample;
import com.example.demo.admin.entity.admin.TrapCardMst;
import com.example.demo.admin.mapper.admin.CardMstMapper;
import com.example.demo.admin.mapper.admin.MagicCardMstMapper;
import com.example.demo.admin.mapper.admin.MonsterCardMstMapper;
import com.example.demo.admin.mapper.admin.TrapCardMstMapper;

import jakarta.inject.Inject;

@Service
public class CardUploadService{
	
	//ファイル読み込み完了メッセージ
	private static final String FILE_READ_SUCCESS_MESSAGE = "カード情報ファイル取り込みに成功しました。";

	@Inject
	private static CardMstMapper cardMstMapper;
	
	@Inject
	private static MonsterCardMstMapper monsterCardMstMapper;
	
	@Inject
	private static MagicCardMstMapper magicCardMstMapper;
	
	@Inject
	private static TrapCardMstMapper trapCardMstMapper;
	
	public static ProsessResultDto readFile(MultipartFile file) {
	//1. 内部変数定義
	//[処理結果DTO.メッセージ]=NULL
	ProsessResultDto prosessResultDto = new ProsessResultDto();
	
	//1.2. 内部変数定義
	//下記内部変数を定義する。
	//[カード情報ファイルDTOリスト]=NULL
	List<CardInfoFileDto> cardInfoFileDtoList = new ArrayList<CardInfoFileDto>();

	//[行数]=1
	int lines = 1;
	
	//2. ファイル読み込み
	try {
		//2.1. [ファイルDTO.アップロードファイル]を読み込み、その結果を[カード情報ファイルDTOリスト]へ格納する。
		//※「カード情報登録_項目移動表1」シートを参照
    	//ファイル読み込みに必要なクラス定義

		InputStreamReader isr = null;	//文字列ストリーム
		BufferedReader br = null;		//文字列読み込み

   		//ファイルの読み込み準備
   		InputStream fis = file.getInputStream(); 		//MultipartFileの中身を取得
   		isr = new InputStreamReader(fis);
   		br = new BufferedReader(isr);

   		//最初の1行を読み込む
   		String line = br.readLine();

   		//行のデータがなくなるまで繰り返し
   		while(line != null) {
   			//カンマで項目を分割
   			String[] strArray = line.split(",");

   		    // CardInfoFileDtoのインスタンスを作成
   		    CardInfoFileDto cardInfo = new CardInfoFileDto();
   		    
   			//分割した項目の配列から項目を取得
   		    // cardIdの変換処理 (String -> short)
   		    if (strArray.length >= 1) {
   		        try {
   		            short cardId = Short.parseShort(strArray[0]);  // String型からshort型へ変換
   		            cardInfo.setCardId(cardId);  // DTOにセット
   		        } catch (NumberFormatException e) {
   		            // 変換できなかった場合の処理（例外が発生したら初期値を設定）
   		            System.err.println("cardIdの変換に失敗しました: " + strArray[0]);
   		            cardInfo.setCardId((short) 0);  // 例外が発生した場合、初期値として0をセット
   		        }
   		    } else {
   		        cardInfo.setCardId((short) 0);  // 値がない場合、初期値をセット
   		    }
   		    
   		    // cardName
   		    cardInfo.setCardName(strArray.length >= 2 ? strArray[1] : "");
   		    // cardKind
   		    cardInfo.setCardKind(strArray.length >= 3 ? strArray[2] : "");
   		    // cardSubKind
   		    cardInfo.setCardSubKind(strArray.length >= 4 ? strArray[3] : "");
   		    // cardText
   		    cardInfo.setCardText(strArray.length >= 5 ? strArray[4] : "");
   		    // monsterKind
   		    cardInfo.setMonsterKind(strArray.length >= 6 ? strArray[5] : "");
   		    // levelRankLinkの変換処理 (String -> Integer)
   		    if (strArray.length >= 7) {
   		        try {
   		            int levelRankLink = Integer.parseInt(strArray[6]);  // String型からInteger型へ変換
   		            cardInfo.setLevelRankLink(levelRankLink);  // DTOにセット
   		        } catch (NumberFormatException e) {
   		            // 変換できなかった場合の処理（例外が発生したら初期値を設定）
   		            System.err.println("levelRankLinkの変換に失敗しました: " + strArray[6]);
   		            cardInfo.setLevelRankLink(0);  // 例外が発生した場合、初期値として0をセット
   		        }
   		    } else {
   		        cardInfo.setLevelRankLink(0);  // 値がない場合、初期値をセット
   		    }
   		    // leftScaleの変換処理 (String -> Integer)
   		    if (strArray.length >= 8) {
   		        try {
   		            int leftScale = Integer.parseInt(strArray[7]);  // String型からInteger型へ変換
   		            cardInfo.setLeftScale(leftScale);  // DTOにセット
   		        } catch (NumberFormatException e) {
   		            // 変換できなかった場合の処理（例外が発生したら初期値を設定）
   		            System.err.println("leftScaleの変換に失敗しました: " + strArray[7]);
   		            cardInfo.setLeftScale(0);  // 例外が発生した場合、初期値として0をセット
   		        }
   		    } else {
   		        cardInfo.setLeftScale(0);  // 値がない場合、初期値をセット
   		    }
   		    // rightScaleの変換処理 (String -> Integer)
   		    if (strArray.length >= 9) {
   		        try {
   		            int rightScale = Integer.parseInt(strArray[8]);  // String型からInteger型へ変換
   		            cardInfo.setRightScale(rightScale);  // DTOにセット
   		        } catch (NumberFormatException e) {
   		            // 変換できなかった場合の処理（例外が発生したら初期値を設定）
   		            System.err.println("leftScaleの変換に失敗しました: " + strArray[8]);
   		            cardInfo.setRightScale(0);  // 例外が発生した場合、初期値として0をセット
   		        }
   		    } else {
   		        cardInfo.setRightScale(0);  // 値がない場合、初期値をセット
   		    }
   		    // attribute
   		    cardInfo.setAttribute(strArray.length >= 10 ? strArray[9] : "");
   		    // tribe
   		    cardInfo.setTribe(strArray.length >= 11 ? strArray[10] : "");
   		    // atkの変換処理 (String -> Integer)
   		    if (strArray.length >= 12) {
   		        try {
   		            int atk = Integer.parseInt(strArray[11]);  // String型からInteger型へ変換
   		            cardInfo.setAtk(atk);  // DTOにセット
   		        } catch (NumberFormatException e) {
   		            // 変換できなかった場合の処理（例外が発生したら初期値を設定）
   		            System.err.println("leftScaleの変換に失敗しました: " + strArray[11]);
   		            cardInfo.setAtk(0);  // 例外が発生した場合、初期値として0をセット
   		        }
   		    } else {
   		        cardInfo.setAtk(0);  // 値がない場合、初期値をセット
   		    }
   		    // defの変換処理 (String -> Integer)
   		    if (strArray.length >= 13) {
   		        try {
   		            int def = Integer.parseInt(strArray[12]);  // String型からInteger型へ変換
   		            cardInfo.setDef(def);  // DTOにセット
   		        } catch (NumberFormatException e) {
   		            // 変換できなかった場合の処理（例外が発生したら初期値を設定）
   		            System.err.println("leftScaleの変換に失敗しました: " + strArray[12]);
   		            cardInfo.setDef(0);  // 例外が発生した場合、初期値として0をセット
   		        }
   		    } else {
   		        cardInfo.setDef(0);  // 値がない場合、初期値をセット
   		    }
   			
   		    // DTOをリストに追加
   			cardInfoFileDtoList.add(cardInfo);
   			
   			//次の行を読み込む
   			line = br.readLine();
   		}
	} catch (Exception e) {
		//2.2. 項番2.1のファイル読み込み時にエラーが発生した場合、下記を設定して処理を終了する。
		//[処理結果DTO.ステータス]=9（異常）
		prosessResultDto.setStatus("");
		//[処理結果DTO.メッセージ]=カード情報ファイルの読み込みに失敗しました。
		prosessResultDto.setMessage("カード情報ファイルの読み込みに失敗しました。");
		
		return prosessResultDto;
	}
	//3. ファイル内容チェック
	//（loop開始）[カード情報ファイルDTOリスト]の件数分だけ実行する
	for(CardInfoFileDto cardInfoFileDto : cardInfoFileDtoList) {
		//3.1. [カード情報ファイルDTO.カードID]がブランクの場合
		if(Objects.isNull(cardInfoFileDto.getCardId())) {
			//[処理結果DTO.メッセージ]がブランクの場合、下記を設定する。
			//[処理結果DTO.メッセージ]=[行数]行目：カードIDを設定してください。
			prosessResultDto.setMessage(lines + "行目：カードIDを設定してください。");
		} else {
			//[処理結果DTO.メッセージ]がブランク以外の場合、下記を設定する。
			//[処理結果DTO.メッセージ]=[処理結果DTO.メッセージ] + 改行コード + [行数]行目：カードIDを設定してください。
			prosessResultDto.setMessage(prosessResultDto.getMessage() + "\n" +"行目：カードIDを設定してください。");
		}
		
		//3.2. [カード情報ファイルDTO.カード名]がブランクの場合
		if(Objects.isNull(cardInfoFileDto.getCardName())) {
			//[処理結果DTO.メッセージ]がブランクの場合、下記を設定する。
			//[処理結果DTO.メッセージ]=[行数]行目：カード名を設定してください。
			prosessResultDto.setMessage(lines + "行目：カード名を設定してください。");
		} else {
			//[処理結果DTO.メッセージ]がブランク以外の場合、下記を設定する。
			//[処理結果DTO.メッセージ]=[処理結果DTO.メッセージ] + 改行コード + [行数]行目：カード名を設定してください。
			prosessResultDto.setMessage(prosessResultDto.getMessage() + "\n" +"行目：カード名を設定してください。");
		}
		
		//3.3. [カード情報ファイルDTO.カード種別]にブランクまたは1,2,3以外の値が設定されている場合
		if(Objects.isNull(cardInfoFileDto.getCardKind())) {
			//[処理結果DTO.メッセージ]がブランクの場合、下記を設定する。
			//[処理結果DTO.メッセージ]=[行数]行目：カード種別には1～3のいずれかを設定してください。
			prosessResultDto.setMessage(lines + "行目：カード種別には1～3のいずれかを設定してください。");
		} else {
			//[処理結果DTO.メッセージ]がブランク以外の場合、下記を設定する。
			//[処理結果DTO.メッセージ]=[処理結果DTO.メッセージ] + 改行コード + [行数]行目：カード種別には1～3のいずれかを設定してください。
			prosessResultDto.setMessage(prosessResultDto.getMessage() + "\n" +"行目：カード種別には1～3のいずれかを設定してください。");
		}
		//3.4. [行数]をインクリメントする。
		lines++;
		//（loop終了）
	}
	//3.X. [処理結果DTO.メッセージ]がブランクでない場合、下記を設定して処理を終了する。
	if(!Objects.isNull(prosessResultDto.getMessage())) {
		//[処理結果DTO.ステータス]=1（警告）
		prosessResultDto.setStatus("");
	}
	
	//4. カードマスタ登録更新
	//（loop開始）[カード情報ファイルDTOリスト]の件数分だけ実行する
	for(CardInfoFileDto cardInfoFileDto : cardInfoFileDtoList) {
		//4.1. カードマスタの件数を取得する。
		CardMst cardMst = new CardMst();
		long resultCount = 0;
		//<取得項目>
		//count(1)
		//<検索テーブル>
		//カードマスタ
		//<検索条件>
		//カードマスタ.カードID=カード情報ファイルDTO.カードID
		cardMst.setCARD_ID(cardInfoFileDto.getCardId());
		resultCount = cardMstMapper.countByExample(cardMst);
		short versionCount = 0;
		
		//4.2. カードマスタ登録更新
		//4.1での取得結果が1件の場合、下記データ更新を行う。
		if(resultCount == 1) {
			//<更新値>
			//カードマスタ.カード名=カード情報ファイルDTO.カード名
			//カードマスタ.カード種別=カード情報ファイルDTO.カード種別
			//カードマスタ.排他制御カラム+= 1
			cardMst.setCARD_NAME(cardInfoFileDto.getCardName());
			cardMst.setCARD_KIND(cardInfoFileDto.getCardKind());
			cardMst.setVERSION_EX_KEY(versionCount++); //後で確認
			//<更新先テーブル>
			//カードマスタ
			//<更新条件>
			//カードマスタ.カードID=カード情報ファイルDTO.カードID
			cardMstMapper.updateByPrimaryKeySelective(cardMst);
		} else {
			//上記以外の場合、下記データ登録を行う。
			//<登録値>
			//「カード情報登録_項目移動表2」シートを参照
			cardMst.setCARD_ID(cardInfoFileDto.getCardId());
			cardMst.setCARD_NAME(cardInfoFileDto.getCardName());
			cardMst.setCARD_KIND(cardInfoFileDto.getCardKind());
			//<登録先テーブル>
			//カードマスタ
			cardMstMapper.insert(cardMst);
			//（loop終了）
		}
	}
	
	//5. カード種別分類
	//5.1. [カード情報ファイルDTOリスト]内のカード種別が「1:モンスターカード」のデータのみを抽出し、
	//[モンスターカードリスト]へ格納する。
	List<CardInfoFileDto> cardMonsList = cardInfoFileDtoList.stream()
			.filter(n -> n.getCardKind() == "1").collect(Collectors.toList());

	//5.2. [カード情報ファイルDTOリスト]内のカード種別が「2:魔法カード」のデータのみを抽出し、
	//[魔法カードリスト]へ格納する。
	List<CardInfoFileDto> cardMagicList = cardInfoFileDtoList.stream()
			.filter(n -> n.getCardKind() == "2").collect(Collectors.toList());
	
	//5.3. [カード情報ファイルDTOリスト]内のカード種別が「3:罠カード」のデータのみを抽出し、
	//[罠カードリスト]へ格納する。
	List<CardInfoFileDto> cardTrapList = cardInfoFileDtoList.stream()
			.filter(n -> n.getCardKind() == "3").collect(Collectors.toList());


	//6. モンスターカードマスタ登録更新
	//（loop開始）[モンスターカードリスト]の件数分だけ実行する
	for(CardInfoFileDto cardMons : cardMonsList) {
		//6.1. モンスターカードマスタの件数を取得する。
		//MonsterCardMstMapper monsterCardMstMapper = new MonsterCardMstMapper();
		MonsterCardMst monsterCardMst = new MonsterCardMst();
		long resultCount = 0;
		//<取得項目>
		//count(1)
		//<検索テーブル>
		//モンスターカードマスタ
		//<検索条件>
		//モンスターカードマスタ.カードID=カード情報ファイルDTO.カードID
		MonsterCardMstExample monsterCardMstExample = new MonsterCardMstExample();
		monsterCardMstExample.createCriteria().andCARD_IDEqualTo(cardMons.getCardId());
		//monsterCardMst.setCARD_ID(cardMons.getCardId());
		resultCount = monsterCardMstMapper.countByExample(monsterCardMstExample);
		
		//6.2. モンスターカードマスタ更新
		//6.1での取得件数が1件の場合、下記データ更新を行う。
		if(resultCount == 1) {
			//<更新値>
			//「カード情報登録_項目移動表3」シートを参照
			//※値が設定されている項目のみ更新する。
			monsterCardMst.setMONSTER_KIND(cardMons.getCardSubKind());
			monsterCardMst.setMONSTER_CHARAC(cardMons.getMonsterKind());
			//カード情報ファイルDTO.カードサブ種別が「1(通常)」,「2(効果)」,「3(儀式)」,「4(融合)」,「5(シンクロ)」,「7(ペンデュラム)」のいずれかの場合のみ値を設定する
			monsterCardMst.setMONSTER_LEVEL(cardMons.getLevelRankLink());
			//カード情報ファイルDTO.カードサブ種別が「6(エクシーズ)」の場合のみ値を設定する
			monsterCardMst.setRANK(cardMons.getLevelRankLink());
			//カード情報ファイルDTO.カードサブ種別が「8(リンク)」の場合のみ値を設定する
			monsterCardMst.setLINK(cardMons.getLevelRankLink());
			monsterCardMst.setLEFT_SCALE(cardMons.getLeftScale());
			monsterCardMst.setRIGHT_SCALE(cardMons.getRightScale());
			monsterCardMst.setATTRIBUTE(cardMons.getAttribute());
			monsterCardMst.setTRIBE(cardMons.getTribe());
			monsterCardMst.setATK(cardMons.getAtk());
			monsterCardMst.setDEF(cardMons.getDef());
			//カード情報ファイルDTO.カードサブ種別が「1(通常)」以外の場合のみ値を設定する
			monsterCardMst.setEFFECT(cardMons.getCardText());
			//カード情報ファイルDTO.カードサブ種別が「1(通常)」の場合のみ値を設定する
			monsterCardMst.setFLAVOR_TEXT(cardMons.getCardText());
			//<更新先テーブル>
			//モンスターカードマスタ
			//<更新条件>
			//モンスターカードマスタ.カードID=カード情報ファイルDTO.カードID
			monsterCardMst.setCARD_ID(cardMons.getCardId());
			monsterCardMstMapper.updateByPrimaryKeySelective(monsterCardMst);
		} else {
			//上記以外の場合、下記データ登録を行う。
			//<登録値>
			//「カード情報登録_項目移動表3」シートを参照
			monsterCardMst.setCARD_ID(cardMons.getCardId());
			monsterCardMst.setMONSTER_KIND(cardMons.getCardSubKind());
			monsterCardMst.setMONSTER_CHARAC(cardMons.getMonsterKind());
			//カード情報ファイルDTO.カードサブ種別が「1(通常)」,「2(効果)」,「3(儀式)」,「4(融合)」,「5(シンクロ)」,「7(ペンデュラム)」のいずれかの場合のみ値を設定する
			monsterCardMst.setMONSTER_LEVEL(cardMons.getLevelRankLink());
			//カード情報ファイルDTO.カードサブ種別が「6(エクシーズ)」の場合のみ値を設定する
			monsterCardMst.setRANK(cardMons.getLevelRankLink());
			//カード情報ファイルDTO.カードサブ種別が「8(リンク)」の場合のみ値を設定する
			monsterCardMst.setLINK(cardMons.getLevelRankLink());
			monsterCardMst.setLEFT_SCALE(cardMons.getLeftScale());
			monsterCardMst.setRIGHT_SCALE(cardMons.getRightScale());
			monsterCardMst.setATTRIBUTE(cardMons.getAttribute());
			monsterCardMst.setTRIBE(cardMons.getTribe());
			monsterCardMst.setATK(cardMons.getAtk());
			monsterCardMst.setDEF(cardMons.getDef());
			//カード情報ファイルDTO.カードサブ種別が「1(通常)」以外の場合のみ値を設定する
			monsterCardMst.setEFFECT(cardMons.getCardText());
			//カード情報ファイルDTO.カードサブ種別が「1(通常)」の場合のみ値を設定する
			monsterCardMst.setFLAVOR_TEXT(cardMons.getCardText());
			//<登録先テーブル>
			//モンスターカードマスタ
			monsterCardMstMapper.insert(monsterCardMst);
			//（loop終了）
		}
	}
	//7. 魔法カードマスタ登録更新
	//（loop開始）[魔法カードリスト]の件数分だけ実行する
	for(CardInfoFileDto cardMagic : cardMagicList) {
		//7.1. 魔法カードマスタの件数を取得する。
		MagicCardMst magicCardMst = new MagicCardMst();
		long resultCount = 0;
		//<取得項目>
		//count(1)
		//<検索テーブル>
		//魔法カードマスタ
		//<検索条件>
		//魔法カードマスタ.カードID=カード情報ファイルDTO.カードID
		magicCardMst.setCARD_ID(cardMagic.getCardId());
		resultCount = magicCardMstMapper.countByExample(magicCardMst);

		//7.2. 魔法カードマスタ更新
		//7.1での取得件数が1件の場合、下記データ更新を行う。
		if(resultCount == 1) {
			//<更新値>
			//「カード情報登録_項目移動表5」シートを参照
			//※値が設定されている項目のみ更新する。
			magicCardMst.setMAGIC_KIND(cardMagic.getCardSubKind());
			magicCardMst.setEFFECT(cardMagic.getCardText());
			//<更新先テーブル>
			//魔法カードマスタ
			//<更新条件>
			//魔法カードマスタ.カードID=カード情報ファイルDTO.カードID
			magicCardMst.setCARD_ID(cardMagic.getCardId());
			magicCardMstMapper.updateByPrimaryKeySelective(magicCardMst);
		} else {
			//上記以外の場合、下記データ登録を行う。
			//<登録値>
			//「カード情報登録_項目移動表6」シートを参照
			magicCardMst.setCARD_ID(cardMagic.getCardId());
			magicCardMst.setMAGIC_KIND(cardMagic.getCardSubKind());
			magicCardMst.setEFFECT(cardMagic.getCardText());
			//<登録先テーブル>
			//魔法カードマスタ
			magicCardMstMapper.insert(magicCardMst);
			//（loop終了）
		}
	}
	//8. 罠カードマスタ登録更新
	//（loop開始）[罠カードリスト]の件数分だけ実行する
	for(CardInfoFileDto cardTrap : cardTrapList) {
		//8.1. 罠カードマスタの件数を取得する。
		TrapCardMst trapCardMst = new TrapCardMst();
		long resultCount = 0;
		//<取得項目>
		//count(1)
		//<検索テーブル>
		//罠カードマスタ
		//<検索条件>
		//罠カードマスタ.カードID=カード情報ファイルDTO.カードID
		trapCardMst.setCARD_ID(cardTrap.getCardId());
		resultCount = trapCardMstMapper.countByExample(trapCardMst);
		
		//8.2. 罠カードマスタ更新
		//8.1での取得件数が1件の場合、下記データ更新を行う。
		if(resultCount == 1) {
			//<更新値>
			//「カード情報登録_項目移動表7」シートを参照
			//※値が設定されている項目のみ更新する。
			trapCardMst.setTRAP_KIND(cardTrap.getCardSubKind());
			trapCardMst.setEFFECT(cardTrap.getCardText());
			//<更新先テーブル>
			//罠カードマスタ
			//<更新条件>
			//罠カードマスタ.カードID=カード情報ファイルDTO.カードID
			trapCardMst.setCARD_ID(cardTrap.getCardId());
			trapCardMstMapper.updateByPrimaryKeySelective(trapCardMst);
		} else {
			//上記以外の場合、下記データ登録を行う。
			//<登録値>
			//「カード情報登録_項目移動表8」シートを参照
			trapCardMst.setCARD_ID(cardTrap.getCardId());
			trapCardMst.setTRAP_KIND(cardTrap.getCardSubKind());
			trapCardMst.setEFFECT(cardTrap.getCardText());
			//<登録先テーブル>
			//罠カードマスタ
			trapCardMstMapper.insert(trapCardMst);
			//（loop終了）
		}
	}
	//9. 終了処理
	//9.1. 下記メッセージを設定する。
	//[処理結果DTO.メッセージ]=カード情報ファイル取り込みに成功しました。
	prosessResultDto.setMessage(FILE_READ_SUCCESS_MESSAGE);
	
	return prosessResultDto;
	
	}
}