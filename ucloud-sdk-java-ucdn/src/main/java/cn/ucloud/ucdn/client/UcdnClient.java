package cn.ucloud.ucdn.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.ucdn.model.*;

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

    /**
     * 批量刷新缓存
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BatchRefreshNewUcdnDomainCacheResult batchRefreshNewUcdnDomainCache(BatchRefreshNewUcdnDomainCacheParam param) throws Exception;

    /**
     * 批量刷新缓存
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void batchRefreshNewUcdnDomainCache(BatchRefreshNewUcdnDomainCacheParam param, UcloudHandler<BatchRefreshNewUcdnDomainCacheResult> handler, Boolean... asyncFlag);

    /**
     * 获取预取任务状态
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeNewUcdnPrefetchCacheTaskResult describeNewUcdnPrefetchCacheTask(DescribeNewUcdnPrefetchCacheTaskParam param) throws Exception;

    /**
     * 获取预取任务状态
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeNewUcdnPrefetchCacheTask(DescribeNewUcdnPrefetchCacheTaskParam param, UcloudHandler<DescribeNewUcdnPrefetchCacheTaskResult> handler, Boolean... asyncFlag);
}
