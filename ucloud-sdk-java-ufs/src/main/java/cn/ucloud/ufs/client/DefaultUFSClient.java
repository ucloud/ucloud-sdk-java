package cn.ucloud.ufs.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.ufs.model.*;
import cn.ucloud.ufs.pojo.UFSConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-10-08 14:32
 **/

public class DefaultUFSClient extends DefaultUcloudClient implements UFSClient {

    /**
     * UFS配置参数
     */
    private UFSConfig config;

    public DefaultUFSClient(UFSConfig config) {
        super(config);
        this.config = config;
    }


    @Override
    public CreateUFSVolumeResult createUFSVolume(CreateUFSVolumeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUFSVolumeResult.class);
        return (CreateUFSVolumeResult) http.doGet(param, config, null);
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
        return (DescribeUFSVolumeResult) http.doGet(param, config, null);
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
        return (DescribeUFSVolumePriceResult) http.doGet(param, config, null);
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
        return (DescribeUFSVolumeUpgradePriceResult) http.doGet(param, config, null);
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
    public DescribeUFSVolumeWhiteListResult describeUFSVolumeWhiteList(DescribeUFSVolumeWhiteListParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUFSVolumeWhiteListResult.class);
        return (DescribeUFSVolumeWhiteListResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUFSVolumeWhiteList(DescribeUFSVolumeWhiteListParam param, UcloudHandler<DescribeUFSVolumeWhiteListResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUFSVolumeWhiteListResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ExtendUFSVolumeResult extendUFSVolume(ExtendUFSVolumeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ExtendUFSVolumeResult.class);
        return (ExtendUFSVolumeResult) http.doGet(param, config, null);
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
        return (InitUFSVolumeWhiteListResult) http.doGet(param, config, null);
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
        return (RemoveUFSVolumeResult) http.doGet(param, config, null);
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
        return (UpdateUFSVolumeInfoResult) http.doGet(param, config, null);
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
        return (UpdateUFSVolumeWhiteListResult) http.doGet(param, config, null);
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
