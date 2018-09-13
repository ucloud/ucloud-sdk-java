package cn.ucloud.util;

import cn.ucloud.exception.ValidatorException;

import javax.validation.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @description: 参数校验工具
 * @author: codezhang
 * @date: 2018-09-13 11:20
 **/

public class ParamValidator {

    /**
     * 校验器工厂
     */
    private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    public static <T> void validator(T obj) throws ValidatorException {
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> constraintViolations = validator
                .validate(obj);
        Iterator<ConstraintViolation<T>> it = constraintViolations
                .iterator();
        while (it.hasNext()) {
            ConstraintViolation<T> e = it.next();
            throw new ValidatorException(e.getMessage());
        }
    }
}
