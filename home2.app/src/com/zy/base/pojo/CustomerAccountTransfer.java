package com.zy.base.pojo;

public class CustomerAccountTransfer {
    private Integer id;

    private String orderId;

    private Integer payerCustomerId;

    private Integer payeeCustomerId;

    private Long amount;

    private Long fee;

    private Byte feeTakenOn;

    private String addTime;

    private Byte status;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getPayerCustomerId() {
        return payerCustomerId;
    }

    public void setPayerCustomerId(Integer payerCustomerId) {
        this.payerCustomerId = payerCustomerId;
    }

    public Integer getPayeeCustomerId() {
        return payeeCustomerId;
    }

    public void setPayeeCustomerId(Integer payeeCustomerId) {
        this.payeeCustomerId = payeeCustomerId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Byte getFeeTakenOn() {
        return feeTakenOn;
    }

    public void setFeeTakenOn(Byte feeTakenOn) {
        this.feeTakenOn = feeTakenOn;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}