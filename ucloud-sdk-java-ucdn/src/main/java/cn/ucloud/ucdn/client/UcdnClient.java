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

    /**
     * 获取域名状态码监控
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetNewUcdnDomainHttpCodeResult getNewUcdnDomainHttpCode(GetNewUcdnDomainHttpCodeParam param) throws Exception;

    /**
     * 获取域名状态码监控
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void getNewUcdnDomainHttpCode(GetNewUcdnDomainHttpCodeParam param, UcloudHandler<GetNewUcdnDomainHttpCodeResult> handler, Boolean... asyncFlag);

    /**
     * 获取域名详细状态码监控
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetNewUcdnDomainHttpCodeV2Result getNewUcdnDomainHttpCodeV2(GetNewUcdnDomainHttpCodeV2Param param) throws Exception;

    /**
     * 获取域名详细状态码监控
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void getNewUcdnDomainHttpCodeV2(GetNewUcdnDomainHttpCodeV2Param param, UcloudHandler<GetNewUcdnDomainHttpCodeV2Result> handler, Boolean... asyncFlag);

    /**
     * 获取域名请求数
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetNewUcdnDomainRequestNumResult getNewUcdnDomainRequestNum(GetNewUcdnDomainRequestNumParam param) throws Exception;

    /**
     * 获取域名请求数
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void getNewUcdnDomainRequestNum(GetNewUcdnDomainRequestNumParam param, UcloudHandler<GetNewUcdnDomainRequestNumResult> handler, Boolean... asyncFlag);

    /**
     * 批量获取加速域名配置
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetUcdnDomainConfigResult getUcdnDomainConfig(GetUcdnDomainConfigParam param) throws Exception;

    /**
     * 批量获取加速域名配置
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void getUcdnDomainConfig(GetUcdnDomainConfigParam param, UcloudHandler<GetUcdnDomainConfigResult> handler, Boolean... asyncFlag);

    /**
     * 获取加速域名原始日志
     * 日志数据最长保留三个月。
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetUcdnDomainLogResult getUcdnDomainLog(GetUcdnDomainLogParam param) throws Exception;

    /**
     * 获取加速域名原始日志
     * 日志数据最长保留三个月。
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void getUcdnDomainLog(GetUcdnDomainLogParam param, UcloudHandler<GetUcdnDomainLogResult> handler, Boolean... asyncFlag);

    /**
     * 获取域名预取开启状态
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetUcdnDomainPrefetchEnableResult getUcdnDomainPrefetchEnable(GetUcdnDomainPrefetchEnableParam param) throws Exception;

    /**
     * 获取域名预取开启状态
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void getUcdnDomainPrefetchEnable(GetUcdnDomainPrefetchEnableParam param, UcloudHandler<GetUcdnDomainPrefetchEnableResult> handler, Boolean... asyncFlag);

    /**
     * 获取域名请求数
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetUcdnDomainRequestNumV2Result getUcdnDomainRequestNumV2(GetUcdnDomainRequestNumV2Param param) throws Exception;

    /**
     * 获取域名请求数
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void getUcdnDomainRequestNumV2(GetUcdnDomainRequestNumV2Param param, UcloudHandler<GetUcdnDomainRequestNumV2Result> handler, Boolean... asyncFlag);
}
