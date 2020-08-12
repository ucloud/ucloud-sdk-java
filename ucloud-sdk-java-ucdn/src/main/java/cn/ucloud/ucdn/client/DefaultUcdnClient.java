package cn.ucloud.ucdn.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.common.pojo.BaseResponseResult;
import cn.ucloud.ucdn.model.*;
import cn.ucloud.ucdn.pojo.UcdnConfig;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 14:28
 */
public class DefaultUcdnClient extends DefaultUcloudClient implements UcdnClient {

    public DefaultUcdnClient(UcdnConfig config) {
        super(config);
    }

    @Override
    public BatchRefreshNewUcdnDomainCacheResult batchRefreshNewUcdnDomainCache(BatchRefreshNewUcdnDomainCacheParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BatchRefreshNewUcdnDomainCacheResult.class);
        return (BatchRefreshNewUcdnDomainCacheResult) http.doGet(param, config, null);
    }

    @Override
    public void batchRefreshNewUcdnDomainCache(BatchRefreshNewUcdnDomainCacheParam param, UcloudHandler<BatchRefreshNewUcdnDomainCacheResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BatchRefreshNewUcdnDomainCacheResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeNewUcdnPrefetchCacheTaskResult describeNewUcdnPrefetchCacheTask(DescribeNewUcdnPrefetchCacheTaskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeNewUcdnPrefetchCacheTaskResult.class);
        return (DescribeNewUcdnPrefetchCacheTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void describeNewUcdnPrefetchCacheTask(DescribeNewUcdnPrefetchCacheTaskParam param, UcloudHandler<DescribeNewUcdnPrefetchCacheTaskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeNewUcdnPrefetchCacheTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeNewUcdnRefreshCacheTaskResult describeNewUcdnRefreshCacheTask(DescribeNewUcdnRefreshCacheTaskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeNewUcdnRefreshCacheTaskResult.class);
        return (DescribeNewUcdnRefreshCacheTaskResult) http.doGet(param, config, null);
    }

    @Override
    public void describeNewUcdnRefreshCacheTask(DescribeNewUcdnRefreshCacheTaskParam param, UcloudHandler<DescribeNewUcdnRefreshCacheTaskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeNewUcdnPrefetchCacheTaskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetNewUcdnDomainBandwidthResult getNewUcdnDomainBandwidth(GetNewUcdnDomainBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainBandwidthResult.class);
        return (GetNewUcdnDomainBandwidthResult) http.doGet(param, config, null);
    }

    @Override
    public void getNewUcdnDomainBandwidth(GetNewUcdnDomainBandwidthParam param, UcloudHandler<GetNewUcdnDomainBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainBandwidthResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetNewUcdnDomainHitRateResult getNewUcdnDomainHitRate(GetNewUcdnDomainHitRateParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHitRateResult.class);
        return (GetNewUcdnDomainHitRateResult) http.doGet(param, config, null);
    }

    @Override
    public void getNewUcdnDomainHitRate(GetNewUcdnDomainHitRateParam param, UcloudHandler<GetNewUcdnDomainHitRateResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHitRateResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetNewUcdnDomainHttpCodeResult getNewUcdnDomainHttpCode(GetNewUcdnDomainHttpCodeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHttpCodeResult.class);
        return (GetNewUcdnDomainHttpCodeResult) http.doGet(param, config, null);
    }

    @Override
    public void getNewUcdnDomainHttpCode(GetNewUcdnDomainHttpCodeParam param, UcloudHandler<GetNewUcdnDomainHttpCodeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHttpCodeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetNewUcdnDomainHttpCodeV2Result getNewUcdnDomainHttpCodeV2(GetNewUcdnDomainHttpCodeV2Param param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHttpCodeV2Result.class);
        return (GetNewUcdnDomainHttpCodeV2Result) http.doGet(param, config, null);
    }

    @Override
    public void getNewUcdnDomainHttpCodeV2(GetNewUcdnDomainHttpCodeV2Param param, UcloudHandler<GetNewUcdnDomainHttpCodeV2Result> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainHttpCodeV2Result.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetNewUcdnDomainRequestNumResult getNewUcdnDomainRequestNum(GetNewUcdnDomainRequestNumParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainRequestNumResult.class);
        return (GetNewUcdnDomainRequestNumResult) http.doGet(param, config, null);
    }

    @Override
    public void getNewUcdnDomainRequestNum(GetNewUcdnDomainRequestNumParam param, UcloudHandler<GetNewUcdnDomainRequestNumResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetNewUcdnDomainRequestNumResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUcdnDomainConfigResult getUcdnDomainConfig(GetUcdnDomainConfigParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnDomainConfigResult.class);
        return (GetUcdnDomainConfigResult) http.doGet(param, config, null);
    }

    @Override
    public void getUcdnDomainConfig(GetUcdnDomainConfigParam param, UcloudHandler<GetUcdnDomainConfigResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnDomainConfigResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUcdnDomainLogResult getUcdnDomainLog(GetUcdnDomainLogParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnDomainLogResult.class);
        return (GetUcdnDomainLogResult) http.doGet(param, config, null);
    }

    @Override
    public void getUcdnDomainLog(GetUcdnDomainLogParam param, UcloudHandler<GetUcdnDomainLogResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnDomainLogResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUcdnDomainPrefetchEnableResult getUcdnDomainPrefetchEnable(GetUcdnDomainPrefetchEnableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnDomainPrefetchEnableResult.class);
        return (GetUcdnDomainPrefetchEnableResult) http.doGet(param, config, null);
    }

    @Override
    public void getUcdnDomainPrefetchEnable(GetUcdnDomainPrefetchEnableParam param, UcloudHandler<GetUcdnDomainPrefetchEnableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnDomainPrefetchEnableResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUcdnDomainRequestNumV2Result getUcdnDomainRequestNumV2(GetUcdnDomainRequestNumV2Param param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnDomainRequestNumV2Result.class);
        return (GetUcdnDomainRequestNumV2Result) http.doGet(param, config, null);
    }

    @Override
    public void getUcdnDomainRequestNumV2(GetUcdnDomainRequestNumV2Param param, UcloudHandler<GetUcdnDomainRequestNumV2Result> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnDomainRequestNumV2Result.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUcdnDomainTrafficResult getUcdnDomainTraffic(GetUcdnDomainTrafficParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnDomainTrafficResult.class);
        return (GetUcdnDomainTrafficResult) http.doGet(param, config, null);
    }

    @Override
    public void getUcdnDomainTraffic(GetUcdnDomainTrafficParam param, UcloudHandler<GetUcdnDomainTrafficResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnDomainTrafficResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUcdnPassBandwidthResult getUcdnPassBandwidth(GetUcdnPassBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnPassBandwidthResult.class);
        return (GetUcdnPassBandwidthResult) http.doGet(param, config, null);
    }

    @Override
    public void getUcdnPassBandwidth(GetUcdnPassBandwidthParam param, UcloudHandler<GetUcdnPassBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnPassBandwidthResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUcdnTrafficResult getUcdnTraffic(GetUcdnTrafficParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnTrafficResult.class);
        return (GetUcdnTrafficResult) http.doGet(param, config, null);
    }

    @Override
    public void getUcdnTraffic(GetUcdnTrafficParam param, UcloudHandler<GetUcdnTrafficResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUcdnTrafficResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public PrefetchNewUcdnDomainCacheResult prefetchNewUcdnDomainCache(PrefetchNewUcdnDomainCacheParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(PrefetchNewUcdnDomainCacheResult.class);
        return (PrefetchNewUcdnDomainCacheResult) http.doGet(param, config, null);
    }

    @Override
    public void prefetchNewUcdnDomainCache(PrefetchNewUcdnDomainCacheParam param, UcloudHandler<PrefetchNewUcdnDomainCacheResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(PrefetchNewUcdnDomainCacheResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RefreshNewUcdnDomainCacheResult refreshNewUcdnDomainCache(RefreshNewUcdnDomainCacheParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RefreshNewUcdnDomainCacheResult.class);
        return (RefreshNewUcdnDomainCacheResult) http.doGet(param, config, null);
    }

    @Override
    public void refreshNewUcdnDomainCache(RefreshNewUcdnDomainCacheParam param, UcloudHandler<RefreshNewUcdnDomainCacheResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RefreshNewUcdnDomainCacheResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public BaseResponseResult switchUcdnChargeType(SwitchUcdnChargeTypeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BaseResponseResult.class);
        return (BaseResponseResult) http.doGet(param, config, null);
    }

    @Override
    public void switchUcdnChargeType(SwitchUcdnChargeTypeParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BaseResponseResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
