package com.common.exception;

import com.common.result.GlobalCode;

/**
 * @Author: drainli
 * @Description: 自定义异常
 * @Date: 2021/5/3 15:25
 **/
public class CustomerException extends RuntimeException {

    private GlobalCode code ;

    public CustomerException(GlobalCode code) {
        this.code = code ;
    }

}
