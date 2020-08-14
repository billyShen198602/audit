package com.demo.handler;

import com.demo.constant.Result;
import com.demo.constant.ResultEnum;
import com.demo.utils.ResultUtils;
import com.demo.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if(e instanceof MyException) {
            MyException myException = (MyException)e;
            return ResultUtils.error(myException.getCode(),myException.getMessage());
        }else{
            log.error("系统异常",e);
            return ResultUtils.error(ResultEnum.SERVER_ERROR.getCode(), ResultEnum.SERVER_ERROR.getDesc());
        }
    }

}
