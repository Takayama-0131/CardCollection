package com.example.demo.admin.dto;

public class ProsessResultDto {
	/**
	 * ステータス
	 */
    private String status;

	/**
	 * メッセージ
	 */
    private String message;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}