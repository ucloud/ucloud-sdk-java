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
package cn.ucloud.ipsecvpn.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ipsecvpn.models.CreateRemoteVPNGatewayRequest;
import cn.ucloud.ipsecvpn.models.CreateRemoteVPNGatewayResponse;
import cn.ucloud.ipsecvpn.models.CreateVPNGatewayRequest;
import cn.ucloud.ipsecvpn.models.CreateVPNGatewayResponse;
import cn.ucloud.ipsecvpn.models.CreateVPNTunnelRequest;
import cn.ucloud.ipsecvpn.models.CreateVPNTunnelResponse;
import cn.ucloud.ipsecvpn.models.DeleteRemoteVPNGatewayRequest;
import cn.ucloud.ipsecvpn.models.DeleteRemoteVPNGatewayResponse;
import cn.ucloud.ipsecvpn.models.DeleteVPNGatewayRequest;
import cn.ucloud.ipsecvpn.models.DeleteVPNGatewayResponse;
import cn.ucloud.ipsecvpn.models.DeleteVPNTunnelRequest;
import cn.ucloud.ipsecvpn.models.DeleteVPNTunnelResponse;
import cn.ucloud.ipsecvpn.models.DescribeRemoteVPNGatewayRequest;
import cn.ucloud.ipsecvpn.models.DescribeRemoteVPNGatewayResponse;
import cn.ucloud.ipsecvpn.models.DescribeVPNGatewayRequest;
import cn.ucloud.ipsecvpn.models.DescribeVPNGatewayResponse;
import cn.ucloud.ipsecvpn.models.DescribeVPNTunnelRequest;
import cn.ucloud.ipsecvpn.models.DescribeVPNTunnelResponse;
import cn.ucloud.ipsecvpn.models.GetVPNGatewayPriceRequest;
import cn.ucloud.ipsecvpn.models.GetVPNGatewayPriceResponse;
import cn.ucloud.ipsecvpn.models.GetVPNGatewayUpgradePriceRequest;
import cn.ucloud.ipsecvpn.models.GetVPNGatewayUpgradePriceResponse;
import cn.ucloud.ipsecvpn.models.UpdateVPNGatewayRequest;
import cn.ucloud.ipsecvpn.models.UpdateVPNGatewayResponse;
import cn.ucloud.ipsecvpn.models.UpdateVPNTunnelAttributeRequest;
import cn.ucloud.ipsecvpn.models.UpdateVPNTunnelAttributeResponse;

/** This client is used to call actions of **IPSecVPN** service */
public interface IPSecVPNClientInterface extends Client {

    /**
     * CreateRemoteVPNGateway - 创建客户VPN网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CreateRemoteVPNGatewayResponse createRemoteVPNGateway(CreateRemoteVPNGatewayRequest request)
            throws UCloudException;

    /**
     * CreateVPNGateway - 创建VPN网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CreateVPNGatewayResponse createVPNGateway(CreateVPNGatewayRequest request)
            throws UCloudException;

    /**
     * CreateVPNTunnel - 创建VPN隧道
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CreateVPNTunnelResponse createVPNTunnel(CreateVPNTunnelRequest request) throws UCloudException;

    /**
     * DeleteRemoteVPNGateway - 删除客户VPN网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DeleteRemoteVPNGatewayResponse deleteRemoteVPNGateway(DeleteRemoteVPNGatewayRequest request)
            throws UCloudException;

    /**
     * DeleteVPNGateway - 删除VPN网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DeleteVPNGatewayResponse deleteVPNGateway(DeleteVPNGatewayRequest request)
            throws UCloudException;

    /**
     * DeleteVPNTunnel - 删除VPN隧道
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DeleteVPNTunnelResponse deleteVPNTunnel(DeleteVPNTunnelRequest request) throws UCloudException;

    /**
     * DescribeRemoteVPNGateway - 获取客户VPN网关信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeRemoteVPNGatewayResponse describeRemoteVPNGateway(
            DescribeRemoteVPNGatewayRequest request) throws UCloudException;

    /**
     * DescribeVPNGateway - 获取VPN网关信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeVPNGatewayResponse describeVPNGateway(DescribeVPNGatewayRequest request)
            throws UCloudException;

    /**
     * DescribeVPNTunnel - 获取VPN隧道信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeVPNTunnelResponse describeVPNTunnel(DescribeVPNTunnelRequest request)
            throws UCloudException;

    /**
     * GetVPNGatewayPrice - 获取VPN价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    GetVPNGatewayPriceResponse getVPNGatewayPrice(GetVPNGatewayPriceRequest request)
            throws UCloudException;

    /**
     * GetVPNGatewayUpgradePrice - 获取VPN网关规格改动价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    GetVPNGatewayUpgradePriceResponse getVPNGatewayUpgradePrice(
            GetVPNGatewayUpgradePriceRequest request) throws UCloudException;

    /**
     * UpdateVPNGateway - 更改VPN网关规格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    UpdateVPNGatewayResponse updateVPNGateway(UpdateVPNGatewayRequest request)
            throws UCloudException;

    /**
     * UpdateVPNTunnelAttribute - 更新VPN隧道属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    UpdateVPNTunnelAttributeResponse updateVPNTunnelAttribute(
            UpdateVPNTunnelAttributeRequest request) throws UCloudException;
}
