package cn.ucloud.ucdn.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.ucdn.model.BatchDescribeNewUcdnDomainParam;
import cn.ucloud.ucdn.model.BatchDescribeNewUcdnDomainResult;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 13:43
 */
public interface UcdnClient extends UcloudClient {
    /**
     * 批量获取加速域名配置
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BatchDescribeNewUcdnDomainResult batchDescribeNewUcdnDomain(BatchDescribeNewUcdnDomainParam param) throws Exception;

    /**
     * 批量获取加速域名配置
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void batchDescribeNewUcdnDomain(BatchDescribeNewUcdnDomainParam param, UcloudHandler<BatchDescribeNewUcdnDomainResult> handler, Boolean... asyncFlag);
}
