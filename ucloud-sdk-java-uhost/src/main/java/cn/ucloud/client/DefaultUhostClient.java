package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.*;
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
        UcloudHttp http = new UcloudHttpImpl(GetUhostInstanceVncInfoResult.class);
        GetUhostInstanceVncInfoResult result = (GetUhostInstanceVncInfoResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getUHostInstanceVncInfoCallback(GetUhostInstanceVncInfoParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUhostInstanceVncInfoResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public StartUHostInstanceResult startUHostInstance(StartUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(StartUHostInstanceResult.class);
        StartUHostInstanceResult result = (StartUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void startUHostInstanceCallback(StartUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(StartUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RebootUHostInstanceResult rebootUHostInstance(RebootUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RebootUHostInstanceResult.class);
        RebootUHostInstanceResult result = (RebootUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void rebootUHostInstanceCallback(RebootUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RebootUHostInstanceResult.class);
        try {
            http.doGet(param,config,handler,asyncFlag);
        }catch (Exception e){}
    }


    @Override
    public StopUHostInstanceResult stopUHostInstance(StopUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(StopUHostInstanceResult.class);
        StopUHostInstanceResult result = (StopUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void stopUHostInstanceCallback(StopUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(StopUHostInstanceResult.class);
        try {
            http.doGet(param,config,handler,asyncFlag);
        }catch (Exception e){}
    }

    @Override
    public DescribeUHostTagsResult describeUHostTags(DescribeUHostTagsParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostTagsResult.class);
        DescribeUHostTagsResult result = (DescribeUHostTagsResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeUHostTagsCallback(StopUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostTagsResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        }catch (Exception e){

        }
    }

    @Override
    public CreateUHostInstanceResult createUHostInstance(CreateUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUHostInstanceResult.class);
        CreateUHostInstanceResult result = (CreateUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createUHostInstance(CreateUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUHostInstanceResult.class);
        try {
            http.doGet(param, config, null);
        }catch (Exception e){ }
    }

    @Override
    public ModifyUHostInstanceTagResult modifyUHostInstanceTag(ModifyUHostInstanceTagParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceTagResult.class);
        ModifyUHostInstanceTagResult result = (ModifyUHostInstanceTagResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void modifyUHostInstanceTag(ModifyUHostInstanceTagParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUHostInstanceTagResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        }catch (Exception e){ }
    }

    @Override
    public TerminateUHostInstanceResult terminateUHostInstance(TerminateUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(TerminateUHostInstanceResult.class);
        TerminateUHostInstanceResult result = (TerminateUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void terminateUHostInstance(TerminateUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(TerminateUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DescribeUHostInstanceResult describeUHostInstance(DescribeUHostInstanceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostInstanceResult.class);
        DescribeUHostInstanceResult result = (DescribeUHostInstanceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeUHostInstance(DescribeUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUHostInstanceResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch(Exception e){}
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
