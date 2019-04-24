package cn.ucloud.common.http;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.BaseRestRequestParam;
import cn.ucloud.common.pojo.UcloudConfig;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 17:08
 **/
public interface UcloudRestHttp {
    /**
     * http get 请求
     *
     * @param param     请求参数对象
     * @param config    请求环境配置信息
     * @param handler   请求结果处理器
     * @param restURL   请求地址
     * @param asyncFlag 异步标记位 默认true，请求处理器不为NULL时候有效
     * @return 同步时，返回请求到的数据结果
     * @throws Exception 同步非回调时，有异常则抛出异常
     */
    Object doGet(BaseRestRequestParam param, UcloudConfig config, String restURL,
                 UcloudHandler handler, Boolean... asyncFlag) throws Exception;


    /**
     * http post 请求
     *
     * @param param     请求参数对象
     * @param config    请求环境配置信息
     * @param handler   请求结果处理器
     * @param restURL   请求地址
     * @param asyncFlag 异步标记位 默认true，请求处理器不为NULL时候有效
     * @return 同步时，返回请求到的数据结果
     * @throws Exception 同步非回调时，有异常则抛出异常
     */
    Object doPost(BaseRestRequestParam param, UcloudConfig config, String restURL,
                  UcloudHandler handler, Boolean... asyncFlag) throws Exception;
}
