package com.example.demo.admin.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.admin.dto.CardSearchCriteria;
import com.example.demo.admin.dto.CardSearchDto;
import com.example.demo.admin.dto.CardSearchInfoDto;
import com.example.demo.admin.dto.ProsessResultDto;
import com.example.demo.admin.service.CardPriceUploadService;
import com.example.demo.admin.service.CardSearchService;
import com.example.demo.admin.service.CardUploadService;

@Controller
public class FileUploadController {

    @Autowired
    private CardUploadService cardUploadService;

    @Autowired
    private CardPriceUploadService cardPriceUploadService;

    @Autowired
    private CardSearchService cardSearchService;

    @GetMapping("/")
    public String showSearchPage(Model model) {
        // カード種別リストを取得
        CardSearchInfoDto cardSearchInfo = cardSearchService.getCardKinds();
        model.addAttribute("cardSearchInfo", cardSearchInfo);
        return "index";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, Model model) {
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
        try {
            ProsessResultDto result = cardPriceUploadService.readFile(file);
            model.addAttribute("message", result.getMessage());
        } catch (Exception e) {
            model.addAttribute("message", "ファイルのアップロードに失敗しました。");
        }
        return "index";
    }

    @PostMapping("/search")
    public String search(@ModelAttribute CardSearchCriteria searchInfo, Model model) {
        try {
            List<CardSearchDto> cards = cardSearchService.search(searchInfo);
            CardSearchInfoDto cardSearchInfo = cardSearchService.getCardKinds();
            model.addAttribute("cardSearchInfo", cardSearchInfo);
            model.addAttribute("cards", cards);
            
            // 現在時刻を取得してフォーマット
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);
            
            model.addAttribute("message", "検索が完了しました。(" + formattedDateTime + ")");
        } catch (Exception e) {
            model.addAttribute("message", "カードの検索に失敗しました。");
            model.addAttribute("cards", null);
        }
        return "index";
    }
}
