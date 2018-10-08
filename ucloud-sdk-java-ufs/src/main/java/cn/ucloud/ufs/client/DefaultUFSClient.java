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
    public CreateUFSVolumeResult createUFSVolume(CreateUFSVolumeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUFSVolumeResult.class);
        CreateUFSVolumeResult result = (CreateUFSVolumeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createUFSVolume(CreateUFSVolumeParam param, UcloudHandler<CreateUFSVolumeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUFSVolumeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUFSVolumeResult describeUFSVolume(DescribeUFSVolumeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUFSVolumeResult.class);
        DescribeUFSVolumeResult result = (DescribeUFSVolumeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeUFSVolume(DescribeUFSVolumeParam param, UcloudHandler<DescribeUFSVolumeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUFSVolumeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUFSVolumePriceResult describeUFSVolumePrice(DescribeUFSVolumePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUFSVolumePriceResult.class);
        DescribeUFSVolumePriceResult result = (DescribeUFSVolumePriceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeUFSVolumePrice(DescribeUFSVolumePriceParam param, UcloudHandler<DescribeUFSVolumePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUFSVolumePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUFSVolumeUpgradePriceResult describeUFSVolumeUpgradePrice(DescribeUFSVolumeUpgradePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUFSVolumeUpgradePriceResult.class);
        DescribeUFSVolumeUpgradePriceResult result = (DescribeUFSVolumeUpgradePriceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeUFSVolumeUpgradePrice(DescribeUFSVolumeUpgradePriceParam param, UcloudHandler<DescribeUFSVolumeUpgradePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUFSVolumeUpgradePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
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
