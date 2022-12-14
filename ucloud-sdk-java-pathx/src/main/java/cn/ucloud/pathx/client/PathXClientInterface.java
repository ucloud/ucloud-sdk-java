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
package cn.ucloud.pathx.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
        
        
        
import cn.ucloud.pathx.models.BindPathXSSLRequest;
import cn.ucloud.pathx.models.BindPathXSSLResponse;
        
        
        
import cn.ucloud.pathx.models.CreateGlobalSSHInstanceRequest;
import cn.ucloud.pathx.models.CreateGlobalSSHInstanceResponse;
        
        
        
import cn.ucloud.pathx.models.CreatePathXSSLRequest;
import cn.ucloud.pathx.models.CreatePathXSSLResponse;
        
        
        
import cn.ucloud.pathx.models.CreateUGA3InstanceRequest;
import cn.ucloud.pathx.models.CreateUGA3InstanceResponse;
        
        
        
import cn.ucloud.pathx.models.CreateUGA3PortRequest;
import cn.ucloud.pathx.models.CreateUGA3PortResponse;
        
        
        
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
        
        
        
import cn.ucloud.pathx.models.DeleteUGA3InstanceRequest;
import cn.ucloud.pathx.models.DeleteUGA3InstanceResponse;
        
        
        
import cn.ucloud.pathx.models.DeleteUGA3PortRequest;
import cn.ucloud.pathx.models.DeleteUGA3PortResponse;
        
        
        
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
        
        
        
import cn.ucloud.pathx.models.DescribeUGA3AreaRequest;
import cn.ucloud.pathx.models.DescribeUGA3AreaResponse;
        
        
        
import cn.ucloud.pathx.models.DescribeUGA3InstanceRequest;
import cn.ucloud.pathx.models.DescribeUGA3InstanceResponse;
        
        
        
import cn.ucloud.pathx.models.DescribeUGA3OptimizationRequest;
import cn.ucloud.pathx.models.DescribeUGA3OptimizationResponse;
        
        
        
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
        
        
        
import cn.ucloud.pathx.models.GetUGA3MetricRequest;
import cn.ucloud.pathx.models.GetUGA3MetricResponse;
        
        
        
import cn.ucloud.pathx.models.GetUGA3PriceRequest;
import cn.ucloud.pathx.models.GetUGA3PriceResponse;
        
        
        
import cn.ucloud.pathx.models.GetUGA3UpdatePriceRequest;
import cn.ucloud.pathx.models.GetUGA3UpdatePriceResponse;
        
        
        
import cn.ucloud.pathx.models.ModifyGlobalSSHPortRequest;
import cn.ucloud.pathx.models.ModifyGlobalSSHPortResponse;
        
        
        
import cn.ucloud.pathx.models.ModifyGlobalSSHRemarkRequest;
import cn.ucloud.pathx.models.ModifyGlobalSSHRemarkResponse;
        
        
        
import cn.ucloud.pathx.models.ModifyGlobalSSHTypeRequest;
import cn.ucloud.pathx.models.ModifyGlobalSSHTypeResponse;
        
        
        
import cn.ucloud.pathx.models.ModifyUGA3BandwidthRequest;
import cn.ucloud.pathx.models.ModifyUGA3BandwidthResponse;
        
        
        
import cn.ucloud.pathx.models.ModifyUGA3InstanceRequest;
import cn.ucloud.pathx.models.ModifyUGA3InstanceResponse;
        
        
        
import cn.ucloud.pathx.models.ModifyUGA3OriginInfoRequest;
import cn.ucloud.pathx.models.ModifyUGA3OriginInfoResponse;
        
        
        
import cn.ucloud.pathx.models.ModifyUGA3PortRequest;
import cn.ucloud.pathx.models.ModifyUGA3PortResponse;
        
        
        
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

/**
 * This client is used to call actions of **PathX** service
 */
public interface PathXClientInterface extends Client {
        
        
        
        
        
        
    /**
     * BindPathXSSL - 绑定PathX SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindPathXSSLResponse bindPathXSSL(BindPathXSSLRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateGlobalSSHInstance - 创建GlobalSSH实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateGlobalSSHInstanceResponse createGlobalSSHInstance(CreateGlobalSSHInstanceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreatePathXSSL - 创建证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreatePathXSSLResponse createPathXSSL(CreatePathXSSLRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUGA3Instance - 创建全球统一接入加速配置项
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUGA3InstanceResponse createUGA3Instance(CreateUGA3InstanceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUGA3Port - 创建统一接入加速实例端口
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUGA3PortResponse createUGA3Port(CreateUGA3PortRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUGAForwarder - 创建加速实例转发器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUGAForwarderResponse createUGAForwarder(CreateUGAForwarderRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUGAInstance - 创建全球加速配置项
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUGAInstanceResponse createUGAInstance(CreateUGAInstanceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUPath - 创建UPath
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUPathResponse createUPath(CreateUPathRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteGlobalSSHInstance - 删除GlobalSSH实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteGlobalSSHInstanceResponse deleteGlobalSSHInstance(DeleteGlobalSSHInstanceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeletePathXSSL - 删除PathX SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeletePathXSSLResponse deletePathXSSL(DeletePathXSSLRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteUGA3Instance - 删除全球统一接入转发实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUGA3InstanceResponse deleteUGA3Instance(DeleteUGA3InstanceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteUGA3Port - 删除统一接入加速实例转发器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUGA3PortResponse deleteUGA3Port(DeleteUGA3PortRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteUGAForwarder - 删除加速实例转发器
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUGAForwarderResponse deleteUGAForwarder(DeleteUGAForwarderRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteUGAInstance - 删除全球加速服务加速配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUGAInstanceResponse deleteUGAInstance(DeleteUGAInstanceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteUPath - 删除UPath
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUPathResponse deleteUPath(DeleteUPathRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeGlobalSSHInstance - 获取GlobalSSH实例列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeGlobalSSHInstanceResponse describeGlobalSSHInstance(DescribeGlobalSSHInstanceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribePathXLineConfig - 获取全球加速线路信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribePathXLineConfigResponse describePathXLineConfig(DescribePathXLineConfigRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribePathXSSL - 获取SSL证书信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribePathXSSLResponse describePathXSSL(DescribePathXSSLRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUGA3Area - 获取全球接入源站可选列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUGA3AreaResponse describeUGA3Area(DescribeUGA3AreaRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUGA3Instance - 获取全球统一接入加速服务加速配置信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUGA3InstanceResponse describeUGA3Instance(DescribeUGA3InstanceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUGA3Optimization - 获取全球接入UGA3线路加速优化情况
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUGA3OptimizationResponse describeUGA3Optimization(DescribeUGA3OptimizationRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUGAInstance - 获取全球加速服务加速配置信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUGAInstanceResponse describeUGAInstance(DescribeUGAInstanceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUPath - 获取加速线路信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPathResponse describeUPath(DescribeUPathRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUPathTemplate - 查询UPath的监控模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPathTemplateResponse describeUPathTemplate(DescribeUPathTemplateRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetGlobalSSHPrice - 获取GlobalSSH价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetGlobalSSHPriceResponse getGlobalSSHPrice(GetGlobalSSHPriceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetGlobalSSHUpdatePrice - 获取GlobalSSH升级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetGlobalSSHUpdatePriceResponse getGlobalSSHUpdatePrice(GetGlobalSSHUpdatePriceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetPathXMetric - 获取全球加速监控信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetPathXMetricResponse getPathXMetric(GetPathXMetricRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUGA3Metric - 获取全地域加速监控信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUGA3MetricResponse getUGA3Metric(GetUGA3MetricRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUGA3Price - 获取全球统一接入转发实例价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUGA3PriceResponse getUGA3Price(GetUGA3PriceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetUGA3UpdatePrice - 全球统一接入获取实例更新价格（增加、删退）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUGA3UpdatePriceResponse getUGA3UpdatePrice(GetUGA3UpdatePriceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyGlobalSSHPort - 修改GlobalSSH端口
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyGlobalSSHPortResponse modifyGlobalSSHPort(ModifyGlobalSSHPortRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyGlobalSSHRemark - 修改GlobalSSH备注
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyGlobalSSHRemarkResponse modifyGlobalSSHRemark(ModifyGlobalSSHRemarkRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyGlobalSSHType - 修改GlobalSSH实例类型
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyGlobalSSHTypeResponse modifyGlobalSSHType(ModifyGlobalSSHTypeRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyUGA3Bandwidth - 修改统一接入加速配置带宽
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUGA3BandwidthResponse modifyUGA3Bandwidth(ModifyUGA3BandwidthRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyUGA3Instance - 修改统一接入加速配置属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUGA3InstanceResponse modifyUGA3Instance(ModifyUGA3InstanceRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyUGA3OriginInfo - 修改统一接入加速配置源站信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUGA3OriginInfoResponse modifyUGA3OriginInfo(ModifyUGA3OriginInfoRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyUGA3Port - 修改统一接入加速实例端口
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUGA3PortResponse modifyUGA3Port(ModifyUGA3PortRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyUPathBandwidth - 修改加速线路带宽
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUPathBandwidthResponse modifyUPathBandwidth(ModifyUPathBandwidthRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ModifyUPathTemplate - 修改UPath监控告警项
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUPathTemplateResponse modifyUPathTemplate(ModifyUPathTemplateRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * UGABindUPath - UGA绑定UPath
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UGABindUPathResponse ugaBindUPath(UGABindUPathRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * UGAUnBindUPath - UGA与UPath解绑
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UGAUnBindUPathResponse ugaUnBindUPath(UGAUnBindUPathRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * UnBindPathXSSL - 解绑PathX SSL 证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnBindPathXSSLResponse unBindPathXSSL(UnBindPathXSSLRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * UpdatePathXWhitelist - 更新入口白名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdatePathXWhitelistResponse updatePathXWhitelist(UpdatePathXWhitelistRequest request) throws UCloudException;
}
