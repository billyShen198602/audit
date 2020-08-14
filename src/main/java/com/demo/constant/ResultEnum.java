package com.demo.constant;

public enum ResultEnum {

    SERVER_ERROR("500","服务端异常"),
    SERVER_SUCCESS("200","服务端成功"),
    PROMOTER_ERROR("501","发起任务异常"),
    AUDIT_ERROR("502","审批任务异常"),
    REJECT_ERROR("503","驳回任务异常");

    private final String code;
    private final String desc;

    ResultEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
