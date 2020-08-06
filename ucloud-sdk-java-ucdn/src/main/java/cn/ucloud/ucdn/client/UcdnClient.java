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

    /**
     * 获取域名刷新任务状态
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeNewUcdnRefreshCacheTaskResult describeNewUcdnRefreshCacheTask(DescribeNewUcdnRefreshCacheTaskParam param) throws Exception;

    /**
     * 获取域名刷新任务状态
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeNewUcdnRefreshCacheTask(DescribeNewUcdnRefreshCacheTaskParam param, UcloudHandler<DescribeNewUcdnRefreshCacheTaskResult> handler, Boolean... asyncFlag);

    /**
     * 获取域名带宽数据
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetNewUcdnDomainBandwidthResult getNewUcdnDomainBandwidth(GetNewUcdnDomainBandwidthParam param) throws Exception;

    /**
     * 获取域名带宽数据
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void getNewUcdnDomainBandwidth(GetNewUcdnDomainBandwidthParam param, UcloudHandler<GetNewUcdnDomainBandwidthResult> handler, Boolean... asyncFlag);

    /**
     * 获取域名命中率
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetNewUcdnDomainHitRateResult getNewUcdnDomainHitRate(GetNewUcdnDomainHitRateParam param) throws Exception;

    /**
     * 获取域名命中率
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void getNewUcdnDomainHitRate(GetNewUcdnDomainHitRateParam param, UcloudHandler<GetNewUcdnDomainHitRateResult> handler, Boolean... asyncFlag);
}
