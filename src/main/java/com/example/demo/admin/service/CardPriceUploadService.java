package com.example.demo.admin.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.admin.dto.CardPriceFileDto;
import com.example.demo.admin.dto.ProsessResultDto;
import com.example.demo.admin.entity.admin.CardMst;
import com.example.demo.admin.entity.admin.CardMstExample;
import com.example.demo.admin.entity.admin.CardPriceMst;
import com.example.demo.admin.entity.admin.CardPriceMstExample;
import com.example.demo.admin.entity.admin.CodeValueMstExample;
import com.example.demo.admin.mapper.admin.CardMstMapper;
import com.example.demo.admin.mapper.admin.CardPriceMstMapper;
import com.example.demo.admin.mapper.admin.CodeValueMstMapper;

@Service
public class CardPriceUploadService{
	
	//ファイル読み込み完了メッセージ
	private static final String FILE_READ_SUCCESS_MESSAGE = "カード価格ファイル取り込みに成功しました。";
	
	@Autowired
	private CardMstMapper cardMstMapper;

	@Autowired
	private CodeValueMstMapper codeValueMstMapper;
	
	@Autowired
	private CardPriceMstMapper cardPriceMstMapper;
	
	public ProsessResultDto readFile(MultipartFile file) {
		//1. 内部変数定義
		//1.1. レスポンス初期化
		//[処理結果DTO.ステータス]=0（正常）
		//[処理結果DTO.メッセージ]=NULL
		ProsessResultDto prosessResultDto = new ProsessResultDto();

		//1.2. 内部変数定義
		//下記内部変数を定義する。
		//[カード価格ファイルDTOリスト]=NULL
		List<CardPriceFileDto> cardPriceFileDtoList = new ArrayList<CardPriceFileDto>();

		//[行数]=1
		int lines = 1;
		
	    // 現在の日時を取得
	    LocalDateTime currentDate = LocalDateTime.now();

	    // LocalDateTimeをZonedDateTimeに変換
	    ZonedDateTime zonedDateTime = currentDate.atZone(ZoneId.systemDefault());

	    // ZonedDateTimeをDateに変換
	    Date date = Date.from(zonedDateTime.toInstant());
	    
	    // short型0
	    short ZERO = 0;
	    
		//2. ファイル読み込み
		try {
			//2.1. [ファイルDTO.アップロードファイル]を読み込み、その結果を[カード価格ファイルDTOリスト]へ格納する。
			//※「カード価格登録_項目移動表1」シートを参照
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
	   		    CardPriceFileDto cardInfo = new CardPriceFileDto();
	   		    
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
	   		    
	   		    // Rarity
	   		    cardInfo.setRarity(strArray.length >= 2 ? strArray[1] : "");
	   		    // sellPrice
	   		    cardInfo.setSellPrice(strArray.length >= 3 ? new BigDecimal(strArray[2]) : BigDecimal.ZERO);
	   		    // purchasePrice
	   		    cardInfo.setPurchasePrice(strArray.length >= 4 ? new BigDecimal(strArray[3]) : BigDecimal.ZERO);
	   			
	   		    // DTOをリストに追加
	   			cardPriceFileDtoList.add(cardInfo);
	   			
	   			//次の行を読み込む
	   			line = br.readLine();
	   		}
		}catch(Exception e) {
			//2.2. 項番2.1のファイル読み込み時にエラーが発生した場合、下記を設定して処理を終了する。
			//[処理結果DTO.ステータス]=9（異常）
			prosessResultDto.setStatus("9");
			//[処理結果DTO.メッセージ]=カード価格ファイルの読み込みに失敗しました。
			prosessResultDto.setMessage("カード価格ファイルの読み込みに失敗しました。");
			
			return prosessResultDto;
		}

		//3. ファイル内容チェック
		//（loop開始）[カード価格ファイルDTOリスト]の件数分だけ実行する
		for(CardPriceFileDto cardPriceFileDto : cardPriceFileDtoList) {
			//3.1. [カード価格ファイルDTO.カードID]または[カード価格ファイルDTO.レアリティ]がブランクの場合
			if(Objects.isNull(cardPriceFileDto.getCardId())||Objects.isNull(cardPriceFileDto.getRarity())) {
				//[処理結果DTO.メッセージ]がブランクの場合、下記を設定する。
				if(Objects.isNull(prosessResultDto.getMessage())) {
					//[処理結果DTO.メッセージ]=[行数]行目：カードIDおよびレアリティは必須です。
					prosessResultDto.setMessage(lines + "カードIDおよびレアリティは必須です。");
				//[処理結果DTO.メッセージ]がブランク以外の場合、下記を設定する。	
				} else {
				//[処理結果DTO.メッセージ]=[処理結果DTO.メッセージ] + 改行コード + [行数]行目：カードIDおよびレアリティは必須です。
				prosessResultDto.setMessage(prosessResultDto.getMessage() + "\n" +"行目：カードIDおよびレアリティは必須です。");
				}
			}
			//3.2. カードIDの存在チェックを行う。
				//3.2.1. カードマスタの件数を取得する。
				CardMstExample cardMstExample = new CardMstExample();
				CardMst cardMst = new CardMst();
				long resultCount = 0;
				//<取得項目>
				//count(1)
				//<検索テーブル>
				//カードマスタ
				//<検索条件>
				//カードマスタ.カードID=カード価格ファイルDTO.カードID
				cardMstExample.createCriteria().andCARD_IDEqualTo(cardPriceFileDto.getCardId());
				resultCount = cardMstMapper.countByExample(cardMstExample);
				short versionCount = 0;

			//3.2.2. 存在チェック
				//3.2.1.での取得結果が0件の場合
				if(resultCount == 0) {
					//[処理結果DTO.メッセージ]がブランクの場合、下記を設定する。
					if(Objects.isNull(prosessResultDto.getMessage())) {
						//[処理結果DTO.メッセージ]=[行数]行目：カードID「[カード価格ファイルDTO.カードID]」はカードマスタ上に存在しません。
						prosessResultDto.setMessage(lines + "行目：カードID「" + cardPriceFileDto.getCardId() + "」はカードマスタ上に存在しません。");
					//[処理結果DTO.メッセージ]がブランク以外の場合、下記を設定する。
					} else {
						//[処理結果DTO.メッセージ]=[処理結果DTO.メッセージ] + 改行コード + [行数]行目：カードID「[カード価格ファイルDTO.カードID]」はカードマスタ上に存在しません。
						prosessResultDto.setMessage(prosessResultDto.getMessage() + "\n" +"行目：カードID「"+ cardPriceFileDto.getCardId() +"」はカードマスタ上に存在しません。");
					}
				}
			//3.3. レアリティ存在チェックを行う。
				//3.3.1. コード値マスタの件数を取得する。
				CodeValueMstExample codeValueMstExample = new CodeValueMstExample();
				long resultCount1 = 0;
				//<取得項目>
				//count(1)
				//<検索テーブル>
				//コード値マスタ
				//<検索条件>
				//コード値マスタ.物理コード名="RARITY"
				//ANDコード値マスタ.コード値=カード価格ファイルDTO.レアリティ
				codeValueMstExample.createCriteria().andPHYSCL_CD_NAMEEqualTo(cardPriceFileDto.getRarity());
				resultCount1 = codeValueMstMapper.countByExample(codeValueMstExample);
				short versionCount1 = 0;

			//3.3.2. 存在チェック
			//3.3.1.での取得結果が0件の場合
			if(versionCount1 == 0) {
				//[処理結果DTO.メッセージ]がブランクの場合、下記を設定する。
				if(Objects.isNull(prosessResultDto.getMessage())) {
					//[処理結果DTO.メッセージ]=[行数]行目：レアリティ「[カード価格ファイルDTO.レアリティ]」は存在しません。
					prosessResultDto.setMessage(lines + "行目：レアリティ「"+ cardPriceFileDto.getRarity() +"」はカードマスタ上に存在しません。");
				//[処理結果DTO.メッセージ]がブランク以外の場合、下記を設定する。
				} else {
					//[処理結果DTO.メッセージ]=[処理結果DTO.メッセージ] + 改行コード + [行数]行目：レアリティ「[カード価格ファイルDTO.レアリティ]」は存在しません。
					prosessResultDto.setMessage(prosessResultDto.getMessage() + lines + "行目：レアリティ「"+ cardPriceFileDto.getRarity() +"」は存在しません。");
				}
			}
			//3.4. [カード価格ファイルDTO.販売価格]または[カード価格ファイルDTO.買取価格]に0未満の値が設定されている場合
			if(cardPriceFileDto.getSellPrice().compareTo(BigDecimal.ZERO) == -1) {
				//[処理結果DTO.メッセージ]がブランクの場合、下記を設定する。
				if(Objects.isNull(prosessResultDto.getMessage())) {
					//[処理結果DTO.メッセージ]=[行数]行目：販売価格および買取価格には0以上の値を設定してください。
					prosessResultDto.setMessage(lines + "行目：販売価格および買取価格には0以上の値を設定してください。");
				//[処理結果DTO.メッセージ]がブランク以外の場合、下記を設定する。
				} else {
					//[処理結果DTO.メッセージ]=[処理結果DTO.メッセージ] + 改行コード + [行数]行目：販売価格および買取価格には0以上の値を設定してください。
					prosessResultDto.setMessage(prosessResultDto.getMessage() + lines + "行目：販売価格および買取価格には0以上の値を設定してください。");
				}
			}
			//3.5. [行数]をインクリメントする。
			lines++;
			//（loop終了）
			}
			//3.6. [処理結果DTO.メッセージ]がブランクでない場合、下記を設定して処理を終了する。
			//[処理結果DTO.ステータス]=1（警告）
			if(!Objects.isNull(prosessResultDto.getMessage())) {
				//[処理結果DTO.ステータス]=1（警告）
				prosessResultDto.setStatus("1");
				return prosessResultDto;
				
			}
		//4. カード価格マスタ登録更新
		//（loop開始）[カード価格ファイルDTOリスト]の件数分だけ実行する
		for(CardPriceFileDto cardPriceFileDto : cardPriceFileDtoList) {
			//4.1. カード価格マスタの件数を取得する。
			CardPriceMst cardPriceMst = new CardPriceMst();
			CardPriceMstExample cardPriceMstExample = new CardPriceMstExample();
			long resultCount2 = 0;
			short versionCount2 = 0;
			//<取得項目>
			//count(1)
			//<検索テーブル>
			//カード価格マスタ
			//<検索条件>
			//カード価格マスタ.カードID=カード価格ファイルDTO.カードID
			//ANDカード価格マスタ.レアリティ=カード価格ファイルDTO.レアリティ
			cardPriceMstExample.createCriteria().andRARITYEqualTo(cardPriceFileDto.getRarity());
			resultCount2 = cardPriceMstMapper.countByExample(cardPriceMstExample);

			//4.2. カード価格マスタ登録更新
			//4.1での取得結果が1件の場合、下記データ更新を行う。
			if(resultCount2 == 1) {
				//<更新値>
				//カード価格マスタ.販売価格=カード価格ファイルDTO.販売価格
				cardPriceMst.setSELL_PRICE(cardPriceFileDto.getSellPrice().shortValue());
				//カード価格マスタ.買取価格=カード価格ファイルDTO.買取価格
				cardPriceMst.setPURCHASE_PRICE(cardPriceFileDto.getPurchasePrice().shortValue());
				//カード価格マスタ.排他制御カラム+= 1
				cardPriceMst.setVERSION_EX_KEY(versionCount2++);
				cardPriceMst.setLAST_EDITED(date);
				cardPriceMst.setLAST_USER("insertUser");
				cardPriceMst.setLAST_PROGRAM("readFile");
				//<更新先テーブル>
				//カード価格マスタ
				//<更新条件>
				//カード価格マスタ.カードID=カード価格ファイルDTO.カードID
				//ANDカード価格マスタ.レアリティ=カード価格ファイルDTO.レアリティ
				cardPriceMst.setCARD_ID(cardPriceFileDto.getCardId());
				cardPriceMst.setRARITY(cardPriceFileDto.getRarity());
				cardPriceMstMapper.updateByPrimaryKeySelective(cardPriceMst);
			} else {
				//上記以外の場合、下記データ登録を行う。
				//<登録値>
				//「カード価格登録_項目移動表2」シートを参照
				cardPriceMst.setCARD_ID(cardPriceFileDto.getCardId());
				cardPriceMst.setRARITY(cardPriceFileDto.getRarity());
				cardPriceMst.setSELL_PRICE(cardPriceFileDto.getSellPrice().shortValue());
				cardPriceMst.setPURCHASE_PRICE(cardPriceFileDto.getPurchasePrice().shortValue());
				cardPriceMst.setCREATED_DATE(date);
				cardPriceMst.setCREATED_USER("test");
				cardPriceMst.setCREATED_PROGRAM("readFile");
				cardPriceMst.setLAST_EDITED(date);
				cardPriceMst.setLAST_USER("insertUser");
				cardPriceMst.setLAST_PROGRAM("readFile");
				cardPriceMst.setVERSION_EX_KEY(ZERO);
				//<登録先テーブル>
				//カード価格マスタ
				cardPriceMstMapper.insert(cardPriceMst);
				//（loop終了）
			}
		}

		//5. 終了処理
		//5.1. 下記メッセージを設定する。
		//[処理結果DTO.メッセージ]=カード価格ファイル取り込みに成功しました。
		prosessResultDto.setMessage(FILE_READ_SUCCESS_MESSAGE);
		return prosessResultDto;
	}
}
