/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.udpn.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.udpn.models.AllocateUDPNRequest;
import cn.ucloud.udpn.models.AllocateUDPNResponse;
import cn.ucloud.udpn.models.DescribeUDPNRequest;
import cn.ucloud.udpn.models.DescribeUDPNResponse;
import cn.ucloud.udpn.models.GetUDPNLineListRequest;
import cn.ucloud.udpn.models.GetUDPNLineListResponse;
import cn.ucloud.udpn.models.GetUDPNPriceRequest;
import cn.ucloud.udpn.models.GetUDPNPriceResponse;
import cn.ucloud.udpn.models.GetUDPNUpgradePriceRequest;
import cn.ucloud.udpn.models.GetUDPNUpgradePriceResponse;
import cn.ucloud.udpn.models.ModifyUDPNBandwidthRequest;
import cn.ucloud.udpn.models.ModifyUDPNBandwidthResponse;
import cn.ucloud.udpn.models.ReleaseUDPNRequest;
import cn.ucloud.udpn.models.ReleaseUDPNResponse;

/** This client is used to call actions of **UDPN** service */
public class UDPNClient extends DefaultClient implements UDPNClientInterface {
    public UDPNClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * AllocateUDPN - 分配 UDPN 专线
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AllocateUDPNResponse allocateUDPN(AllocateUDPNRequest request) throws UCloudException {
        request.setAction("AllocateUDPN");
        return (AllocateUDPNResponse) this.invoke(request, AllocateUDPNResponse.class);
    }

    /**
     * DescribeUDPN - 描述 UDPN
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUDPNResponse describeUDPN(DescribeUDPNRequest request) throws UCloudException {
        request.setAction("DescribeUDPN");
        return (DescribeUDPNResponse) this.invoke(request, DescribeUDPNResponse.class);
    }

    /**
     * GetUDPNLineList - 获取专线线路列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUDPNLineListResponse getUDPNLineList(GetUDPNLineListRequest request)
            throws UCloudException {
        request.setAction("GetUDPNLineList");
        return (GetUDPNLineListResponse) this.invoke(request, GetUDPNLineListResponse.class);
    }

    /**
     * GetUDPNPrice - 获取 UDPN 价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUDPNPriceResponse getUDPNPrice(GetUDPNPriceRequest request) throws UCloudException {
        request.setAction("GetUDPNPrice");
        return (GetUDPNPriceResponse) this.invoke(request, GetUDPNPriceResponse.class);
    }

    /**
     * GetUDPNUpgradePrice - 获取升级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUDPNUpgradePriceResponse getUDPNUpgradePrice(GetUDPNUpgradePriceRequest request)
            throws UCloudException {
        request.setAction("GetUDPNUpgradePrice");
        return (GetUDPNUpgradePriceResponse)
                this.invoke(request, GetUDPNUpgradePriceResponse.class);
    }

    /**
     * ModifyUDPNBandwidth - 修改带宽
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUDPNBandwidthResponse modifyUDPNBandwidth(ModifyUDPNBandwidthRequest request)
            throws UCloudException {
        request.setAction("ModifyUDPNBandwidth");
        return (ModifyUDPNBandwidthResponse)
                this.invoke(request, ModifyUDPNBandwidthResponse.class);
    }

    /**
     * ReleaseUDPN - 释放 UDPN
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReleaseUDPNResponse releaseUDPN(ReleaseUDPNRequest request) throws UCloudException {
        request.setAction("ReleaseUDPN");
        return (ReleaseUDPNResponse) this.invoke(request, ReleaseUDPNResponse.class);
    }
}
