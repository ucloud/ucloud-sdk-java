package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 主备Redis配置文件参数信息 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class URedisConfigParamSet  {
            /**
            * 配置项名称
            */
            @SerializedName("ConfigKey")
                private String configKey;
            /**
            * 配置项值
            */
            @SerializedName("ConfigValue")
                private String configValue;
            /**
            * 配置类型
            */
            @SerializedName("ValueType")
                private String valueType;
            /**
            * 配置描述
            */
            @SerializedName("ValueDescription")
                private String valueDescription;
            /**
            * 配置项的属性
            */
            @SerializedName("Property")
                private String property;


                public String getConfigKey() {
                return this.configKey;
                }

                public void setConfigKey(String configKey) {
                this.configKey = configKey;
                }
                public String getConfigValue() {
                return this.configValue;
                }

                public void setConfigValue(String configValue) {
                this.configValue = configValue;
                }
                public String getValueType() {
                return this.valueType;
                }

                public void setValueType(String valueType) {
                this.valueType = valueType;
                }
                public String getValueDescription() {
                return this.valueDescription;
                }

                public void setValueDescription(String valueDescription) {
                this.valueDescription = valueDescription;
                }
                public String getProperty() {
                return this.property;
                }

                public void setProperty(String property) {
                this.property = property;
                }


}