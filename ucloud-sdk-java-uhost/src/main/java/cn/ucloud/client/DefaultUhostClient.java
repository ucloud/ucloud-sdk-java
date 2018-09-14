package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.GetUhostInstanceVncInfoParam;
import cn.ucloud.model.GetUhostInstanceVncInfoResult;
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
        GetUhostInstanceVncInfoResult result = new GetUhostInstanceVncInfoResult();
        UcloudHttp http = new UcloudHttpImpl();
        result = (GetUhostInstanceVncInfoResult) http.doGet(param, config, null, result);
        return result;
    }

    @Override
    public void getUHostInstanceVncInfoCallback(GetUhostInstanceVncInfoParam param, UcloudHandler handler, Boolean... asyncFlag) {
        param.setAction("GetUHostInstanceVncInfo");
        UcloudHttp http = new UcloudHttpImpl();
        try {
            http.doGet(param, config, handler, new GetUhostInstanceVncInfoResult(), asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public BaseResponseResult startUHostInstance(BaseRequestParam param, UhostConfig config, UcloudHandler handler, Boolean... asyncFlag) throws Exception {
        return null;
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
