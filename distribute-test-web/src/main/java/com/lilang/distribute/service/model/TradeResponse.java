package com.lilang.distribute.service.model;

/**
 * Created by lilang on 17/2/12.
 */
public class TradeResponse {
    private String code;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private String msg;

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TradeResponse{");
        sb.append("code='").append(code).append('\'');
        sb.append(", msg='").append(msg).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
