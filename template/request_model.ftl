package cn.ucloud.${api.product?replace("-","_")?lower_case}.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : ${api.desc} 参数类
* @Author : ucloud-sdk-generator
* @Date : ${.now?string('yyyy-MM-dd hh:mm')}
**/
public class ${api.name}Param extends BaseRequestParam {
<#if api.requestParams?exists>
    <#list api.requestParams as param>
        <#if param.name = 'ProjectId'>
            <#continue >
        </#if>
        <#if (param.name?contains('.'))>
            // TODO 需要人工接入 ${api.name} =》 ${param.name}
        <#else >
            <#if param.type = 'array' && param.arrType != 'int' && param.arrType != 'string'>
                // TODO 需要人工接入 ${api.name} =》 ${param.name}
                <#continue />
            </#if>
            /**
            * ${param.desc}
            */
            @UcloudParam("${param.name}")
            <#if (param.required = true)>
                <#if (param.type = 'string')>
                    @NotEmpty(message = "${param.name?uncap_first} can not be empty")
                </#if>
                <#if (param.type = 'int' || param.type = 'bool')>
                    @NotNull(message ="${param.name?uncap_first} can not be null")
                </#if>
            </#if>
            <#if (param.type = 'string')>
                private String ${param.name?uncap_first};
                <#continue >
            </#if>
            <#if (param.type = 'int')>
                private Integer ${param.name?uncap_first};
                <#continue >
            </#if>
            <#if (param.type = 'float')>
                private Double ${param.name?uncap_first};
                <#continue >
            </#if>
            <#if (param.type = 'bool')>
                private Boolean ${param.name?uncap_first};
                <#continue >
            </#if>
            <#if param.type = 'array' && param.arrType = 'int'>
                private List${r'<Integer>'} ${param.name?uncap_first};
                <#continue >
            </#if>
            <#if param.type = 'array' && param.arrType = 'string'>
                private List${r'<String>'} ${param.name?uncap_first};
                <#continue >
            </#if>
        </#if>
    </#list>
</#if>

<#assign cf = 0>
<#macro constructParam >
    <#if api.requestParams?exists>
        <#list api.requestParams as param>
            <#if (!param.name?contains('.') && param.required) >
                <#if (param.type = 'string')>
                    <#if cf != 0>,</#if>String ${param.name?uncap_first}
                    <#assign cf++ >
                    <#continue >
                </#if>
                <#if (param.type = 'int')>
                    <#if cf != 0>,</#if>Integer ${param.name?uncap_first}
                    <#assign cf++ >
                    <#continue >
                </#if>
                <#if (param.type = 'bool')>
                    <#if cf != 0>,</#if>Boolean ${param.name?uncap_first}
                    <#assign cf++ >
                    <#continue >
                </#if>
                <#if (param.type = 'float')>
                    <#if cf != 0>,</#if>Double ${param.name?uncap_first}
                    <#assign cf++ >
                    <#continue >
                </#if>
                <#if (param.type = 'array' && param.arrType = 'int' )>
                    <#if cf != 0>,</#if>List${r'<Integer>'} ${param.name?uncap_first}
                    <#assign cf++ >
                    <#continue >
                </#if>
                <#if (param.type = 'array' && param.arrType = 'string' )>
                    <#if cf != 0>,</#if>List${r'<String>'} ${param.name?uncap_first}
                    <#assign cf++ >
                    <#continue >
                </#if>
            </#if>
        </#list>
    </#if>
</#macro>

public ${api.name}Param(<@constructParam/>){
super("${api.name}");
<#if api.requestParams?exists>
    <#list api.requestParams as param>
        <#if param.required>
            <#if (param.name?contains('.') || param.type = 'array')>
                // TODO 需要人工接入 ${api.name} =》 ${param.name} is required
            <#else >
                this.${param.name?uncap_first} = ${param.name?uncap_first};
            </#if>
        </#if>
    </#list>
</#if>
}


<#if api.requestParams?exists>
    <#list api.requestParams as param>
        <#if (!param.name?contains('.') && param.name != 'ProjectId')>
            <#if (param.type = 'string')>
                public String get${CalcGetAndSetName(param.name?uncap_first,'string')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'string')}(String ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }
                <#continue >
            </#if>
            <#if param.type = 'int' >
                public Integer get${CalcGetAndSetName(param.name?uncap_first,'int')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'int')}(Integer ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }
                <#continue >
            </#if>
            <#if param.type = 'float' >
                public Double get${CalcGetAndSetName(param.name?uncap_first,'float')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'float')}(Double ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }
                <#continue >
            </#if>
            <#if param.type = 'bool' >
                public Boolean get${CalcGetAndSetName(param.name?uncap_first,'bool')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'bool')}(Boolean ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }
                <#continue >
            </#if>

            <#if param.type = 'array' && param.arrType = 'string' >
                public List${r'<String>'} get${CalcGetAndSetName(param.name?uncap_first,'List<String>')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'List<String>')}(List${r'<String>'} ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }
                <#continue >
            </#if>

            <#if param.type = 'array' && param.arrType = 'int' >
                public List${r'<Integer>'} get${CalcGetAndSetName(param.name?uncap_first,'List<Integer>')}() {
                return this.${param.name?uncap_first};
                }

                public void set${CalcGetAndSetName(param.name?uncap_first,'List<Integer>')}(List${r'<Integer>'} ${param.name?uncap_first}) {
                this.${param.name?uncap_first} = ${param.name?uncap_first};
                }
                <#continue >
            </#if>

        </#if>
    </#list>
</#if>


}