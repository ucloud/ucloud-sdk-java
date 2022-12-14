/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.udpn.client;

import cn.ucloud.common.client.Client;
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

/**
 * This client is used to call actions of **UDPN** service
 */
public interface UDPNClientInterface extends Client {
        
        
        
        
        
        
    /**
     * AllocateUDPN - 分配 UDPN 专线
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AllocateUDPNResponse allocateUDPN(AllocateUDPNRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUDPN - 描述 UDPN
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUDPNResponse describeUDPN(DescribeUDPNRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUDPNLineList - 获取专线线路列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUDPNLineListResponse getUDPNLineList(GetUDPNLineListRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUDPNPrice - 获取 UDPN 价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUDPNPriceResponse getUDPNPrice(GetUDPNPriceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUDPNUpgradePrice - 获取升级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUDPNUpgradePriceResponse getUDPNUpgradePrice(GetUDPNUpgradePriceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyUDPNBandwidth - 修改带宽
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUDPNBandwidthResponse modifyUDPNBandwidth(ModifyUDPNBandwidthRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ReleaseUDPN - 释放 UDPN
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReleaseUDPNResponse releaseUDPN(ReleaseUDPNRequest request) throws UCloudException;
}
