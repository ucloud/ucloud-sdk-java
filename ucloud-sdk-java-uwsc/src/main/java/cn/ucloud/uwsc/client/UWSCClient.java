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
package cn.ucloud.uwsc.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uwsc.models.AddExportLineRulesRequest;
import cn.ucloud.uwsc.models.AddExportLineRulesResponse;
import cn.ucloud.uwsc.models.BindCPERequest;
import cn.ucloud.uwsc.models.BindCPEResponse;
import cn.ucloud.uwsc.models.CreateCEGatewayRequest;
import cn.ucloud.uwsc.models.CreateCEGatewayResponse;
import cn.ucloud.uwsc.models.CreateCETunnelRequest;
import cn.ucloud.uwsc.models.CreateCETunnelResponse;
import cn.ucloud.uwsc.models.CreateCPERequest;
import cn.ucloud.uwsc.models.CreateCPEResponse;
import cn.ucloud.uwsc.models.CreateExportLineRequest;
import cn.ucloud.uwsc.models.CreateExportLineResponse;
import cn.ucloud.uwsc.models.CreatePOPGWRequest;
import cn.ucloud.uwsc.models.CreatePOPGWResponse;
import cn.ucloud.uwsc.models.DeleteCEGatewayRequest;
import cn.ucloud.uwsc.models.DeleteCEGatewayResponse;
import cn.ucloud.uwsc.models.DeleteCETunnelRequest;
import cn.ucloud.uwsc.models.DeleteCETunnelResponse;
import cn.ucloud.uwsc.models.DeleteExportLineRequest;
import cn.ucloud.uwsc.models.DeleteExportLineResponse;
import cn.ucloud.uwsc.models.DeleteExportLineRulesRequest;
import cn.ucloud.uwsc.models.DeleteExportLineRulesResponse;
import cn.ucloud.uwsc.models.DeletePOPGWRequest;
import cn.ucloud.uwsc.models.DeletePOPGWResponse;
import cn.ucloud.uwsc.models.DescribeCEGatewayRequest;
import cn.ucloud.uwsc.models.DescribeCEGatewayResponse;
import cn.ucloud.uwsc.models.DescribeCETunnelRequest;
import cn.ucloud.uwsc.models.DescribeCETunnelResponse;
import cn.ucloud.uwsc.models.DescribeCPERequest;
import cn.ucloud.uwsc.models.DescribeCPEResponse;
import cn.ucloud.uwsc.models.DescribeExportLineRequest;
import cn.ucloud.uwsc.models.DescribeExportLineResponse;
import cn.ucloud.uwsc.models.DescribeExportLineRulesRequest;
import cn.ucloud.uwsc.models.DescribeExportLineRulesResponse;
import cn.ucloud.uwsc.models.DescribePOPGWRequest;
import cn.ucloud.uwsc.models.DescribePOPGWResponse;
import cn.ucloud.uwsc.models.ListAvailableRegionRequest;
import cn.ucloud.uwsc.models.ListAvailableRegionResponse;
import cn.ucloud.uwsc.models.UpdateBWPackageRequest;
import cn.ucloud.uwsc.models.UpdateBWPackageResponse;
import cn.ucloud.uwsc.models.UpdateCEGatewayRequest;
import cn.ucloud.uwsc.models.UpdateCEGatewayResponse;
import cn.ucloud.uwsc.models.UpdateCETunnelAttributeRequest;
import cn.ucloud.uwsc.models.UpdateCETunnelAttributeResponse;
import cn.ucloud.uwsc.models.UpdateCETunnelRequest;
import cn.ucloud.uwsc.models.UpdateCETunnelResponse;
import cn.ucloud.uwsc.models.UpdateExportLineRequest;
import cn.ucloud.uwsc.models.UpdateExportLineResponse;
import cn.ucloud.uwsc.models.UpdatePOPGWAttributeRequest;
import cn.ucloud.uwsc.models.UpdatePOPGWAttributeResponse;
import cn.ucloud.uwsc.models.UpgradeExportLineRequest;
import cn.ucloud.uwsc.models.UpgradeExportLineResponse;

/** This client is used to call actions of **UWSC** service */
public class UWSCClient extends DefaultClient implements UWSCClientInterface {
    public UWSCClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * AddExportLineRules - 添加加速规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddExportLineRulesResponse addExportLineRules(AddExportLineRulesRequest request)
            throws UCloudException {
        request.setAction("AddExportLineRules");
        return (AddExportLineRulesResponse) this.invoke(request, AddExportLineRulesResponse.class);
    }

    /**
     * BindCPE - 绑定 CPE
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindCPEResponse bindCPE(BindCPERequest request) throws UCloudException {
        request.setAction("BindCPE");
        return (BindCPEResponse) this.invoke(request, BindCPEResponse.class);
    }

    /**
     * CreateCEGateway - 创建CE客户网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCEGatewayResponse createCEGateway(CreateCEGatewayRequest request)
            throws UCloudException {
        request.setAction("CreateCEGateway");
        return (CreateCEGatewayResponse) this.invoke(request, CreateCEGatewayResponse.class);
    }

    /**
     * CreateCETunnel - 创建隧道
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCETunnelResponse createCETunnel(CreateCETunnelRequest request)
            throws UCloudException {
        request.setAction("CreateCETunnel");
        return (CreateCETunnelResponse) this.invoke(request, CreateCETunnelResponse.class);
    }

    /**
     * CreateCPE - 创建 CPE
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCPEResponse createCPE(CreateCPERequest request) throws UCloudException {
        request.setAction("CreateCPE");
        return (CreateCPEResponse) this.invoke(request, CreateCPEResponse.class);
    }

    /**
     * CreateExportLine - 创建加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateExportLineResponse createExportLine(CreateExportLineRequest request)
            throws UCloudException {
        request.setAction("CreateExportLine");
        return (CreateExportLineResponse) this.invoke(request, CreateExportLineResponse.class);
    }

    /**
     * CreatePOPGW - 创建UWAN虚拟路由器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreatePOPGWResponse createPOPGW(CreatePOPGWRequest request) throws UCloudException {
        request.setAction("CreatePOPGW");
        return (CreatePOPGWResponse) this.invoke(request, CreatePOPGWResponse.class);
    }

    /**
     * DeleteCEGateway - 删除CE网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCEGatewayResponse deleteCEGateway(DeleteCEGatewayRequest request)
            throws UCloudException {
        request.setAction("DeleteCEGateway");
        return (DeleteCEGatewayResponse) this.invoke(request, DeleteCEGatewayResponse.class);
    }

    /**
     * DeleteCETunnel - 删除隧道
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCETunnelResponse deleteCETunnel(DeleteCETunnelRequest request)
            throws UCloudException {
        request.setAction("DeleteCETunnel");
        return (DeleteCETunnelResponse) this.invoke(request, DeleteCETunnelResponse.class);
    }

    /**
     * DeleteExportLine - 删除加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteExportLineResponse deleteExportLine(DeleteExportLineRequest request)
            throws UCloudException {
        request.setAction("DeleteExportLine");
        return (DeleteExportLineResponse) this.invoke(request, DeleteExportLineResponse.class);
    }

    /**
     * DeleteExportLineRules - 删除加速规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteExportLineRulesResponse deleteExportLineRules(DeleteExportLineRulesRequest request)
            throws UCloudException {
        request.setAction("DeleteExportLineRules");
        return (DeleteExportLineRulesResponse)
                this.invoke(request, DeleteExportLineRulesResponse.class);
    }

    /**
     * DeletePOPGW - 删除UWAN虚拟路由器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeletePOPGWResponse deletePOPGW(DeletePOPGWRequest request) throws UCloudException {
        request.setAction("DeletePOPGW");
        return (DeletePOPGWResponse) this.invoke(request, DeletePOPGWResponse.class);
    }

    /**
     * DescribeCEGateway - 查询CE网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCEGatewayResponse describeCEGateway(DescribeCEGatewayRequest request)
            throws UCloudException {
        request.setAction("DescribeCEGateway");
        return (DescribeCEGatewayResponse) this.invoke(request, DescribeCEGatewayResponse.class);
    }

    /**
     * DescribeCETunnel - 查询隧道
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCETunnelResponse describeCETunnel(DescribeCETunnelRequest request)
            throws UCloudException {
        request.setAction("DescribeCETunnel");
        return (DescribeCETunnelResponse) this.invoke(request, DescribeCETunnelResponse.class);
    }

    /**
     * DescribeCPE - 查询 CPE 信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCPEResponse describeCPE(DescribeCPERequest request) throws UCloudException {
        request.setAction("DescribeCPE");
        return (DescribeCPEResponse) this.invoke(request, DescribeCPEResponse.class);
    }

    /**
     * DescribeExportLine - 查询CPE绑定的加速线路信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeExportLineResponse describeExportLine(DescribeExportLineRequest request)
            throws UCloudException {
        request.setAction("DescribeExportLine");
        return (DescribeExportLineResponse) this.invoke(request, DescribeExportLineResponse.class);
    }

    /**
     * DescribeExportLineRules - 查询白名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeExportLineRulesResponse describeExportLineRules(
            DescribeExportLineRulesRequest request) throws UCloudException {
        request.setAction("DescribeExportLineRules");
        return (DescribeExportLineRulesResponse)
                this.invoke(request, DescribeExportLineRulesResponse.class);
    }

    /**
     * DescribePOPGW - 查询UWAN虚拟路由器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribePOPGWResponse describePOPGW(DescribePOPGWRequest request)
            throws UCloudException {
        request.setAction("DescribePOPGW");
        return (DescribePOPGWResponse) this.invoke(request, DescribePOPGWResponse.class);
    }

    /**
     * ListAvailableRegion - 获取可用地域
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListAvailableRegionResponse listAvailableRegion(ListAvailableRegionRequest request)
            throws UCloudException {
        request.setAction("ListAvailableRegion");
        return (ListAvailableRegionResponse)
                this.invoke(request, ListAvailableRegionResponse.class);
    }

    /**
     * UpdateBWPackage - 更新UWSC带宽包
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateBWPackageResponse updateBWPackage(UpdateBWPackageRequest request)
            throws UCloudException {
        request.setAction("UpdateBWPackage");
        return (UpdateBWPackageResponse) this.invoke(request, UpdateBWPackageResponse.class);
    }

    /**
     * UpdateCEGateway - 更新CE网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCEGatewayResponse updateCEGateway(UpdateCEGatewayRequest request)
            throws UCloudException {
        request.setAction("UpdateCEGateway");
        return (UpdateCEGatewayResponse) this.invoke(request, UpdateCEGatewayResponse.class);
    }

    /**
     * UpdateCETunnel - 更新隧道配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCETunnelResponse updateCETunnel(UpdateCETunnelRequest request)
            throws UCloudException {
        request.setAction("UpdateCETunnel");
        return (UpdateCETunnelResponse) this.invoke(request, UpdateCETunnelResponse.class);
    }

    /**
     * UpdateCETunnelAttribute - 更新隧道属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCETunnelAttributeResponse updateCETunnelAttribute(
            UpdateCETunnelAttributeRequest request) throws UCloudException {
        request.setAction("UpdateCETunnelAttribute");
        return (UpdateCETunnelAttributeResponse)
                this.invoke(request, UpdateCETunnelAttributeResponse.class);
    }

    /**
     * UpdateExportLine - 修改加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateExportLineResponse updateExportLine(UpdateExportLineRequest request)
            throws UCloudException {
        request.setAction("UpdateExportLine");
        return (UpdateExportLineResponse) this.invoke(request, UpdateExportLineResponse.class);
    }

    /**
     * UpdatePOPGWAttribute - 更新UWAN虚拟路由器属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdatePOPGWAttributeResponse updatePOPGWAttribute(UpdatePOPGWAttributeRequest request)
            throws UCloudException {
        request.setAction("UpdatePOPGWAttribute");
        return (UpdatePOPGWAttributeResponse)
                this.invoke(request, UpdatePOPGWAttributeResponse.class);
    }

    /**
     * UpgradeExportLine - 升级加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpgradeExportLineResponse upgradeExportLine(UpgradeExportLineRequest request)
            throws UCloudException {
        request.setAction("UpgradeExportLine");
        return (UpgradeExportLineResponse) this.invoke(request, UpgradeExportLineResponse.class);
    }
}
