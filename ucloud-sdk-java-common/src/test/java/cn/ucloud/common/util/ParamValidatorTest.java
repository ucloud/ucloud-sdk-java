package cn.ucloud.common.util;

import cn.ucloud.common.util.ParamValidator;
import org.junit.Test;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-13 11:29
 **/
public class ParamValidatorTest {

    private class Person{
        @NotEmpty(message = "name can not be empty")
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    @Test
    public void validator() {
        Person person = new Person();
        person.setName("zhangsan");
        try {
            ParamValidator.validator(person);
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
        try {
            System.out.println(new Person().getName());
            ParamValidator.validator(new Person());
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}