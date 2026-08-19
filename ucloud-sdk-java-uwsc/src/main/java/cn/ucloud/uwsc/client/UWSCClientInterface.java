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

import cn.ucloud.common.client.Client;
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
public interface UWSCClientInterface extends Client {

    /**
     * AddExportLineRules - 添加加速规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddExportLineRulesResponse addExportLineRules(AddExportLineRulesRequest request)
            throws UCloudException;

    /**
     * BindCPE - 绑定 CPE
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindCPEResponse bindCPE(BindCPERequest request) throws UCloudException;

    /**
     * CreateCEGateway - 创建CE客户网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCEGatewayResponse createCEGateway(CreateCEGatewayRequest request)
            throws UCloudException;

    /**
     * CreateCETunnel - 创建隧道
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCETunnelResponse createCETunnel(CreateCETunnelRequest request)
            throws UCloudException;

    /**
     * CreateCPE - 创建 CPE
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCPEResponse createCPE(CreateCPERequest request) throws UCloudException;

    /**
     * CreateExportLine - 创建加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateExportLineResponse createExportLine(CreateExportLineRequest request)
            throws UCloudException;

    /**
     * CreatePOPGW - 创建UWAN虚拟路由器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreatePOPGWResponse createPOPGW(CreatePOPGWRequest request) throws UCloudException;

    /**
     * DeleteCEGateway - 删除CE网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCEGatewayResponse deleteCEGateway(DeleteCEGatewayRequest request)
            throws UCloudException;

    /**
     * DeleteCETunnel - 删除隧道
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCETunnelResponse deleteCETunnel(DeleteCETunnelRequest request)
            throws UCloudException;

    /**
     * DeleteExportLine - 删除加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteExportLineResponse deleteExportLine(DeleteExportLineRequest request)
            throws UCloudException;

    /**
     * DeleteExportLineRules - 删除加速规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteExportLineRulesResponse deleteExportLineRules(DeleteExportLineRulesRequest request)
            throws UCloudException;

    /**
     * DeletePOPGW - 删除UWAN虚拟路由器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeletePOPGWResponse deletePOPGW(DeletePOPGWRequest request) throws UCloudException;

    /**
     * DescribeCEGateway - 查询CE网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCEGatewayResponse describeCEGateway(DescribeCEGatewayRequest request)
            throws UCloudException;

    /**
     * DescribeCETunnel - 查询隧道
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCETunnelResponse describeCETunnel(DescribeCETunnelRequest request)
            throws UCloudException;

    /**
     * DescribeCPE - 查询 CPE 信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCPEResponse describeCPE(DescribeCPERequest request) throws UCloudException;

    /**
     * DescribeExportLine - 查询CPE绑定的加速线路信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeExportLineResponse describeExportLine(DescribeExportLineRequest request)
            throws UCloudException;

    /**
     * DescribeExportLineRules - 查询白名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeExportLineRulesResponse describeExportLineRules(
            DescribeExportLineRulesRequest request) throws UCloudException;

    /**
     * DescribePOPGW - 查询UWAN虚拟路由器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribePOPGWResponse describePOPGW(DescribePOPGWRequest request) throws UCloudException;

    /**
     * ListAvailableRegion - 获取可用地域
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListAvailableRegionResponse listAvailableRegion(ListAvailableRegionRequest request)
            throws UCloudException;

    /**
     * UpdateBWPackage - 更新UWSC带宽包
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateBWPackageResponse updateBWPackage(UpdateBWPackageRequest request)
            throws UCloudException;

    /**
     * UpdateCEGateway - 更新CE网关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCEGatewayResponse updateCEGateway(UpdateCEGatewayRequest request)
            throws UCloudException;

    /**
     * UpdateCETunnel - 更新隧道配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCETunnelResponse updateCETunnel(UpdateCETunnelRequest request)
            throws UCloudException;

    /**
     * UpdateCETunnelAttribute - 更新隧道属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCETunnelAttributeResponse updateCETunnelAttribute(
            UpdateCETunnelAttributeRequest request) throws UCloudException;

    /**
     * UpdateExportLine - 修改加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateExportLineResponse updateExportLine(UpdateExportLineRequest request)
            throws UCloudException;

    /**
     * UpdatePOPGWAttribute - 更新UWAN虚拟路由器属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdatePOPGWAttributeResponse updatePOPGWAttribute(UpdatePOPGWAttributeRequest request)
            throws UCloudException;

    /**
     * UpgradeExportLine - 升级加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpgradeExportLineResponse upgradeExportLine(UpgradeExportLineRequest request)
            throws UCloudException;
}
