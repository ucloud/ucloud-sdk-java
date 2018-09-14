package cn.ucloud.http;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.UcloudConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-14 11:39
 **/

public interface UcloudHttp {
    /**
     * http get 请求
     *
     * @param param     请求参数对象
     * @param config    请求环境配置信息
     * @param handler   请求结果处理器
     * @param result    请求结果
     * @param asyncFlag 异步标记位 默认true，请求处理器不为NULL时候有效
     * @return 同步时，返回请求到的数据结果
     * @throws Exception 同步非回调时，有异常则抛出异常
     */
    Object doGet(BaseRequestParam param, UcloudConfig config, UcloudHandler handler, Boolean... asyncFlag) throws Exception;
}
