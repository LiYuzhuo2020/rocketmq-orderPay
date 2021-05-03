package com.common.result;

/**
 * @Author: drainli
 * @Description: 通用响应类
 * @Date: 2021/5/2 22:23
 **/
public class Result {

    private boolean success ;

    private String message ;

    public Result() {

    }

    public Result(boolean success,String message){
        this.success = success ;
        this.message = message ;
    }

    public static Result success(String message){
        return new Result(true,message) ;
    }

    public static Result fail(String message){
        return new Result(false,message) ;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
