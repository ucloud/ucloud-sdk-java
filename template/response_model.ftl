package cn.ucloud.${api.product?replace("-","_")?lower_case}.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : ${api.desc} 结果类
* @Author : ucloud-sdk-generator
* @Date : ${.now?string('yyyy-MM-dd hh:mm')}
**/
public class ${api.name}Result extends BaseResponseResult {
<#if api.responseParams?exists>
    <#list api.responseParams as param>
        <#if param.name = 'RetCode' || param.name = 'Action' || param.name = 'Message'>
            <#continue >
        </#if>
        <#if (param.name?contains('.'))>
            // TODO 需要人工接入 ${request.action} =》 ${param.name}
        <#else >
            /**
            * ${param.desc}
            */
            @SerializedName("${param.name}")
            <#if (param.type = 'string')>
                private String ${param.name?uncap_first};
            </#if>
            <#if (param.type = 'int')>
                private Integer ${param.name?uncap_first};
            </#if>
            <#if (param.type = 'bool')>
                private Boolean ${param.name?uncap_first};
            </#if>
            <#if param.type = 'array' && param.arrType = 'int'>
                private List${r'<Integer>'} ${param.name?uncap_first};
            </#if>
            <#if param.type = 'array' && param.arrType = 'string'>
                private List${r'<String>'} ${param.name?uncap_first};
            </#if>
            <#if param.type = 'array' && param.arrType != 'string' && param.arrType != 'int'>
                private List${r'<'}${param.arrType}${r'>'} ${param.name?uncap_first};
            </#if>
        </#if>
    </#list>
</#if>


<#if api.responseParams?exists>
    <#list api.responseParams as param>
        <#if param.name = 'RetCode' || param.name = 'Action' || param.name = 'Message'>
            <#continue >
        </#if>
        <#if (!param.name?contains('.') && param.type != 'array')>
            <#if (param.type = 'string')>
                public String get${CalcGetAndSetName(param.name?uncap_first,'string')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'string')}(String ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }

            </#if>
            <#if param.type = 'int' >
                public Integer get${CalcGetAndSetName(param.name?uncap_first,'int')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'int')}(Integer ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }

            </#if>
            <#if param.type = 'bool' >
                public Boolean get${CalcGetAndSetName(param.name?uncap_first,'bool')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'bool')}(Boolean ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }
            </#if>

            <#if param.type = 'array' && param.arrType = 'string' >
                public List${r'<String>'} get${CalcGetAndSetName(param.name?uncap_first,'List<String>')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'List<String>')}(List${r'<String>'} ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }
            </#if>

            <#if param.type = 'array' && param.arrType = 'int' >
                public List${r'<Integer>'} get${CalcGetAndSetName(param.name?uncap_first,'List<Integer>')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'List<Integer>')}(List${r'<Integer>'} ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }
            </#if>

            <#if param.type = 'array' && param.arrType != 'int' && param.arrType != 'string' >
                public List${r'<'}${param.arrType}${r'>'} get${CalcGetAndSetName(param.name?uncap_first,'List<Model>')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'List<Model>')}(List${r'<'}${param.arrType}${r'>'} ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }
            </#if>
        </#if>
    </#list>
</#if>


}