package com.demo.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuditStatusEnum {

    PRE_AUDIT("1","待审批"),
    ING_AUDIT("2","审批中"),
    ALREADY_AUDIT("3","已审批"),
    ALREADY_REJECT("4","已驳回"),
    ALREADY_COMPLETE("5","已完成");

    private final String code;

    private final String desc;
}
