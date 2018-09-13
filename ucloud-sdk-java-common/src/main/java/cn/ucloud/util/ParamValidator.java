package cn.ucloud.util;

import javax.validation.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-13 11:20
 **/

public class ParamValidator {


    public static <T> void validator(T obj) throws ValidationException {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> constraintViolations = validator
                .validate(obj);
        Iterator<ConstraintViolation<T>> it = constraintViolations
                .iterator();
        while (it.hasNext()) {
            ConstraintViolation<T> e = it.next();
            throw new ValidationException(e.getMessage());
        }
    }
}
