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

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ucdn.models.AddCertificateRequest;
import cn.ucloud.ucdn.models.AddCertificateResponse;
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
import cn.ucloud.ucdn.models.GetUcdnDomainLogRequest;
import cn.ucloud.ucdn.models.GetUcdnDomainLogResponse;
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

/** This client is used to call actions of **UCDN** service */
public class UCDNClient extends DefaultClient implements UCDNClientInterface {
    public UCDNClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * AddCertificate - 添加证书
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/AddCertificate
     */
    public AddCertificateResponse addCertificate(AddCertificateRequest request)
            throws UCloudException {
        request.setAction("AddCertificate");
        return (AddCertificateResponse) this.invoke(request, AddCertificateResponse.class);
    }

    /**
     * DeleteCertificate - 删除证书
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/DeleteCertificate
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request)
            throws UCloudException {
        request.setAction("DeleteCertificate");
        return (DeleteCertificateResponse) this.invoke(request, DeleteCertificateResponse.class);
    }

    /**
     * DescribeNewUcdnPrefetchCacheTask - 获取预取任务状态
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/DescribeNewUcdnPrefetchCacheTask
     */
    public DescribeNewUcdnPrefetchCacheTaskResponse describeNewUcdnPrefetchCacheTask(
            DescribeNewUcdnPrefetchCacheTaskRequest request) throws UCloudException {
        request.setAction("DescribeNewUcdnPrefetchCacheTask");
        return (DescribeNewUcdnPrefetchCacheTaskResponse)
                this.invoke(request, DescribeNewUcdnPrefetchCacheTaskResponse.class);
    }

    /**
     * DescribeNewUcdnRefreshCacheTask - 获取域名刷新任务状态
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/DescribeNewUcdnRefreshCacheTask
     */
    public DescribeNewUcdnRefreshCacheTaskResponse describeNewUcdnRefreshCacheTask(
            DescribeNewUcdnRefreshCacheTaskRequest request) throws UCloudException {
        request.setAction("DescribeNewUcdnRefreshCacheTask");
        return (DescribeNewUcdnRefreshCacheTaskResponse)
                this.invoke(request, DescribeNewUcdnRefreshCacheTaskResponse.class);
    }

    /**
     * GetCertificateV2 - 获取证书列表(新)
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetCertificateV2
     */
    public GetCertificateV2Response getCertificateV2(GetCertificateV2Request request)
            throws UCloudException {
        request.setAction("GetCertificateV2");
        return (GetCertificateV2Response) this.invoke(request, GetCertificateV2Response.class);
    }

    /**
     * GetNewUcdnDomainHitRate - 获取域名命中率
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetNewUcdnDomainHitRate
     */
    public GetNewUcdnDomainHitRateResponse getNewUcdnDomainHitRate(
            GetNewUcdnDomainHitRateRequest request) throws UCloudException {
        request.setAction("GetNewUcdnDomainHitRate");
        return (GetNewUcdnDomainHitRateResponse)
                this.invoke(request, GetNewUcdnDomainHitRateResponse.class);
    }

    /**
     * GetNewUcdnLogRefererStatistics - 获取热点referer统计
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetNewUcdnLogRefererStatistics
     */
    public GetNewUcdnLogRefererStatisticsResponse getNewUcdnLogRefererStatistics(
            GetNewUcdnLogRefererStatisticsRequest request) throws UCloudException {
        request.setAction("GetNewUcdnLogRefererStatistics");
        return (GetNewUcdnLogRefererStatisticsResponse)
                this.invoke(request, GetNewUcdnLogRefererStatisticsResponse.class);
    }

    /**
     * GetNewUcdnLogUrlStatistics - 获取日志url统计
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetNewUcdnLogUrlStatistics
     */
    public GetNewUcdnLogUrlStatisticsResponse getNewUcdnLogUrlStatistics(
            GetNewUcdnLogUrlStatisticsRequest request) throws UCloudException {
        request.setAction("GetNewUcdnLogUrlStatistics");
        return (GetNewUcdnLogUrlStatisticsResponse)
                this.invoke(request, GetNewUcdnLogUrlStatisticsResponse.class);
    }

    /**
     * GetUcdnDomain95BandwidthV2 - 获取域名九五峰值带宽数据
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomain95BandwidthV2
     */
    public GetUcdnDomain95BandwidthV2Response getUcdnDomain95BandwidthV2(
            GetUcdnDomain95BandwidthV2Request request) throws UCloudException {
        request.setAction("GetUcdnDomain95BandwidthV2");
        return (GetUcdnDomain95BandwidthV2Response)
                this.invoke(request, GetUcdnDomain95BandwidthV2Response.class);
    }

    /**
     * GetUcdnDomainBandwidthV2 - 获取域名带宽数据(新)
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomainBandwidthV2
     */
    public GetUcdnDomainBandwidthV2Response getUcdnDomainBandwidthV2(
            GetUcdnDomainBandwidthV2Request request) throws UCloudException {
        request.setAction("GetUcdnDomainBandwidthV2");
        return (GetUcdnDomainBandwidthV2Response)
                this.invoke(request, GetUcdnDomainBandwidthV2Response.class);
    }

    /**
     * GetUcdnDomainConfig - 批量获取加速域名配置
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomainConfig
     */
    public GetUcdnDomainConfigResponse getUcdnDomainConfig(GetUcdnDomainConfigRequest request)
            throws UCloudException {
        request.setAction("GetUcdnDomainConfig");
        return (GetUcdnDomainConfigResponse)
                this.invoke(request, GetUcdnDomainConfigResponse.class);
    }

    /**
     * GetUcdnDomainHitRate - 获取域名命中率
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomainHitRate
     */
    public GetUcdnDomainHitRateResponse getUcdnDomainHitRate(GetUcdnDomainHitRateRequest request)
            throws UCloudException {
        request.setAction("GetUcdnDomainHitRate");
        return (GetUcdnDomainHitRateResponse)
                this.invoke(request, GetUcdnDomainHitRateResponse.class);
    }

    /**
     * GetUcdnDomainHttpCodeV2 - 获取域名状态码信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomainHttpCodeV2
     */
    public GetUcdnDomainHttpCodeV2Response getUcdnDomainHttpCodeV2(
            GetUcdnDomainHttpCodeV2Request request) throws UCloudException {
        request.setAction("GetUcdnDomainHttpCodeV2");
        return (GetUcdnDomainHttpCodeV2Response)
                this.invoke(request, GetUcdnDomainHttpCodeV2Response.class);
    }

    /**
     * GetUcdnDomainInfoList - 获取域名基本信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomainInfoList
     */
    public GetUcdnDomainInfoListResponse getUcdnDomainInfoList(GetUcdnDomainInfoListRequest request)
            throws UCloudException {
        request.setAction("GetUcdnDomainInfoList");
        return (GetUcdnDomainInfoListResponse)
                this.invoke(request, GetUcdnDomainInfoListResponse.class);
    }

    /**
     * GetUcdnDomainLog - 获取加速域名原始日志
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomainLog
     */
    public GetUcdnDomainLogResponse getUcdnDomainLog(GetUcdnDomainLogRequest request)
            throws UCloudException {
        request.setAction("GetUcdnDomainLog");
        return (GetUcdnDomainLogResponse) this.invoke(request, GetUcdnDomainLogResponse.class);
    }

    /**
     * GetUcdnDomainOriginHttpCode - 获取域名源站状态码监控
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomainOriginHttpCode
     */
    public GetUcdnDomainOriginHttpCodeResponse getUcdnDomainOriginHttpCode(
            GetUcdnDomainOriginHttpCodeRequest request) throws UCloudException {
        request.setAction("GetUcdnDomainOriginHttpCode");
        return (GetUcdnDomainOriginHttpCodeResponse)
                this.invoke(request, GetUcdnDomainOriginHttpCodeResponse.class);
    }

    /**
     * GetUcdnDomainOriginHttpCodeDetail - 获取域名源站详细状态码监控
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomainOriginHttpCodeDetail
     */
    public GetUcdnDomainOriginHttpCodeDetailResponse getUcdnDomainOriginHttpCodeDetail(
            GetUcdnDomainOriginHttpCodeDetailRequest request) throws UCloudException {
        request.setAction("GetUcdnDomainOriginHttpCodeDetail");
        return (GetUcdnDomainOriginHttpCodeDetailResponse)
                this.invoke(request, GetUcdnDomainOriginHttpCodeDetailResponse.class);
    }

    /**
     * GetUcdnDomainOriginRequestNum - 获取域名回源请求数
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomainOriginRequestNum
     */
    public GetUcdnDomainOriginRequestNumResponse getUcdnDomainOriginRequestNum(
            GetUcdnDomainOriginRequestNumRequest request) throws UCloudException {
        request.setAction("GetUcdnDomainOriginRequestNum");
        return (GetUcdnDomainOriginRequestNumResponse)
                this.invoke(request, GetUcdnDomainOriginRequestNumResponse.class);
    }

    /**
     * GetUcdnDomainPrefetchEnable - 获取域名预取开启状态
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomainPrefetchEnable
     */
    public GetUcdnDomainPrefetchEnableResponse getUcdnDomainPrefetchEnable(
            GetUcdnDomainPrefetchEnableRequest request) throws UCloudException {
        request.setAction("GetUcdnDomainPrefetchEnable");
        return (GetUcdnDomainPrefetchEnableResponse)
                this.invoke(request, GetUcdnDomainPrefetchEnableResponse.class);
    }

    /**
     * GetUcdnDomainRequestNumV3 - 获取域名请求数
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnDomainRequestNumV3
     */
    public GetUcdnDomainRequestNumV3Response getUcdnDomainRequestNumV3(
            GetUcdnDomainRequestNumV3Request request) throws UCloudException {
        request.setAction("GetUcdnDomainRequestNumV3");
        return (GetUcdnDomainRequestNumV3Response)
                this.invoke(request, GetUcdnDomainRequestNumV3Response.class);
    }

    /**
     * GetUcdnPassBandwidthV2 - 获取回源带宽数据（cdn回客户源站部分）
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnPassBandwidthV2
     */
    public GetUcdnPassBandwidthV2Response getUcdnPassBandwidthV2(
            GetUcdnPassBandwidthV2Request request) throws UCloudException {
        request.setAction("GetUcdnPassBandwidthV2");
        return (GetUcdnPassBandwidthV2Response)
                this.invoke(request, GetUcdnPassBandwidthV2Response.class);
    }

    /**
     * GetUcdnProIspBandwidthV2 - 按省份运营商获取域名带宽数据
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnProIspBandwidthV2
     */
    public GetUcdnProIspBandwidthV2Response getUcdnProIspBandwidthV2(
            GetUcdnProIspBandwidthV2Request request) throws UCloudException {
        request.setAction("GetUcdnProIspBandwidthV2");
        return (GetUcdnProIspBandwidthV2Response)
                this.invoke(request, GetUcdnProIspBandwidthV2Response.class);
    }

    /**
     * GetUcdnProIspRequestNumV2 - 按省份运营商获取域名请求数
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnProIspRequestNumV2
     */
    public GetUcdnProIspRequestNumV2Response getUcdnProIspRequestNumV2(
            GetUcdnProIspRequestNumV2Request request) throws UCloudException {
        request.setAction("GetUcdnProIspRequestNumV2");
        return (GetUcdnProIspRequestNumV2Response)
                this.invoke(request, GetUcdnProIspRequestNumV2Response.class);
    }

    /**
     * GetUcdnTrafficV2 - 获取流量信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/GetUcdnTrafficV2
     */
    public GetUcdnTrafficV2Response getUcdnTrafficV2(GetUcdnTrafficV2Request request)
            throws UCloudException {
        request.setAction("GetUcdnTrafficV2");
        return (GetUcdnTrafficV2Response) this.invoke(request, GetUcdnTrafficV2Response.class);
    }

    /**
     * PrefetchNewUcdnDomainCache - 提交预取任务
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/PrefetchNewUcdnDomainCache
     */
    public PrefetchNewUcdnDomainCacheResponse prefetchNewUcdnDomainCache(
            PrefetchNewUcdnDomainCacheRequest request) throws UCloudException {
        request.setAction("PrefetchNewUcdnDomainCache");
        return (PrefetchNewUcdnDomainCacheResponse)
                this.invoke(request, PrefetchNewUcdnDomainCacheResponse.class);
    }

    /**
     * QueryIpLocation - 查询IP信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/QueryIpLocation
     */
    public QueryIpLocationResponse queryIpLocation(QueryIpLocationRequest request)
            throws UCloudException {
        request.setAction("QueryIpLocation");
        return (QueryIpLocationResponse) this.invoke(request, QueryIpLocationResponse.class);
    }

    /**
     * RefreshNewUcdnDomainCache - 刷新缓存
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/RefreshNewUcdnDomainCache
     */
    public RefreshNewUcdnDomainCacheResponse refreshNewUcdnDomainCache(
            RefreshNewUcdnDomainCacheRequest request) throws UCloudException {
        request.setAction("RefreshNewUcdnDomainCache");
        return (RefreshNewUcdnDomainCacheResponse)
                this.invoke(request, RefreshNewUcdnDomainCacheResponse.class);
    }

    /**
     * SwitchUcdnChargeType - 切换账号计费方式
     *
     * <p>See also: https://docs.ucloud.cn/api/ucdn-api/SwitchUcdnChargeType
     */
    public SwitchUcdnChargeTypeResponse switchUcdnChargeType(SwitchUcdnChargeTypeRequest request)
            throws UCloudException {
        request.setAction("SwitchUcdnChargeType");
        return (SwitchUcdnChargeTypeResponse)
                this.invoke(request, SwitchUcdnChargeTypeResponse.class);
    }
}
