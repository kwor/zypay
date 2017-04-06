package com.zy.base.pojo;

import java.math.BigDecimal;

public class CustomerAccountWithdraw {
    private Integer id;

    private Integer customerId;

    private BigDecimal amount;

    private String status;

    private String orderId;

    private BigDecimal fee;

    private Byte feeTakenOn;

    private String returnUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Byte getFeeTakenOn() {
        return feeTakenOn;
    }

    public void setFeeTakenOn(Byte feeTakenOn) {
        this.feeTakenOn = feeTakenOn;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl == null ? null : returnUrl.trim();
    }
}