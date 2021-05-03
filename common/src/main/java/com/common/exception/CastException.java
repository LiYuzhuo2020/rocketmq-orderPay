package com.common.exception;

import com.common.result.GlobalCode;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: drainli
 * @Description: 自定义异常
 * @Date: 2021/5/3 15:24
 **/
@Slf4j
public class CastException {

    public static void cast(GlobalCode code) {
        log.error(code.toString());
        throw new CustomerException(code);
    }

}
