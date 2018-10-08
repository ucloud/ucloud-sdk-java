package cn.ucloud.ufs.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.BaseResponseResult;
import cn.ucloud.ufs.model.*;
import cn.ucloud.ufs.pojo.UFSConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-10-08 14:32
 **/

public class DefaultUFSClient implements UFSClient {

    /**
     * UFS配置参数
     */
    private UFSConfig config;

    public DefaultUFSClient(UFSConfig config) {
        this.config = config;
    }


    @Override
    public BaseResponseResult createUFSVolume(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createUFSVolume(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describeUFSVolume(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeUFSVolume(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describeUFSVolumePrice(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeUFSVolumePrice(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describeUFSVolumeUpgradePrice(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeUFSVolumeUpgradePrice(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describeUFSVolumeWhiteList(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeUFSVolumeWhiteList(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public ExtendUFSVolumeResult extendUFSVolume(ExtendUFSVolumeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ExtendUFSVolumeResult.class);
        ExtendUFSVolumeResult result = (ExtendUFSVolumeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void extendUFSVolume(ExtendUFSVolumeParam param, UcloudHandler<ExtendUFSVolumeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ExtendUFSVolumeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public InitUFSVolumeWhiteListResult initUFSVolumeWhiteList(InitUFSVolumeWhiteListParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(InitUFSVolumeWhiteListResult.class);
        InitUFSVolumeWhiteListResult result = (InitUFSVolumeWhiteListResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void initUFSVolumeWhiteList(InitUFSVolumeWhiteListParam param, UcloudHandler<InitUFSVolumeWhiteListResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(InitUFSVolumeWhiteListResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RemoveUFSVolumeResult removeUFSVolume(RemoveUFSVolumeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RemoveUFSVolumeResult.class);
        RemoveUFSVolumeResult result = (RemoveUFSVolumeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void removeUFSVolume(RemoveUFSVolumeParam param, UcloudHandler<RemoveUFSVolumeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RemoveUFSVolumeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateUFSVolumeInfoResult updateUFSVolumeInfo(UpdateUFSVolumeInfoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateUFSVolumeInfoResult.class);
        UpdateUFSVolumeInfoResult result = (UpdateUFSVolumeInfoResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updateUFSVolumeInfo(UpdateUFSVolumeInfoParam param, UcloudHandler<UpdateUFSVolumeInfoResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateUFSVolumeInfoResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateUFSVolumeWhiteListResult updateUFSVolumeWhiteList(UpdateUFSVolumeWhiteListParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateUFSVolumeWhiteListResult.class);
        UpdateUFSVolumeWhiteListResult result = (UpdateUFSVolumeWhiteListResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updateUFSVolumeWhiteList(UpdateUFSVolumeWhiteListParam param, UcloudHandler<UpdateUFSVolumeWhiteListResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateUFSVolumeWhiteListResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
