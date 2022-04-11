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

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
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
public class IPSecVPNClient extends DefaultClient implements IPSecVPNClientInterface {
    public IPSecVPNClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateRemoteVPNGateway - 创建客户VPN网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateRemoteVPNGatewayResponse createRemoteVPNGateway(
            CreateRemoteVPNGatewayRequest request) throws UCloudException {
        request.setAction("CreateRemoteVPNGateway");
        return (CreateRemoteVPNGatewayResponse)
                this.invoke(request, CreateRemoteVPNGatewayResponse.class);
    }

    /**
     * CreateVPNGateway - 创建VPN网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateVPNGatewayResponse createVPNGateway(CreateVPNGatewayRequest request)
            throws UCloudException {
        request.setAction("CreateVPNGateway");
        return (CreateVPNGatewayResponse) this.invoke(request, CreateVPNGatewayResponse.class);
    }

    /**
     * CreateVPNTunnel - 创建VPN隧道
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateVPNTunnelResponse createVPNTunnel(CreateVPNTunnelRequest request)
            throws UCloudException {
        request.setAction("CreateVPNTunnel");
        return (CreateVPNTunnelResponse) this.invoke(request, CreateVPNTunnelResponse.class);
    }

    /**
     * DeleteRemoteVPNGateway - 删除客户VPN网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteRemoteVPNGatewayResponse deleteRemoteVPNGateway(
            DeleteRemoteVPNGatewayRequest request) throws UCloudException {
        request.setAction("DeleteRemoteVPNGateway");
        return (DeleteRemoteVPNGatewayResponse)
                this.invoke(request, DeleteRemoteVPNGatewayResponse.class);
    }

    /**
     * DeleteVPNGateway - 删除VPN网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteVPNGatewayResponse deleteVPNGateway(DeleteVPNGatewayRequest request)
            throws UCloudException {
        request.setAction("DeleteVPNGateway");
        return (DeleteVPNGatewayResponse) this.invoke(request, DeleteVPNGatewayResponse.class);
    }

    /**
     * DeleteVPNTunnel - 删除VPN隧道
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteVPNTunnelResponse deleteVPNTunnel(DeleteVPNTunnelRequest request)
            throws UCloudException {
        request.setAction("DeleteVPNTunnel");
        return (DeleteVPNTunnelResponse) this.invoke(request, DeleteVPNTunnelResponse.class);
    }

    /**
     * DescribeRemoteVPNGateway - 获取客户VPN网关信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeRemoteVPNGatewayResponse describeRemoteVPNGateway(
            DescribeRemoteVPNGatewayRequest request) throws UCloudException {
        request.setAction("DescribeRemoteVPNGateway");
        return (DescribeRemoteVPNGatewayResponse)
                this.invoke(request, DescribeRemoteVPNGatewayResponse.class);
    }

    /**
     * DescribeVPNGateway - 获取VPN网关信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeVPNGatewayResponse describeVPNGateway(DescribeVPNGatewayRequest request)
            throws UCloudException {
        request.setAction("DescribeVPNGateway");
        return (DescribeVPNGatewayResponse) this.invoke(request, DescribeVPNGatewayResponse.class);
    }

    /**
     * DescribeVPNTunnel - 获取VPN隧道信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeVPNTunnelResponse describeVPNTunnel(DescribeVPNTunnelRequest request)
            throws UCloudException {
        request.setAction("DescribeVPNTunnel");
        return (DescribeVPNTunnelResponse) this.invoke(request, DescribeVPNTunnelResponse.class);
    }

    /**
     * GetVPNGatewayPrice - 获取VPN价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetVPNGatewayPriceResponse getVPNGatewayPrice(GetVPNGatewayPriceRequest request)
            throws UCloudException {
        request.setAction("GetVPNGatewayPrice");
        return (GetVPNGatewayPriceResponse) this.invoke(request, GetVPNGatewayPriceResponse.class);
    }

    /**
     * GetVPNGatewayUpgradePrice - 获取VPN网关规格改动价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetVPNGatewayUpgradePriceResponse getVPNGatewayUpgradePrice(
            GetVPNGatewayUpgradePriceRequest request) throws UCloudException {
        request.setAction("GetVPNGatewayUpgradePrice");
        return (GetVPNGatewayUpgradePriceResponse)
                this.invoke(request, GetVPNGatewayUpgradePriceResponse.class);
    }

    /**
     * UpdateVPNGateway - 更改VPN网关规格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateVPNGatewayResponse updateVPNGateway(UpdateVPNGatewayRequest request)
            throws UCloudException {
        request.setAction("UpdateVPNGateway");
        return (UpdateVPNGatewayResponse) this.invoke(request, UpdateVPNGatewayResponse.class);
    }

    /**
     * UpdateVPNTunnelAttribute - 更新VPN隧道属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateVPNTunnelAttributeResponse updateVPNTunnelAttribute(
            UpdateVPNTunnelAttributeRequest request) throws UCloudException {
        request.setAction("UpdateVPNTunnelAttribute");
        return (UpdateVPNTunnelAttributeResponse)
                this.invoke(request, UpdateVPNTunnelAttributeResponse.class);
    }
}
