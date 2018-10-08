package cn.ucloud.ufs.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.BaseResponseResult;
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
    public BaseResponseResult extendUFSVolume(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void extendUFSVolume(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult initUFSVolumeWhiteList(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void initUFSVolumeWhiteList(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult removeUFSVolume(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void removeUFSVolume(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult updateUFSVolumeInfo(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateUFSVolumeInfo(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult updateUFSVolumeWhiteList(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateUFSVolumeWhiteList(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag) {

    }
}
