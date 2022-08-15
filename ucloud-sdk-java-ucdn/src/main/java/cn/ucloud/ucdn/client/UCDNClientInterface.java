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
package cn.ucloud.ucdn.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ucdn.models.AddCertificateRequest;
import cn.ucloud.ucdn.models.AddCertificateResponse;
import cn.ucloud.ucdn.models.ControlUcdnDomainCacheAccessRequest;
import cn.ucloud.ucdn.models.ControlUcdnDomainCacheAccessResponse;
import cn.ucloud.ucdn.models.DeleteCertificateRequest;
import cn.ucloud.ucdn.models.DeleteCertificateResponse;
import cn.ucloud.ucdn.models.DescribeNewUcdnPrefetchCacheTaskRequest;
import cn.ucloud.ucdn.models.DescribeNewUcdnPrefetchCacheTaskResponse;
import cn.ucloud.ucdn.models.DescribeNewUcdnRefreshCacheTaskRequest;
import cn.ucloud.ucdn.models.DescribeNewUcdnRefreshCacheTaskResponse;
import cn.ucloud.ucdn.models.GetCertificateV2Request;
import cn.ucloud.ucdn.models.GetCertificateV2Response;
import cn.ucloud.ucdn.models.GetNewUcdnDomainHitRateRequest;
import cn.ucloud.ucdn.models.GetNewUcdnDomainHitRateResponse;
import cn.ucloud.ucdn.models.GetNewUcdnLogRefererStatisticsRequest;
import cn.ucloud.ucdn.models.GetNewUcdnLogRefererStatisticsResponse;
import cn.ucloud.ucdn.models.GetNewUcdnLogUrlStatisticsRequest;
import cn.ucloud.ucdn.models.GetNewUcdnLogUrlStatisticsResponse;
import cn.ucloud.ucdn.models.GetUcdnDomain95BandwidthV2Request;
import cn.ucloud.ucdn.models.GetUcdnDomain95BandwidthV2Response;
import cn.ucloud.ucdn.models.GetUcdnDomainBandwidthV2Request;
import cn.ucloud.ucdn.models.GetUcdnDomainBandwidthV2Response;
import cn.ucloud.ucdn.models.GetUcdnDomainConfigRequest;
import cn.ucloud.ucdn.models.GetUcdnDomainConfigResponse;
import cn.ucloud.ucdn.models.GetUcdnDomainHitRateRequest;
import cn.ucloud.ucdn.models.GetUcdnDomainHitRateResponse;
import cn.ucloud.ucdn.models.GetUcdnDomainHttpCodeV2Request;
import cn.ucloud.ucdn.models.GetUcdnDomainHttpCodeV2Response;
import cn.ucloud.ucdn.models.GetUcdnDomainInfoListRequest;
import cn.ucloud.ucdn.models.GetUcdnDomainInfoListResponse;
import cn.ucloud.ucdn.models.GetUcdnDomainLogV2Request;
import cn.ucloud.ucdn.models.GetUcdnDomainLogV2Response;
import cn.ucloud.ucdn.models.GetUcdnDomainOriginHttpCodeDetailRequest;
import cn.ucloud.ucdn.models.GetUcdnDomainOriginHttpCodeDetailResponse;
import cn.ucloud.ucdn.models.GetUcdnDomainOriginHttpCodeRequest;
import cn.ucloud.ucdn.models.GetUcdnDomainOriginHttpCodeResponse;
import cn.ucloud.ucdn.models.GetUcdnDomainOriginRequestNumRequest;
import cn.ucloud.ucdn.models.GetUcdnDomainOriginRequestNumResponse;
import cn.ucloud.ucdn.models.GetUcdnDomainPrefetchEnableRequest;
import cn.ucloud.ucdn.models.GetUcdnDomainPrefetchEnableResponse;
import cn.ucloud.ucdn.models.GetUcdnDomainRequestNumV3Request;
import cn.ucloud.ucdn.models.GetUcdnDomainRequestNumV3Response;
import cn.ucloud.ucdn.models.GetUcdnPassBandwidthV2Request;
import cn.ucloud.ucdn.models.GetUcdnPassBandwidthV2Response;
import cn.ucloud.ucdn.models.GetUcdnProIspBandwidthV2Request;
import cn.ucloud.ucdn.models.GetUcdnProIspBandwidthV2Response;
import cn.ucloud.ucdn.models.GetUcdnProIspRequestNumV2Request;
import cn.ucloud.ucdn.models.GetUcdnProIspRequestNumV2Response;
import cn.ucloud.ucdn.models.GetUcdnTrafficV2Request;
import cn.ucloud.ucdn.models.GetUcdnTrafficV2Response;
import cn.ucloud.ucdn.models.PrefetchNewUcdnDomainCacheRequest;
import cn.ucloud.ucdn.models.PrefetchNewUcdnDomainCacheResponse;
import cn.ucloud.ucdn.models.QueryIpLocationRequest;
import cn.ucloud.ucdn.models.QueryIpLocationResponse;
import cn.ucloud.ucdn.models.RefreshNewUcdnDomainCacheRequest;
import cn.ucloud.ucdn.models.RefreshNewUcdnDomainCacheResponse;
import cn.ucloud.ucdn.models.SwitchUcdnChargeTypeRequest;
import cn.ucloud.ucdn.models.SwitchUcdnChargeTypeResponse;
import cn.ucloud.ucdn.models.UpdateUcdnDomainStatusRequest;
import cn.ucloud.ucdn.models.UpdateUcdnDomainStatusResponse;

/** This client is used to call actions of **UCDN** service */
public interface UCDNClientInterface extends Client {

    /**
     * AddCertificate - 添加证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddCertificateResponse addCertificate(AddCertificateRequest request)
            throws UCloudException;

    /**
     * ControlUcdnDomainCacheAccess - 封禁解封缓存访问
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ControlUcdnDomainCacheAccessResponse controlUcdnDomainCacheAccess(
            ControlUcdnDomainCacheAccessRequest request) throws UCloudException;

    /**
     * DeleteCertificate - 删除证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request)
            throws UCloudException;

    /**
     * DescribeNewUcdnPrefetchCacheTask - 获取预取任务状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeNewUcdnPrefetchCacheTaskResponse describeNewUcdnPrefetchCacheTask(
            DescribeNewUcdnPrefetchCacheTaskRequest request) throws UCloudException;

    /**
     * DescribeNewUcdnRefreshCacheTask - 获取域名刷新任务状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeNewUcdnRefreshCacheTaskResponse describeNewUcdnRefreshCacheTask(
            DescribeNewUcdnRefreshCacheTaskRequest request) throws UCloudException;

    /**
     * GetCertificateV2 - 获取证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCertificateV2Response getCertificateV2(GetCertificateV2Request request)
            throws UCloudException;

    /**
     * GetNewUcdnDomainHitRate - 获取域名命中率
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetNewUcdnDomainHitRateResponse getNewUcdnDomainHitRate(
            GetNewUcdnDomainHitRateRequest request) throws UCloudException;

    /**
     * GetNewUcdnLogRefererStatistics - 获取热点referer统计
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetNewUcdnLogRefererStatisticsResponse getNewUcdnLogRefererStatistics(
            GetNewUcdnLogRefererStatisticsRequest request) throws UCloudException;

    /**
     * GetNewUcdnLogUrlStatistics - 获取日志url统计
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetNewUcdnLogUrlStatisticsResponse getNewUcdnLogUrlStatistics(
            GetNewUcdnLogUrlStatisticsRequest request) throws UCloudException;

    /**
     * GetUcdnDomain95BandwidthV2 - 获取域名九五峰值带宽数据【新】
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomain95BandwidthV2Response getUcdnDomain95BandwidthV2(
            GetUcdnDomain95BandwidthV2Request request) throws UCloudException;

    /**
     * GetUcdnDomainBandwidthV2 - 获取域名带宽数据【新】
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomainBandwidthV2Response getUcdnDomainBandwidthV2(
            GetUcdnDomainBandwidthV2Request request) throws UCloudException;

    /**
     * GetUcdnDomainConfig - 批量获取加速域名配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomainConfigResponse getUcdnDomainConfig(GetUcdnDomainConfigRequest request)
            throws UCloudException;

    /**
     * GetUcdnDomainHitRate - 获取域名命中率(新）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomainHitRateResponse getUcdnDomainHitRate(GetUcdnDomainHitRateRequest request)
            throws UCloudException;

    /**
     * GetUcdnDomainHttpCodeV2 - 获取域名状态码信息【新】
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomainHttpCodeV2Response getUcdnDomainHttpCodeV2(
            GetUcdnDomainHttpCodeV2Request request) throws UCloudException;

    /**
     * GetUcdnDomainInfoList - 获取域名基本信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomainInfoListResponse getUcdnDomainInfoList(GetUcdnDomainInfoListRequest request)
            throws UCloudException;

    /**
     * GetUcdnDomainLogV2 - 获取域名5分钟日志
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomainLogV2Response getUcdnDomainLogV2(GetUcdnDomainLogV2Request request)
            throws UCloudException;

    /**
     * GetUcdnDomainOriginHttpCode - 获取域名源站状态码监控
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomainOriginHttpCodeResponse getUcdnDomainOriginHttpCode(
            GetUcdnDomainOriginHttpCodeRequest request) throws UCloudException;

    /**
     * GetUcdnDomainOriginHttpCodeDetail - 获取域名源站详细状态码监控
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomainOriginHttpCodeDetailResponse getUcdnDomainOriginHttpCodeDetail(
            GetUcdnDomainOriginHttpCodeDetailRequest request) throws UCloudException;

    /**
     * GetUcdnDomainOriginRequestNum - 获取域名回源请求数【新】
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomainOriginRequestNumResponse getUcdnDomainOriginRequestNum(
            GetUcdnDomainOriginRequestNumRequest request) throws UCloudException;

    /**
     * GetUcdnDomainPrefetchEnable - 获取域名预取开启状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomainPrefetchEnableResponse getUcdnDomainPrefetchEnable(
            GetUcdnDomainPrefetchEnableRequest request) throws UCloudException;

    /**
     * GetUcdnDomainRequestNumV3 - 获取域名请求数【新】
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnDomainRequestNumV3Response getUcdnDomainRequestNumV3(
            GetUcdnDomainRequestNumV3Request request) throws UCloudException;

    /**
     * GetUcdnPassBandwidthV2 - 获取回源带宽数据（按时间分类）【新】
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnPassBandwidthV2Response getUcdnPassBandwidthV2(
            GetUcdnPassBandwidthV2Request request) throws UCloudException;

    /**
     * GetUcdnProIspBandwidthV2 - 按省份运营商获取域名带宽数据【新】
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnProIspBandwidthV2Response getUcdnProIspBandwidthV2(
            GetUcdnProIspBandwidthV2Request request) throws UCloudException;

    /**
     * GetUcdnProIspRequestNumV2 - 按省份运营商获取域名请求数【新】
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnProIspRequestNumV2Response getUcdnProIspRequestNumV2(
            GetUcdnProIspRequestNumV2Request request) throws UCloudException;

    /**
     * GetUcdnTrafficV2 - 获取账户总流量信息【新】
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUcdnTrafficV2Response getUcdnTrafficV2(GetUcdnTrafficV2Request request)
            throws UCloudException;

    /**
     * PrefetchNewUcdnDomainCache - 提交预取任务
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public PrefetchNewUcdnDomainCacheResponse prefetchNewUcdnDomainCache(
            PrefetchNewUcdnDomainCacheRequest request) throws UCloudException;

    /**
     * QueryIpLocation - 查询IP信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryIpLocationResponse queryIpLocation(QueryIpLocationRequest request)
            throws UCloudException;

    /**
     * RefreshNewUcdnDomainCache - 刷新缓存
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RefreshNewUcdnDomainCacheResponse refreshNewUcdnDomainCache(
            RefreshNewUcdnDomainCacheRequest request) throws UCloudException;

    /**
     * SwitchUcdnChargeType - 切换账号计费方式
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SwitchUcdnChargeTypeResponse switchUcdnChargeType(SwitchUcdnChargeTypeRequest request)
            throws UCloudException;

    /**
     * UpdateUcdnDomainStatus - 更新加速域名状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUcdnDomainStatusResponse updateUcdnDomainStatus(
            UpdateUcdnDomainStatusRequest request) throws UCloudException;
}
