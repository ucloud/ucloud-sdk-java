package cn.ucloud.${product?lower_case?replace("-","_")}.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.${product?lower_case?replace("-","_")}.model.*;

/**
* @Description : ${product?upper_case} 客户端接口
* @Author : ucloud-sdk-generator
* @Date : ${.now?string('yyyy-MM-dd hh:mm')}
**/
public interface ${product?upper_case}Client extends UcloudClient {

<#if apis?exists>
    <#list apis as api>
        <#if api.status = 'deprecated'>
            <#continue />
        </#if>
        /**
        * ${api.desc}
        *
        * @param param 参数对象
        * @return 结果对象
        * @throws Exception
        */
        ${api.name}Result ${api.name?uncap_first}(
            ${api.name}Param param) throws Exception;

        /**
        * ${api.desc} (回调)
        *
        * @param param     参数对象
        * @param handler   回调接口
        * @param asyncFlag 是否异步
        */
        void ${api.name?uncap_first}(${api.name}Param param,
        UcloudHandler${r'<'}${api.name}Result${r'>'} handler,
        Boolean... asyncFlag);
    </#list>
</#if>
}