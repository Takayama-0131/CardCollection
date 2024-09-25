package com.example.demo.admin.controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.example.demo.admin.entity.CodeValueMst;
//import com.example.demo.admin.service.CardUploadService;
///**
// * ファイルアップロード Controller
// */ 
//@RequestMapping(value = "/user")
//@Controller
////@RestController
//public class FileUploadController {
//	
//	@Autowired
//	//@ComponentScan("com.example.demo.admin.mapper")
//	CardUploadService cardUploadService;
//
//	/**
//	 * ユーザー情報一覧画面を表示
//	 * @param model Model
//	 * @return ユーザー情報一覧画面のHTML
//	 */
//	@RequestMapping(value = "/user", method = RequestMethod.GET)
//	public String displayList(Model model) {
//	  CodeValueMst codeValueMst  = fileUploadService.displayList();
//	  model.addAttribute("codeValueMst", codeValueMst);
//	  return "user/list";
//	}

	import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.admin.service.CardUploadService;

@Controller
public class FileUploadController {
    @GetMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";  // templates/index.html を返す
    }

    @PostMapping("/upload111")
    public String upload(@RequestParam("file") MultipartFile file, Model model) {
        // サービスでファイル処理
        CardUploadService.readFile(file);
        model.addAttribute("message", "ファイルがアップロードされました。");
        return "index";  // 成功メッセージをindex.htmlに表示
    }
}