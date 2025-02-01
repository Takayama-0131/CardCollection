package com.example.demo.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.admin.dto.ProsessResultDto;
import com.example.demo.admin.service.CardPriceUploadService;
import com.example.demo.admin.service.CardUploadService;


@Controller
public class FileUploadController {

    @Autowired
    private CardUploadService cardUploadService;
    
    @Autowired
    private CardPriceUploadService cardPriceUploadService;
    
	@GetMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";  // templates/index.html を返す
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, Model model) {
        // サービスでファイル処理
        try {
        	ProsessResultDto result = cardUploadService.readFile(file);
            model.addAttribute("message", result.getMessage());
        } catch (Exception e) {
            model.addAttribute("message", "ファイルのアップロードに失敗しました。");
        }
        return "index";
    }

    @PostMapping("/price")
    public String price(@RequestParam("file") MultipartFile file, Model model) {
        // サービスでファイル処理
        try {
        	ProsessResultDto result = cardPriceUploadService.readFile(file);
            model.addAttribute("message", result.getMessage());
        } catch (Exception e) {
            model.addAttribute("message", "ファイルのアップロードに失敗しました。");
        }
        return "index";
    }
}