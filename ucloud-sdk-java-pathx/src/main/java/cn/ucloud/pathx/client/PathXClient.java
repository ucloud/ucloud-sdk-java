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
package cn.ucloud.pathx.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.pathx.models.BindPathXSSLRequest;
import cn.ucloud.pathx.models.BindPathXSSLResponse;
import cn.ucloud.pathx.models.CreateGlobalSSHInstanceRequest;
import cn.ucloud.pathx.models.CreateGlobalSSHInstanceResponse;
import cn.ucloud.pathx.models.CreatePathXSSLRequest;
import cn.ucloud.pathx.models.CreatePathXSSLResponse;
import cn.ucloud.pathx.models.CreateUGAForwarderRequest;
import cn.ucloud.pathx.models.CreateUGAForwarderResponse;
import cn.ucloud.pathx.models.CreateUGAInstanceRequest;
import cn.ucloud.pathx.models.CreateUGAInstanceResponse;
import cn.ucloud.pathx.models.CreateUPathRequest;
import cn.ucloud.pathx.models.CreateUPathResponse;
import cn.ucloud.pathx.models.DeleteGlobalSSHInstanceRequest;
import cn.ucloud.pathx.models.DeleteGlobalSSHInstanceResponse;
import cn.ucloud.pathx.models.DeletePathXSSLRequest;
import cn.ucloud.pathx.models.DeletePathXSSLResponse;
import cn.ucloud.pathx.models.DeleteUGAForwarderRequest;
import cn.ucloud.pathx.models.DeleteUGAForwarderResponse;
import cn.ucloud.pathx.models.DeleteUGAInstanceRequest;
import cn.ucloud.pathx.models.DeleteUGAInstanceResponse;
import cn.ucloud.pathx.models.DeleteUPathRequest;
import cn.ucloud.pathx.models.DeleteUPathResponse;
import cn.ucloud.pathx.models.DescribeGlobalSSHInstanceRequest;
import cn.ucloud.pathx.models.DescribeGlobalSSHInstanceResponse;
import cn.ucloud.pathx.models.DescribePathXLineConfigRequest;
import cn.ucloud.pathx.models.DescribePathXLineConfigResponse;
import cn.ucloud.pathx.models.DescribePathXSSLRequest;
import cn.ucloud.pathx.models.DescribePathXSSLResponse;
import cn.ucloud.pathx.models.DescribeUGAInstanceRequest;
import cn.ucloud.pathx.models.DescribeUGAInstanceResponse;
import cn.ucloud.pathx.models.DescribeUPathRequest;
import cn.ucloud.pathx.models.DescribeUPathResponse;
import cn.ucloud.pathx.models.DescribeUPathTemplateRequest;
import cn.ucloud.pathx.models.DescribeUPathTemplateResponse;
import cn.ucloud.pathx.models.GetGlobalSSHPriceRequest;
import cn.ucloud.pathx.models.GetGlobalSSHPriceResponse;
import cn.ucloud.pathx.models.GetGlobalSSHUpdatePriceRequest;
import cn.ucloud.pathx.models.GetGlobalSSHUpdatePriceResponse;
import cn.ucloud.pathx.models.GetPathXMetricRequest;
import cn.ucloud.pathx.models.GetPathXMetricResponse;
import cn.ucloud.pathx.models.ModifyGlobalSSHPortRequest;
import cn.ucloud.pathx.models.ModifyGlobalSSHPortResponse;
import cn.ucloud.pathx.models.ModifyGlobalSSHRemarkRequest;
import cn.ucloud.pathx.models.ModifyGlobalSSHRemarkResponse;
import cn.ucloud.pathx.models.ModifyGlobalSSHTypeRequest;
import cn.ucloud.pathx.models.ModifyGlobalSSHTypeResponse;
import cn.ucloud.pathx.models.ModifyUPathBandwidthRequest;
import cn.ucloud.pathx.models.ModifyUPathBandwidthResponse;
import cn.ucloud.pathx.models.ModifyUPathTemplateRequest;
import cn.ucloud.pathx.models.ModifyUPathTemplateResponse;
import cn.ucloud.pathx.models.UGABindUPathRequest;
import cn.ucloud.pathx.models.UGABindUPathResponse;
import cn.ucloud.pathx.models.UGAUnBindUPathRequest;
import cn.ucloud.pathx.models.UGAUnBindUPathResponse;
import cn.ucloud.pathx.models.UnBindPathXSSLRequest;
import cn.ucloud.pathx.models.UnBindPathXSSLResponse;
import cn.ucloud.pathx.models.UpdatePathXWhitelistRequest;
import cn.ucloud.pathx.models.UpdatePathXWhitelistResponse;

/** This client is used to call actions of **PathX** service */
public class PathXClient extends DefaultClient implements PathXClientInterface {
    public PathXClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * BindPathXSSL - 绑定PathX SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindPathXSSLResponse bindPathXSSL(BindPathXSSLRequest request) throws UCloudException {
        request.setAction("BindPathXSSL");
        return (BindPathXSSLResponse) this.invoke(request, BindPathXSSLResponse.class);
    }

    /**
     * CreateGlobalSSHInstance - 创建GlobalSSH实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateGlobalSSHInstanceResponse createGlobalSSHInstance(
            CreateGlobalSSHInstanceRequest request) throws UCloudException {
        request.setAction("CreateGlobalSSHInstance");
        return (CreateGlobalSSHInstanceResponse)
                this.invoke(request, CreateGlobalSSHInstanceResponse.class);
    }

    /**
     * CreatePathXSSL - 创建证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreatePathXSSLResponse createPathXSSL(CreatePathXSSLRequest request)
            throws UCloudException {
        request.setAction("CreatePathXSSL");
        return (CreatePathXSSLResponse) this.invoke(request, CreatePathXSSLResponse.class);
    }

    /**
     * CreateUGAForwarder - 创建加速实例转发器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUGAForwarderResponse createUGAForwarder(CreateUGAForwarderRequest request)
            throws UCloudException {
        request.setAction("CreateUGAForwarder");
        return (CreateUGAForwarderResponse) this.invoke(request, CreateUGAForwarderResponse.class);
    }

    /**
     * CreateUGAInstance - 创建全球加速配置项
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUGAInstanceResponse createUGAInstance(CreateUGAInstanceRequest request)
            throws UCloudException {
        request.setAction("CreateUGAInstance");
        return (CreateUGAInstanceResponse) this.invoke(request, CreateUGAInstanceResponse.class);
    }

    /**
     * CreateUPath - 创建UPath
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUPathResponse createUPath(CreateUPathRequest request) throws UCloudException {
        request.setAction("CreateUPath");
        return (CreateUPathResponse) this.invoke(request, CreateUPathResponse.class);
    }

    /**
     * DeleteGlobalSSHInstance - 删除GlobalSSH实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteGlobalSSHInstanceResponse deleteGlobalSSHInstance(
            DeleteGlobalSSHInstanceRequest request) throws UCloudException {
        request.setAction("DeleteGlobalSSHInstance");
        return (DeleteGlobalSSHInstanceResponse)
                this.invoke(request, DeleteGlobalSSHInstanceResponse.class);
    }

    /**
     * DeletePathXSSL - 删除PathX SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeletePathXSSLResponse deletePathXSSL(DeletePathXSSLRequest request)
            throws UCloudException {
        request.setAction("DeletePathXSSL");
        return (DeletePathXSSLResponse) this.invoke(request, DeletePathXSSLResponse.class);
    }

    /**
     * DeleteUGAForwarder - 删除加速实例转发器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUGAForwarderResponse deleteUGAForwarder(DeleteUGAForwarderRequest request)
            throws UCloudException {
        request.setAction("DeleteUGAForwarder");
        return (DeleteUGAForwarderResponse) this.invoke(request, DeleteUGAForwarderResponse.class);
    }

    /**
     * DeleteUGAInstance - 删除全球加速服务加速配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUGAInstanceResponse deleteUGAInstance(DeleteUGAInstanceRequest request)
            throws UCloudException {
        request.setAction("DeleteUGAInstance");
        return (DeleteUGAInstanceResponse) this.invoke(request, DeleteUGAInstanceResponse.class);
    }

    /**
     * DeleteUPath - 删除UPath
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUPathResponse deleteUPath(DeleteUPathRequest request) throws UCloudException {
        request.setAction("DeleteUPath");
        return (DeleteUPathResponse) this.invoke(request, DeleteUPathResponse.class);
    }

    /**
     * DescribeGlobalSSHInstance - 获取GlobalSSH实例列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeGlobalSSHInstanceResponse describeGlobalSSHInstance(
            DescribeGlobalSSHInstanceRequest request) throws UCloudException {
        request.setAction("DescribeGlobalSSHInstance");
        return (DescribeGlobalSSHInstanceResponse)
                this.invoke(request, DescribeGlobalSSHInstanceResponse.class);
    }

    /**
     * DescribePathXLineConfig - 获取全球加速线路信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribePathXLineConfigResponse describePathXLineConfig(
            DescribePathXLineConfigRequest request) throws UCloudException {
        request.setAction("DescribePathXLineConfig");
        return (DescribePathXLineConfigResponse)
                this.invoke(request, DescribePathXLineConfigResponse.class);
    }

    /**
     * DescribePathXSSL - 获取SSL证书信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribePathXSSLResponse describePathXSSL(DescribePathXSSLRequest request)
            throws UCloudException {
        request.setAction("DescribePathXSSL");
        return (DescribePathXSSLResponse) this.invoke(request, DescribePathXSSLResponse.class);
    }

    /**
     * DescribeUGAInstance - 获取全球加速服务加速配置信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUGAInstanceResponse describeUGAInstance(DescribeUGAInstanceRequest request)
            throws UCloudException {
        request.setAction("DescribeUGAInstance");
        return (DescribeUGAInstanceResponse)
                this.invoke(request, DescribeUGAInstanceResponse.class);
    }

    /**
     * DescribeUPath - 获取加速线路信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPathResponse describeUPath(DescribeUPathRequest request)
            throws UCloudException {
        request.setAction("DescribeUPath");
        return (DescribeUPathResponse) this.invoke(request, DescribeUPathResponse.class);
    }

    /**
     * DescribeUPathTemplate - 查询UPath的监控模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPathTemplateResponse describeUPathTemplate(DescribeUPathTemplateRequest request)
            throws UCloudException {
        request.setAction("DescribeUPathTemplate");
        return (DescribeUPathTemplateResponse)
                this.invoke(request, DescribeUPathTemplateResponse.class);
    }

    /**
     * GetGlobalSSHPrice - 获取GlobalSSH价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetGlobalSSHPriceResponse getGlobalSSHPrice(GetGlobalSSHPriceRequest request)
            throws UCloudException {
        request.setAction("GetGlobalSSHPrice");
        return (GetGlobalSSHPriceResponse) this.invoke(request, GetGlobalSSHPriceResponse.class);
    }

    /**
     * GetGlobalSSHUpdatePrice - 获取GlobalSSH升级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetGlobalSSHUpdatePriceResponse getGlobalSSHUpdatePrice(
            GetGlobalSSHUpdatePriceRequest request) throws UCloudException {
        request.setAction("GetGlobalSSHUpdatePrice");
        return (GetGlobalSSHUpdatePriceResponse)
                this.invoke(request, GetGlobalSSHUpdatePriceResponse.class);
    }

    /**
     * GetPathXMetric - 获取全球加速监控信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetPathXMetricResponse getPathXMetric(GetPathXMetricRequest request)
            throws UCloudException {
        request.setAction("GetPathXMetric");
        return (GetPathXMetricResponse) this.invoke(request, GetPathXMetricResponse.class);
    }

    /**
     * ModifyGlobalSSHPort - 修改GlobalSSH端口
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyGlobalSSHPortResponse modifyGlobalSSHPort(ModifyGlobalSSHPortRequest request)
            throws UCloudException {
        request.setAction("ModifyGlobalSSHPort");
        return (ModifyGlobalSSHPortResponse)
                this.invoke(request, ModifyGlobalSSHPortResponse.class);
    }

    /**
     * ModifyGlobalSSHRemark - 修改GlobalSSH备注
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyGlobalSSHRemarkResponse modifyGlobalSSHRemark(ModifyGlobalSSHRemarkRequest request)
            throws UCloudException {
        request.setAction("ModifyGlobalSSHRemark");
        return (ModifyGlobalSSHRemarkResponse)
                this.invoke(request, ModifyGlobalSSHRemarkResponse.class);
    }

    /**
     * ModifyGlobalSSHType - 修改GlobalSSH实例类型
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyGlobalSSHTypeResponse modifyGlobalSSHType(ModifyGlobalSSHTypeRequest request)
            throws UCloudException {
        request.setAction("ModifyGlobalSSHType");
        return (ModifyGlobalSSHTypeResponse)
                this.invoke(request, ModifyGlobalSSHTypeResponse.class);
    }

    /**
     * ModifyUPathBandwidth - 修改加速线路带宽
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUPathBandwidthResponse modifyUPathBandwidth(ModifyUPathBandwidthRequest request)
            throws UCloudException {
        request.setAction("ModifyUPathBandwidth");
        return (ModifyUPathBandwidthResponse)
                this.invoke(request, ModifyUPathBandwidthResponse.class);
    }

    /**
     * ModifyUPathTemplate - 修改UPath监控告警项
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUPathTemplateResponse modifyUPathTemplate(ModifyUPathTemplateRequest request)
            throws UCloudException {
        request.setAction("ModifyUPathTemplate");
        return (ModifyUPathTemplateResponse)
                this.invoke(request, ModifyUPathTemplateResponse.class);
    }

    /**
     * UGABindUPath - UGA绑定UPath
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UGABindUPathResponse ugaBindUPath(UGABindUPathRequest request) throws UCloudException {
        request.setAction("UGABindUPath");
        return (UGABindUPathResponse) this.invoke(request, UGABindUPathResponse.class);
    }

    /**
     * UGAUnBindUPath - UGA与UPath解绑
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UGAUnBindUPathResponse ugaUnBindUPath(UGAUnBindUPathRequest request)
            throws UCloudException {
        request.setAction("UGAUnBindUPath");
        return (UGAUnBindUPathResponse) this.invoke(request, UGAUnBindUPathResponse.class);
    }

    /**
     * UnBindPathXSSL - 解绑PathX SSL 证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnBindPathXSSLResponse unBindPathXSSL(UnBindPathXSSLRequest request)
            throws UCloudException {
        request.setAction("UnBindPathXSSL");
        return (UnBindPathXSSLResponse) this.invoke(request, UnBindPathXSSLResponse.class);
    }

    /**
     * UpdatePathXWhitelist - 更新入口白名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdatePathXWhitelistResponse updatePathXWhitelist(UpdatePathXWhitelistRequest request)
            throws UCloudException {
        request.setAction("UpdatePathXWhitelist");
        return (UpdatePathXWhitelistResponse)
                this.invoke(request, UpdatePathXWhitelistResponse.class);
    }
}
