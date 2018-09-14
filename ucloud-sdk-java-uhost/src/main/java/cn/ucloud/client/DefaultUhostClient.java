package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.GetUhostInstanceVncInfoParam;
import cn.ucloud.model.GetUhostInstanceVncInfoResult;
import cn.ucloud.model.StartUHostInstanceParam;
import cn.ucloud.model.StartUHostInstanceResult;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.UhostConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-14 10:57
 **/

public class DefaultUhostClient implements UhostClient {


    /**
     * uhost配置
     */
    private UhostConfig config;


    public DefaultUhostClient(UhostConfig config) {
        this.config = config;
    }


    @Override
    public GetUhostInstanceVncInfoResult getUHostInstanceVncInfo(GetUhostInstanceVncInfoParam param) throws Exception {
        param.setAction("GetUHostInstanceVncInfo");
        UcloudHttp http = new UcloudHttpImpl<GetUhostInstanceVncInfoResult>();
        GetUhostInstanceVncInfoResult result = (GetUhostInstanceVncInfoResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getUHostInstanceVncInfoCallback(GetUhostInstanceVncInfoParam param, UcloudHandler handler, Boolean... asyncFlag) {
        param.setAction("GetUHostInstanceVncInfo");
        UcloudHttp http = new UcloudHttpImpl<GetUhostInstanceVncInfoResult>();
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public StartUHostInstanceResult startUHostInstance(StartUHostInstanceParam param) throws Exception {
        param.setAction("StartUHostInstance");
        UcloudHttp http = new UcloudHttpImpl<StartUHostInstanceResult>();
        StartUHostInstanceResult result = (StartUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void startUHostInstanceCallback(StartUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        param.setAction("StartUHostInstance");
        UcloudHttp http = new UcloudHttpImpl<StartUHostInstanceResult>();
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public BaseResponseResult rebootUHostInstance(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult stopUHostInstance(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult describeUHostTags(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult createUHostInstance(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult modifyUHostInstanceTag(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult terminateUHostInstance(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult describeUHostInstance(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult getUHostInstancePrice(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult resizeUHostInstance(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult modifyUHostInstanceName(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult resetUHostInstancePassword(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult poweroffUHostInstance(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult importCustomImage(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult copyCustomImage(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult describeImage(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult terminateCustomImage(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult reinstallUHostInstance(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult getUHostUpgradePrice(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult modifyUHostInstanceRemark(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult createCustomImage(BaseRequestParam param) {
        return null;
    }

    @Override
    public BaseResponseResult upgradeToArkUHostInstance(BaseRequestParam param) {
        return null;
    }


}
