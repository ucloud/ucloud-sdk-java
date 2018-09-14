package cn.ucloud.exception;

/**
 * @description: 自定义校验异常
 * @author: codezhang
 * @date: 2018-09-13 11:43
 **/

public class ValidatorException extends Exception {

    public ValidatorException(String message) {
        super(message);
    }
}
