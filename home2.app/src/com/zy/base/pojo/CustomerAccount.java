package com.zy.base.pojo;

import java.math.BigDecimal;

public class CustomerAccount {
    private Integer id;

    private Integer customerId;

    private BigDecimal totalBalance;

    private BigDecimal availableBalance;

    private BigDecimal blockedBalances;

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

    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getBlockedBalances() {
        return blockedBalances;
    }

    public void setBlockedBalances(BigDecimal blockedBalances) {
        this.blockedBalances = blockedBalances;
    }
}