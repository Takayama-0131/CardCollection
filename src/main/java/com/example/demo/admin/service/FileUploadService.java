package com.example.demo.admin.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.admin.entity.admin.CodeValueMst;
import com.example.demo.admin.entity.admin.CodeValueMstExample;
import com.example.demo.admin.entity.admin.CodeValueMstKey;
import com.example.demo.admin.mapper.admin.CodeValueMstMapper;

/**
 * ファイルアップロード Service
 */ 
@Service
public class FileUploadService {

	@Autowired
	//@ComponentScan("com.example.demo.admin.mapper")
	CodeValueMstMapper codeValueMstMapper;
	
	//@RequestMapping(value = "/list", method = RequestMethod.GET)
	//@GetMapping("/user/list")
    public CodeValueMst displayList() {
		//WHERE句設定
		CodeValueMstKey codeValueMstKey = new CodeValueMstKey();
		String key1 = "ATTRIBUTE";
		int key2 = 1;
		codeValueMstKey.setPHYSCL_CD_NAME(key1);
		codeValueMstKey.setCD_VAL(BigDecimal.valueOf(key2));
		
		//Exampleクラスを使用する場合
		CodeValueMstExample example = new CodeValueMstExample();
		example.createCriteria().andCD_VALIsNotNull().andPHYSCL_CD_NAMEEqualTo(key1).andCD_VALEqualTo(BigDecimal.valueOf(key2));
		
		return codeValueMstMapper.selectByPrimaryKey(codeValueMstKey); 
    }

//	/**
//	 * カード情報登録
//	 */
//	public String cardInfoRegister(InfoRequest infoRequest) {
//		//DTOに登録情報を詰め替え
//		CardInfoFileDto cardInfoFileDto = new CardInfoFileDto();
//		//登録メソッド呼び出し
//		//カード情報ファイルに値が設定されていない場合、メッセージを表示して処理を終了する。
//	}
//	
//	
//	/**
//	 * カード価格登録
//	 */
//	public String cardPriceRegister(PriceRequest priceRequest) {
//		//DTOに登録情報を詰め替え
//		//登録メソッド呼び出し
//		//カード情報ファイルに値が設定されていない場合、メッセージを表示して処理を終了する。
//	}
	

}