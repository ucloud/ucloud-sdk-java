package cn.ucloud.ucdn.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
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
    public BatchDescribeNewUcdnDomainResult batchDescribeNewUcdnDomain(BatchDescribeNewUcdnDomainParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BatchDescribeNewUcdnDomainResult.class);
        return (BatchDescribeNewUcdnDomainResult) http.doGet(param, config, null);
    }

    @Override
    public void batchDescribeNewUcdnDomain(BatchDescribeNewUcdnDomainParam param, UcloudHandler<BatchDescribeNewUcdnDomainResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BatchDescribeNewUcdnDomainResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
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
}
