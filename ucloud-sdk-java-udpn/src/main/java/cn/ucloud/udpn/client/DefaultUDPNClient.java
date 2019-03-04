package cn.ucloud.udpn.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.common.pojo.UcloudConfig;
import cn.ucloud.udpn.model.*;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-01 15:41
 */
public class DefaultUDPNClient extends DefaultUcloudClient implements UDPNClient {

    public DefaultUDPNClient(UcloudConfig config) {
        super(config);
    }

    @Override
    public AllocateUDPNResult AllocateUDPN(AllocateUDPNParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AllocateUDPNResult.class);
        return (AllocateUDPNResult) http.doGet(param, config, null);
    }

    @Override
    public void AllocateUDPN(AllocateUDPNParam param, UcloudHandler<AllocateUDPNResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AllocateUDPNResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDPNResult DescribeUDPN(DescribeUDPNParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDPNResult.class);
        return (DescribeUDPNResult) http.doGet(param, config, null);
    }

    @Override
    public void DescribeUDPN(DescribeUDPNParam param, UcloudHandler<DescribeUDPNResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDPNResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUDPNLineListResult GetUDPNLineList(GetUDPNLineListParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNLineListResult.class);
        return (GetUDPNLineListResult) http.doGet(param, config, null);
    }

    @Override
    public void GetUDPNLineList(GetUDPNLineListParam param, UcloudHandler<GetUDPNLineListResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNLineListResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUDPNPriceResult GetUDPNPrice(GetUDPNPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNPriceResult.class);
        return (GetUDPNPriceResult) http.doGet(param, config, null);
    }

    @Override
    public void GetUDPNPrice(GetUDPNPriceParam param, UcloudHandler<GetUDPNPriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNPriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUDPNUpgradePriceResult GetUDPNUpgradePrice(GetUDPNUpgradePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNUpgradePriceResult.class);
        return (GetUDPNUpgradePriceResult) http.doGet(param, config, null);
    }

    @Override
    public void GetUDPNUpgradePrice(GetUDPNUpgradePriceParam param, UcloudHandler<GetUDPNUpgradePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNUpgradePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUDPNBandwidthResult ModifyUDPNBandwidth(ModifyUDPNBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUDPNBandwidthResult.class);
        return (ModifyUDPNBandwidthResult) http.doGet(param, config, null);
    }

    @Override
    public void ModifyUDPNBandwidth(ModifyUDPNBandwidthParam param, UcloudHandler<ModifyUDPNBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUDPNBandwidthResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ReleaseUDPNResult ReleaseUDPN(ReleaseUDPNParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ReleaseUDPNResult.class);
        return (ReleaseUDPNResult) http.doGet(param, config, null);
    }

    @Override
    public void ReleaseUDPN(ReleaseUDPNParam param, UcloudHandler<ReleaseUDPNResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ReleaseUDPNResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
