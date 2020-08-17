package com.demo.constant;

public enum ResultEnum {

    SERVER_ERROR("500","服务端异常"),
    SERVER_SUCCESS("200","服务端成功"),
    TASK_ALREADY_EXISTS_ERROR("501","发起任务异常，任务名已经存在"),
    TASK_RULES_ISEMPTY("601","审批规则列表为空");

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
