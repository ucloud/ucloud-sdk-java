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
package cn.ucloud.ucdn.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
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
        
        
        
import cn.ucloud.ucdn.models.GetAuthConfigRequest;
import cn.ucloud.ucdn.models.GetAuthConfigResponse;
        
        
        
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
        
        
        
import cn.ucloud.ucdn.models.GetUcdnDomainBandwidthByIpProtocolRequest;
import cn.ucloud.ucdn.models.GetUcdnDomainBandwidthByIpProtocolResponse;
        
        
        
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

/**
 * This client is used to call actions of **UCDN** service
 */
public class UCDNClient extends DefaultClient implements UCDNClientInterface {
    public UCDNClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * AddCertificate - 添加证书
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public AddCertificateResponse addCertificate(AddCertificateRequest request) throws UCloudException {
            request.setAction("AddCertificate");
            return (AddCertificateResponse) this.invoke(request, AddCertificateResponse.class);
        }
        
        
        
        
        
        
        /**
         * ControlUcdnDomainCacheAccess - 封禁解封缓存访问
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ControlUcdnDomainCacheAccessResponse controlUcdnDomainCacheAccess(ControlUcdnDomainCacheAccessRequest request) throws UCloudException {
            request.setAction("ControlUcdnDomainCacheAccess");
            return (ControlUcdnDomainCacheAccessResponse) this.invoke(request, ControlUcdnDomainCacheAccessResponse.class);
        }
        
        
        
        
        
        
        /**
         * DeleteCertificate - 删除证书
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) throws UCloudException {
            request.setAction("DeleteCertificate");
            return (DeleteCertificateResponse) this.invoke(request, DeleteCertificateResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeNewUcdnPrefetchCacheTask - 获取预取任务状态
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeNewUcdnPrefetchCacheTaskResponse describeNewUcdnPrefetchCacheTask(DescribeNewUcdnPrefetchCacheTaskRequest request) throws UCloudException {
            request.setAction("DescribeNewUcdnPrefetchCacheTask");
            return (DescribeNewUcdnPrefetchCacheTaskResponse) this.invoke(request, DescribeNewUcdnPrefetchCacheTaskResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeNewUcdnRefreshCacheTask - 获取域名刷新任务状态
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeNewUcdnRefreshCacheTaskResponse describeNewUcdnRefreshCacheTask(DescribeNewUcdnRefreshCacheTaskRequest request) throws UCloudException {
            request.setAction("DescribeNewUcdnRefreshCacheTask");
            return (DescribeNewUcdnRefreshCacheTaskResponse) this.invoke(request, DescribeNewUcdnRefreshCacheTaskResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetAuthConfig - 接口获取鉴权信息(非标使用)
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetAuthConfigResponse getAuthConfig(GetAuthConfigRequest request) throws UCloudException {
            request.setAction("GetAuthConfig");
            return (GetAuthConfigResponse) this.invoke(request, GetAuthConfigResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetCertificateV2 - 获取证书
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetCertificateV2Response getCertificateV2(GetCertificateV2Request request) throws UCloudException {
            request.setAction("GetCertificateV2");
            return (GetCertificateV2Response) this.invoke(request, GetCertificateV2Response.class);
        }
        
        
        
        
        
        
        /**
         * GetNewUcdnDomainHitRate - 获取域名命中率
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetNewUcdnDomainHitRateResponse getNewUcdnDomainHitRate(GetNewUcdnDomainHitRateRequest request) throws UCloudException {
            request.setAction("GetNewUcdnDomainHitRate");
            return (GetNewUcdnDomainHitRateResponse) this.invoke(request, GetNewUcdnDomainHitRateResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetNewUcdnLogRefererStatistics - 获取热点referer统计
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetNewUcdnLogRefererStatisticsResponse getNewUcdnLogRefererStatistics(GetNewUcdnLogRefererStatisticsRequest request) throws UCloudException {
            request.setAction("GetNewUcdnLogRefererStatistics");
            return (GetNewUcdnLogRefererStatisticsResponse) this.invoke(request, GetNewUcdnLogRefererStatisticsResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetNewUcdnLogUrlStatistics - 获取日志url统计
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetNewUcdnLogUrlStatisticsResponse getNewUcdnLogUrlStatistics(GetNewUcdnLogUrlStatisticsRequest request) throws UCloudException {
            request.setAction("GetNewUcdnLogUrlStatistics");
            return (GetNewUcdnLogUrlStatisticsResponse) this.invoke(request, GetNewUcdnLogUrlStatisticsResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnDomain95BandwidthV2 - 获取域名九五峰值带宽数据【新】
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnDomain95BandwidthV2Response getUcdnDomain95BandwidthV2(GetUcdnDomain95BandwidthV2Request request) throws UCloudException {
            request.setAction("GetUcdnDomain95BandwidthV2");
            return (GetUcdnDomain95BandwidthV2Response) this.invoke(request, GetUcdnDomain95BandwidthV2Response.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnDomainBandwidthByIpProtocol - 获取域名带宽数据按ip协议【新】
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnDomainBandwidthByIpProtocolResponse getUcdnDomainBandwidthByIpProtocol(GetUcdnDomainBandwidthByIpProtocolRequest request) throws UCloudException {
            request.setAction("GetUcdnDomainBandwidthByIpProtocol");
            return (GetUcdnDomainBandwidthByIpProtocolResponse) this.invoke(request, GetUcdnDomainBandwidthByIpProtocolResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnDomainBandwidthV2 - 获取域名带宽数据【新】
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnDomainBandwidthV2Response getUcdnDomainBandwidthV2(GetUcdnDomainBandwidthV2Request request) throws UCloudException {
            request.setAction("GetUcdnDomainBandwidthV2");
            return (GetUcdnDomainBandwidthV2Response) this.invoke(request, GetUcdnDomainBandwidthV2Response.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnDomainConfig - 批量获取加速域名配置
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnDomainConfigResponse getUcdnDomainConfig(GetUcdnDomainConfigRequest request) throws UCloudException {
            request.setAction("GetUcdnDomainConfig");
            return (GetUcdnDomainConfigResponse) this.invoke(request, GetUcdnDomainConfigResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnDomainHitRate - 获取域名命中率(新）
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnDomainHitRateResponse getUcdnDomainHitRate(GetUcdnDomainHitRateRequest request) throws UCloudException {
            request.setAction("GetUcdnDomainHitRate");
            return (GetUcdnDomainHitRateResponse) this.invoke(request, GetUcdnDomainHitRateResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnDomainHttpCodeV2 - 获取域名状态码信息【新】
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnDomainHttpCodeV2Response getUcdnDomainHttpCodeV2(GetUcdnDomainHttpCodeV2Request request) throws UCloudException {
            request.setAction("GetUcdnDomainHttpCodeV2");
            return (GetUcdnDomainHttpCodeV2Response) this.invoke(request, GetUcdnDomainHttpCodeV2Response.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnDomainInfoList - 获取域名基本信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnDomainInfoListResponse getUcdnDomainInfoList(GetUcdnDomainInfoListRequest request) throws UCloudException {
            request.setAction("GetUcdnDomainInfoList");
            return (GetUcdnDomainInfoListResponse) this.invoke(request, GetUcdnDomainInfoListResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnDomainLogV2 - 获取域名5分钟日志
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnDomainLogV2Response getUcdnDomainLogV2(GetUcdnDomainLogV2Request request) throws UCloudException {
            request.setAction("GetUcdnDomainLogV2");
            return (GetUcdnDomainLogV2Response) this.invoke(request, GetUcdnDomainLogV2Response.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnDomainOriginRequestNum - 获取域名回源请求数【新】
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnDomainOriginRequestNumResponse getUcdnDomainOriginRequestNum(GetUcdnDomainOriginRequestNumRequest request) throws UCloudException {
            request.setAction("GetUcdnDomainOriginRequestNum");
            return (GetUcdnDomainOriginRequestNumResponse) this.invoke(request, GetUcdnDomainOriginRequestNumResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnDomainPrefetchEnable - 获取域名预取开启状态
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnDomainPrefetchEnableResponse getUcdnDomainPrefetchEnable(GetUcdnDomainPrefetchEnableRequest request) throws UCloudException {
            request.setAction("GetUcdnDomainPrefetchEnable");
            return (GetUcdnDomainPrefetchEnableResponse) this.invoke(request, GetUcdnDomainPrefetchEnableResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnDomainRequestNumV3 - 获取域名请求数【新】
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnDomainRequestNumV3Response getUcdnDomainRequestNumV3(GetUcdnDomainRequestNumV3Request request) throws UCloudException {
            request.setAction("GetUcdnDomainRequestNumV3");
            return (GetUcdnDomainRequestNumV3Response) this.invoke(request, GetUcdnDomainRequestNumV3Response.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnPassBandwidthV2 - 获取回源带宽数据（按时间分类）【新】
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnPassBandwidthV2Response getUcdnPassBandwidthV2(GetUcdnPassBandwidthV2Request request) throws UCloudException {
            request.setAction("GetUcdnPassBandwidthV2");
            return (GetUcdnPassBandwidthV2Response) this.invoke(request, GetUcdnPassBandwidthV2Response.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnProIspBandwidthV2 - 按省份运营商获取域名带宽数据【新】
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnProIspBandwidthV2Response getUcdnProIspBandwidthV2(GetUcdnProIspBandwidthV2Request request) throws UCloudException {
            request.setAction("GetUcdnProIspBandwidthV2");
            return (GetUcdnProIspBandwidthV2Response) this.invoke(request, GetUcdnProIspBandwidthV2Response.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnProIspRequestNumV2 - 按省份运营商获取域名请求数【新】
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnProIspRequestNumV2Response getUcdnProIspRequestNumV2(GetUcdnProIspRequestNumV2Request request) throws UCloudException {
            request.setAction("GetUcdnProIspRequestNumV2");
            return (GetUcdnProIspRequestNumV2Response) this.invoke(request, GetUcdnProIspRequestNumV2Response.class);
        }
        
        
        
        
        
        
        /**
         * GetUcdnTrafficV2 - 获取账户总流量信息【新】
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUcdnTrafficV2Response getUcdnTrafficV2(GetUcdnTrafficV2Request request) throws UCloudException {
            request.setAction("GetUcdnTrafficV2");
            return (GetUcdnTrafficV2Response) this.invoke(request, GetUcdnTrafficV2Response.class);
        }
        
        
        
        
        
        
        /**
         * PrefetchNewUcdnDomainCache - 提交预取任务
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public PrefetchNewUcdnDomainCacheResponse prefetchNewUcdnDomainCache(PrefetchNewUcdnDomainCacheRequest request) throws UCloudException {
            request.setAction("PrefetchNewUcdnDomainCache");
            return (PrefetchNewUcdnDomainCacheResponse) this.invoke(request, PrefetchNewUcdnDomainCacheResponse.class);
        }
        
        
        
        
        
        
        /**
         * QueryIpLocation - 查询IP信息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public QueryIpLocationResponse queryIpLocation(QueryIpLocationRequest request) throws UCloudException {
            request.setAction("QueryIpLocation");
            return (QueryIpLocationResponse) this.invoke(request, QueryIpLocationResponse.class);
        }
        
        
        
        
        
        
        /**
         * RefreshNewUcdnDomainCache - 刷新缓存
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public RefreshNewUcdnDomainCacheResponse refreshNewUcdnDomainCache(RefreshNewUcdnDomainCacheRequest request) throws UCloudException {
            request.setAction("RefreshNewUcdnDomainCache");
            return (RefreshNewUcdnDomainCacheResponse) this.invoke(request, RefreshNewUcdnDomainCacheResponse.class);
        }
        
        
        
        
        
        
        /**
         * SwitchUcdnChargeType - 切换账号计费方式
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public SwitchUcdnChargeTypeResponse switchUcdnChargeType(SwitchUcdnChargeTypeRequest request) throws UCloudException {
            request.setAction("SwitchUcdnChargeType");
            return (SwitchUcdnChargeTypeResponse) this.invoke(request, SwitchUcdnChargeTypeResponse.class);
        }
        
        
        
        
        
        
        /**
         * UpdateUcdnDomainStatus - 更新加速域名状态
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public UpdateUcdnDomainStatusResponse updateUcdnDomainStatus(UpdateUcdnDomainStatusRequest request) throws UCloudException {
            request.setAction("UpdateUcdnDomainStatus");
            return (UpdateUcdnDomainStatusResponse) this.invoke(request, UpdateUcdnDomainStatusResponse.class);
        }
}
