package cn.ucloud.udpn.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.udpn.model.*;
import cn.ucloud.udpn.pojo.UdpnConfig;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-01 15:41
 */
public class DefaultUDPNClient extends DefaultUcloudClient implements UDPNClient {

    public DefaultUDPNClient(UdpnConfig config) {
        super(config);
    }

    @Override
    public AllocateUDPNResult allocateUDPN(AllocateUDPNParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AllocateUDPNResult.class);
        return (AllocateUDPNResult) http.doGet(param, config, null);
    }

    @Override
    public void allocateUDPN(AllocateUDPNParam param, UcloudHandler<AllocateUDPNResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AllocateUDPNResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDPNResult describeUDPN(DescribeUDPNParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDPNResult.class);
        return (DescribeUDPNResult) http.doGet(param, config, null);
    }

    @Override
    public void describeUDPN(DescribeUDPNParam param, UcloudHandler<DescribeUDPNResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDPNResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUDPNLineListResult getUDPNLineList(GetUDPNLineListParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNLineListResult.class);
        return (GetUDPNLineListResult) http.doGet(param, config, null);
    }

    @Override
    public void getUDPNLineList(GetUDPNLineListParam param, UcloudHandler<GetUDPNLineListResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNLineListResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUDPNPriceResult getUDPNPrice(GetUDPNPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNPriceResult.class);
        return (GetUDPNPriceResult) http.doGet(param, config, null);
    }

    @Override
    public void getUDPNPrice(GetUDPNPriceParam param, UcloudHandler<GetUDPNPriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNPriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUDPNUpgradePriceResult getUDPNUpgradePrice(GetUDPNUpgradePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNUpgradePriceResult.class);
        return (GetUDPNUpgradePriceResult) http.doGet(param, config, null);
    }

    @Override
    public void getUDPNUpgradePrice(GetUDPNUpgradePriceParam param, UcloudHandler<GetUDPNUpgradePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUDPNUpgradePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUDPNBandwidthResult modifyUDPNBandwidth(ModifyUDPNBandwidthParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUDPNBandwidthResult.class);
        return (ModifyUDPNBandwidthResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUDPNBandwidth(ModifyUDPNBandwidthParam param, UcloudHandler<ModifyUDPNBandwidthResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUDPNBandwidthResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ReleaseUDPNResult releaseUDPN(ReleaseUDPNParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ReleaseUDPNResult.class);
        return (ReleaseUDPNResult) http.doGet(param, config, null);
    }

    @Override
    public void releaseUDPN(ReleaseUDPNParam param, UcloudHandler<ReleaseUDPNResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ReleaseUDPNResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
