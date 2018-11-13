package cn.ucloud.common.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.common.model.GetProjectListParam;
import cn.ucloud.common.model.GetProjectListResult;
import cn.ucloud.common.model.GetRegionParam;
import cn.ucloud.common.model.GetRegionResult;
import cn.ucloud.common.pojo.UcloudConfig;

/**
 * @description: 默认的ucloud基础服务client
 * @author: codezhang
 * @date: 2018-11-13 13:52
 **/

public class DefaultUcloudClient implements UcloudClient {
    private UcloudConfig config;

    public DefaultUcloudClient(UcloudConfig config) {
        this.config = config;
    }

    @Override
    public GetRegionResult getRegion(GetRegionParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetRegionResult.class);
        GetRegionResult result = (GetRegionResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getRegion(GetRegionParam param, UcloudHandler<GetRegionResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetRegionResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetProjectListResult getProductList(GetProjectListParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetProjectListResult.class);
        GetProjectListResult result = (GetProjectListResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getProductList(GetProjectListParam param, UcloudHandler<GetProjectListResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetProjectListResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
