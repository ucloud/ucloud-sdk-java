package cn.ucloud.${product?lower_case?replace("-","_")}.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.${product?lower_case?replace("-","_")}.model.*;
import cn.ucloud.${product?lower_case?replace("-","_")}.pojo.${product?upper_case}Config;
import cn.ucloud.${product?lower_case?replace("-","_")}.model.*;

/**
* @Description : ${product?upper_case} 默认客户端接口实现
* @Author : ucloud-sdk-generator
* @Date : ${.now?string('yyyy-MM-dd hh:mm')}
**/
public class Default${product?upper_case}Client extends DefaultUcloudClient implements ${product?upper_case}Client{
public Default${product?upper_case}Client(${product?upper_case}Config config) {
super(config);
}
<#if apis?exists>
    <#list apis as api>
        <#if api.status = 'deprecated'>
            <#continue />
        </#if>
        @Override
        public ${api.name}Result ${api.name?uncap_first}(${api.name}Param param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(${api.name}Result.class);
        return (${api.name}Result) http.doGet(param, config, null);
        }

        @Override
        public void ${api.name?uncap_first}(${api.name}Param param,
        UcloudHandler ${r'<'}${api.name}Result${r'>'} handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(${api.name}Result.class);
        try {
        http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
        }
    </#list>
</#if>
}