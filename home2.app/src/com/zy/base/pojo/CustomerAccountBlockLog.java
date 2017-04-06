package com.zy.base.pojo;

public class CustomerAccountBlockLog {
    private Integer id;

    private String fromcustomer;

    private String tocustomer;

    private Short payfromcustomer;

    private Short paytocustomer;

    private String status;

    private Integer blockId;

    private Integer orderNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFromcustomer() {
        return fromcustomer;
    }

    public void setFromcustomer(String fromcustomer) {
        this.fromcustomer = fromcustomer == null ? null : fromcustomer.trim();
    }

    public String getTocustomer() {
        return tocustomer;
    }

    public void setTocustomer(String tocustomer) {
        this.tocustomer = tocustomer == null ? null : tocustomer.trim();
    }

    public Short getPayfromcustomer() {
        return payfromcustomer;
    }

    public void setPayfromcustomer(Short payfromcustomer) {
        this.payfromcustomer = payfromcustomer;
    }

    public Short getPaytocustomer() {
        return paytocustomer;
    }

    public void setPaytocustomer(Short paytocustomer) {
        this.paytocustomer = paytocustomer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
}