package com.example.demo.admin.dto;

import org.springframework.web.multipart.MultipartFile;

public class FileDto {
	/**
	 * アップロードファイル
	 */
    private MultipartFile uploadFile;


    public MultipartFile getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(MultipartFile uploadFile) {
        this.uploadFile = uploadFile;
    }
}