package cn.ucloud.common.util;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import cn.ucloud.common.util.ObjectToParam;
import org.junit.Test;

import java.util.List;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-13 14:55
 **/
public class ObjectToParamTest {

    private class Person extends BaseRequestParam {
        @UcloudParam("Name")
        private String name = "jianhui.zhang";

        @UcloudParam("Com")
        //@NotNull(message = "com can not be enpty")
        private String com ;


        private Integer age ;

        protected Person() {
            super("");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCom() {
            return com;
        }

        public void setCom(String com) {
            this.com = com;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

    @Test
    public void objectToParams() throws Exception {
        List<Param> params = ObjectToParam.objectToParams(new Person());
        for (Param param:
             params) {
            System.out.println(param.getParamKey()+"===>"+param.getParamValue());
        }
    }
}