package com.demo.constant;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    private static final long serialVersionUID = -904712610565038351L;
    private String code;
    private String msg;
    private Object data;

}
