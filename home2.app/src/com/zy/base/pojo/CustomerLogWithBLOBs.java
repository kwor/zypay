package com.zy.base.pojo;

public class CustomerLogWithBLOBs extends CustomerLog {
    private String url;

    private String requestparams;

    private String sign;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getRequestparams() {
        return requestparams;
    }

    public void setRequestparams(String requestparams) {
        this.requestparams = requestparams == null ? null : requestparams.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }
}