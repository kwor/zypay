package com.zy.base.pojo;

public class BankCode {
    private Integer id;

    private String bkCode;

    private String bkName;

    private Byte bkStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBkCode() {
        return bkCode;
    }

    public void setBkCode(String bkCode) {
        this.bkCode = bkCode == null ? null : bkCode.trim();
    }

    public String getBkName() {
        return bkName;
    }

    public void setBkName(String bkName) {
        this.bkName = bkName == null ? null : bkName.trim();
    }

    public Byte getBkStatus() {
        return bkStatus;
    }

    public void setBkStatus(Byte bkStatus) {
        this.bkStatus = bkStatus;
    }
}