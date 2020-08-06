package cn.ucloud.ucdn.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.ucdn.model.BatchDescribeNewUcdnDomainParam;
import cn.ucloud.ucdn.model.BatchDescribeNewUcdnDomainResult;
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
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
