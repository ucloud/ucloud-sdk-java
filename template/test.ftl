package cn.ucloud.${api.product?lower_case?replace("-","_")}.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.${api.product?lower_case?replace("-","_")}.model.${api.name}Param;
import cn.ucloud.${api.product?lower_case?replace("-","_")}.model.${api.name}Result;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.${api.product?lower_case?replace("-","_")}.pojo.${api.product?upper_case?replace("-","_")}Config;

import static org.junit.Assert.assertNull;


/**
* @Description : ${api.product?upper_case?replace("-","_")}.${api.name} 测试
* @Author : ucloud-sdk-generator
* @Date : ${.now?string('yyyy-MM-dd hh:mm')}
**/
public class ${api.name}Test {

private ${api.product?upper_case?replace("-","_")}Client client;

private ${api.name}Param param;


<#macro testParam >
    <#if api.requestParams?exists>
        <#list api.requestParams as param>
            <#if (!param.name?contains('.') && param.required) >
                <#if (param.type = 'string')>
                    String ${param.name?uncap_first} = "cn-sh2";
                </#if>
                <#if (param.type = 'int')>
                    Integer ${param.name?uncap_first} = 1;
                </#if>
                <#if (param.type = 'bool')>
                    Boolean ${param.name?uncap_first} = false;
                </#if>
                <#if (param.type = 'array' && param.arrType = 'int' )>
                    List${r'<Integer>'} ${param.name?uncap_first} = new ArrayList<>();
                    ${param.name?uncap_first}.put(1);
                </#if>
                <#if (param.type = 'array' && param.arrType = 'string' )>
                    List${r'<String>'} ${param.name?uncap_first}= new ArrayList<>();
                    ${param.name?uncap_first}.put("1");
                </#if>
            </#if>
        </#list>
    </#if>
</#macro>

<#assign cf = 0>
<#assign paramString = "">
<#if api.requestParams?exists>
    <#list api.requestParams as param>
        <#if (!param.name?contains('.') && param.required) >
            <#if cf !=0>
                <#assign paramString = paramString + ", ${param.name?uncap_first}">
                <#assign cf++ >
            </#if>
            <#if cf =0>
                <#assign paramString = paramString + " ${param.name?uncap_first}">
                <#assign cf++ >
            </#if>
        </#if>
    </#list>
</#if>



@Before
public void setUp() throws Exception {
client =  new Default${api.product?upper_case?replace("-","_")}Client(new ${api.product?upper_case?replace("-","_")}Config(
new Account(System.getenv("UCloudPrivateKey"),
System.getenv("UCloudPublicKey"))));
<@testParam/>
param = new ${api.name}Param(${paramString});
param.setProjectId("org-izug1m");
}


@Test
public void ${api.name?uncap_first}() {
try {
${api.name}Result result = client.${api.name?uncap_first}(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

<#--@Test
public void ${api.name?uncap_first}Callback() {
client.${api.name?uncap_first}(param, new UcloudHandler
${r'<'}${api.name}Result${r'>'}() {
@Override
public Object success(${api.name}Result result) {
JSONComparator.jsonComparator(result);
return null;
}

@Override
public Object failed(${api.name}Result result) {
JSONComparator.jsonComparator(result);
return null;
}

@Override
public Object error(Exception e) {
assertNull(e);
return null;
}
}, false);
}-->
}