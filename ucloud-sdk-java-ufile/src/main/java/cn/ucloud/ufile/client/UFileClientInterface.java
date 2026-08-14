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
package cn.ucloud.ufile.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ufile.models.AddCORSRuleRequest;
import cn.ucloud.ufile.models.AddCORSRuleResponse;
import cn.ucloud.ufile.models.AddUFileSSLCertRequest;
import cn.ucloud.ufile.models.AddUFileSSLCertResponse;
import cn.ucloud.ufile.models.BindBucketDomainRequest;
import cn.ucloud.ufile.models.BindBucketDomainResponse;
import cn.ucloud.ufile.models.BuyUFilePkgRequest;
import cn.ucloud.ufile.models.BuyUFilePkgResponse;
import cn.ucloud.ufile.models.CreateBucketRequest;
import cn.ucloud.ufile.models.CreateBucketResponse;
import cn.ucloud.ufile.models.CreateUFileLifeCycleRequest;
import cn.ucloud.ufile.models.CreateUFileLifeCycleResponse;
import cn.ucloud.ufile.models.CreateUFileTokenRequest;
import cn.ucloud.ufile.models.CreateUFileTokenResponse;
import cn.ucloud.ufile.models.CreateUdsRuleRequest;
import cn.ucloud.ufile.models.CreateUdsRuleResponse;
import cn.ucloud.ufile.models.DeleteBucketRequest;
import cn.ucloud.ufile.models.DeleteBucketResponse;
import cn.ucloud.ufile.models.DeleteCORSRuleRequest;
import cn.ucloud.ufile.models.DeleteCORSRuleResponse;
import cn.ucloud.ufile.models.DeleteUFileLifeCycleRequest;
import cn.ucloud.ufile.models.DeleteUFileLifeCycleResponse;
import cn.ucloud.ufile.models.DeleteUFilePkgRequest;
import cn.ucloud.ufile.models.DeleteUFilePkgResponse;
import cn.ucloud.ufile.models.DeleteUFileSSLCertRequest;
import cn.ucloud.ufile.models.DeleteUFileSSLCertResponse;
import cn.ucloud.ufile.models.DeleteUFileTokenRequest;
import cn.ucloud.ufile.models.DeleteUFileTokenResponse;
import cn.ucloud.ufile.models.DescribeBucketRequest;
import cn.ucloud.ufile.models.DescribeBucketResponse;
import cn.ucloud.ufile.models.DescribeCORSRuleRequest;
import cn.ucloud.ufile.models.DescribeCORSRuleResponse;
import cn.ucloud.ufile.models.DescribeUFileAvailablePkgRequest;
import cn.ucloud.ufile.models.DescribeUFileAvailablePkgResponse;
import cn.ucloud.ufile.models.DescribeUFileLifeCycleRequest;
import cn.ucloud.ufile.models.DescribeUFileLifeCycleResponse;
import cn.ucloud.ufile.models.DescribeUFilePkgRequest;
import cn.ucloud.ufile.models.DescribeUFilePkgResponse;
import cn.ucloud.ufile.models.DescribeUFilePkgUsageRequest;
import cn.ucloud.ufile.models.DescribeUFilePkgUsageResponse;
import cn.ucloud.ufile.models.DescribeUFileRefererRequest;
import cn.ucloud.ufile.models.DescribeUFileRefererResponse;
import cn.ucloud.ufile.models.DescribeUFileSSLCertRequest;
import cn.ucloud.ufile.models.DescribeUFileSSLCertResponse;
import cn.ucloud.ufile.models.DescribeUFileTokenRequest;
import cn.ucloud.ufile.models.DescribeUFileTokenResponse;
import cn.ucloud.ufile.models.DescribeUdsRuleRequest;
import cn.ucloud.ufile.models.DescribeUdsRuleResponse;
import cn.ucloud.ufile.models.GetBucketQuotaRequest;
import cn.ucloud.ufile.models.GetBucketQuotaResponse;
import cn.ucloud.ufile.models.GetBucketStaticPageRuleRequest;
import cn.ucloud.ufile.models.GetBucketStaticPageRuleResponse;
import cn.ucloud.ufile.models.GetProjectRegionQuotaRequest;
import cn.ucloud.ufile.models.GetProjectRegionQuotaResponse;
import cn.ucloud.ufile.models.GetUFileDailyBillRequest;
import cn.ucloud.ufile.models.GetUFileDailyBillResponse;
import cn.ucloud.ufile.models.GetUFileDailyReportRequest;
import cn.ucloud.ufile.models.GetUFileDailyReportResponse;
import cn.ucloud.ufile.models.GetUFileMonthlyBillRequest;
import cn.ucloud.ufile.models.GetUFileMonthlyBillResponse;
import cn.ucloud.ufile.models.GetUFilePkgPriceRequest;
import cn.ucloud.ufile.models.GetUFilePkgPriceResponse;
import cn.ucloud.ufile.models.GetUFileQuotaInfoRequest;
import cn.ucloud.ufile.models.GetUFileQuotaInfoResponse;
import cn.ucloud.ufile.models.GetUFileQuotaPriceRequest;
import cn.ucloud.ufile.models.GetUFileQuotaPriceResponse;
import cn.ucloud.ufile.models.GetUFileQuotaRequest;
import cn.ucloud.ufile.models.GetUFileQuotaResponse;
import cn.ucloud.ufile.models.GetUFileReportRequest;
import cn.ucloud.ufile.models.GetUFileReportResponse;
import cn.ucloud.ufile.models.RenewUFilePkgRequest;
import cn.ucloud.ufile.models.RenewUFilePkgResponse;
import cn.ucloud.ufile.models.SetBucketQuotaRequest;
import cn.ucloud.ufile.models.SetBucketQuotaResponse;
import cn.ucloud.ufile.models.SetProjectRegionQuotaRequest;
import cn.ucloud.ufile.models.SetProjectRegionQuotaResponse;
import cn.ucloud.ufile.models.SetUFileRefererRequest;
import cn.ucloud.ufile.models.SetUFileRefererResponse;
import cn.ucloud.ufile.models.UpdateBucketRequest;
import cn.ucloud.ufile.models.UpdateBucketResponse;
import cn.ucloud.ufile.models.UpdateBucketStaticPageRuleRequest;
import cn.ucloud.ufile.models.UpdateBucketStaticPageRuleResponse;
import cn.ucloud.ufile.models.UpdateCORSRuleRequest;
import cn.ucloud.ufile.models.UpdateCORSRuleResponse;
import cn.ucloud.ufile.models.UpdateUFileLifeCycleRequest;
import cn.ucloud.ufile.models.UpdateUFileLifeCycleResponse;
import cn.ucloud.ufile.models.UpdateUFileSSLCertRequest;
import cn.ucloud.ufile.models.UpdateUFileSSLCertResponse;
import cn.ucloud.ufile.models.UpdateUFileTokenRequest;
import cn.ucloud.ufile.models.UpdateUFileTokenResponse;
import cn.ucloud.ufile.models.UpdateUdsRuleRequest;
import cn.ucloud.ufile.models.UpdateUdsRuleResponse;

/** This client is used to call actions of **UFile** service */
public interface UFileClientInterface extends Client {

    /**
     * AddCORSRule - 添加跨域规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddCORSRuleResponse addCORSRule(AddCORSRuleRequest request) throws UCloudException;

    /**
     * AddUFileSSLCert - 添加SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUFileSSLCertResponse addUFileSSLCert(AddUFileSSLCertRequest request)
            throws UCloudException;

    /**
     * BindBucketDomain - 绑定自定义域名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindBucketDomainResponse bindBucketDomain(BindBucketDomainRequest request)
            throws UCloudException;

    /**
     * BuyUFilePkg - 购买资源包
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BuyUFilePkgResponse buyUFilePkg(BuyUFilePkgRequest request) throws UCloudException;

    /**
     * CreateBucket - 创建Bucket
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateBucketResponse createBucket(CreateBucketRequest request) throws UCloudException;

    /**
     * CreateUFileLifeCycle - 创建生命周期管理
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUFileLifeCycleResponse createUFileLifeCycle(CreateUFileLifeCycleRequest request)
            throws UCloudException;

    /**
     * CreateUFileToken - 创建US3令牌
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUFileTokenResponse createUFileToken(CreateUFileTokenRequest request)
            throws UCloudException;

    /**
     * CreateUdsRule - 创建解压缩规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUdsRuleResponse createUdsRule(CreateUdsRuleRequest request) throws UCloudException;

    /**
     * DeleteBucket - 删除Bucket
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest request) throws UCloudException;

    /**
     * DeleteCORSRule - 删除跨域规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCORSRuleResponse deleteCORSRule(DeleteCORSRuleRequest request)
            throws UCloudException;

    /**
     * DeleteUFileLifeCycle - 删除生命周期管理
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUFileLifeCycleResponse deleteUFileLifeCycle(DeleteUFileLifeCycleRequest request)
            throws UCloudException;

    /**
     * DeleteUFilePkg - 删除资源包(退费)
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUFilePkgResponse deleteUFilePkg(DeleteUFilePkgRequest request)
            throws UCloudException;

    /**
     * DeleteUFileSSLCert - 删除SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUFileSSLCertResponse deleteUFileSSLCert(DeleteUFileSSLCertRequest request)
            throws UCloudException;

    /**
     * DeleteUFileToken - 删除令牌
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUFileTokenResponse deleteUFileToken(DeleteUFileTokenRequest request)
            throws UCloudException;

    /**
     * DescribeBucket - 获取Bucket信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeBucketResponse describeBucket(DescribeBucketRequest request)
            throws UCloudException;

    /**
     * DescribeCORSRule - 获取跨域规则信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCORSRuleResponse describeCORSRule(DescribeCORSRuleRequest request)
            throws UCloudException;

    /**
     * DescribeUFileAvailablePkg - 查询可购买的资源包列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUFileAvailablePkgResponse describeUFileAvailablePkg(
            DescribeUFileAvailablePkgRequest request) throws UCloudException;

    /**
     * DescribeUFileLifeCycle - 获取生命周期信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUFileLifeCycleResponse describeUFileLifeCycle(
            DescribeUFileLifeCycleRequest request) throws UCloudException;

    /**
     * DescribeUFilePkg - 查询已购买的资源包列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUFilePkgResponse describeUFilePkg(DescribeUFilePkgRequest request)
            throws UCloudException;

    /**
     * DescribeUFilePkgUsage - 查询资源包使用明细
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUFilePkgUsageResponse describeUFilePkgUsage(DescribeUFilePkgUsageRequest request)
            throws UCloudException;

    /**
     * DescribeUFileReferer - 对象存储防盗链列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUFileRefererResponse describeUFileReferer(DescribeUFileRefererRequest request)
            throws UCloudException;

    /**
     * DescribeUFileSSLCert - 查询SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUFileSSLCertResponse describeUFileSSLCert(DescribeUFileSSLCertRequest request)
            throws UCloudException;

    /**
     * DescribeUFileToken - 获取令牌信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUFileTokenResponse describeUFileToken(DescribeUFileTokenRequest request)
            throws UCloudException;

    /**
     * DescribeUdsRule - 获取解压缩规则信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUdsRuleResponse describeUdsRule(DescribeUdsRuleRequest request)
            throws UCloudException;

    /**
     * GetBucketQuota - 获取bucket配额
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetBucketQuotaResponse getBucketQuota(GetBucketQuotaRequest request)
            throws UCloudException;

    /**
     * GetBucketStaticPageRule - 获取bucket静态网页配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetBucketStaticPageRuleResponse getBucketStaticPageRule(
            GetBucketStaticPageRuleRequest request) throws UCloudException;

    /**
     * GetProjectRegionQuota - 获取项目地域配额
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetProjectRegionQuotaResponse getProjectRegionQuota(GetProjectRegionQuotaRequest request)
            throws UCloudException;

    /**
     * GetUFileDailyBill - 获取bucket每日账单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileDailyBillResponse getUFileDailyBill(GetUFileDailyBillRequest request)
            throws UCloudException;

    /**
     * GetUFileDailyReport - 查看日消费报表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileDailyReportResponse getUFileDailyReport(GetUFileDailyReportRequest request)
            throws UCloudException;

    /**
     * GetUFileMonthlyBill - 获取bucket月度账单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileMonthlyBillResponse getUFileMonthlyBill(GetUFileMonthlyBillRequest request)
            throws UCloudException;

    /**
     * GetUFilePkgPrice - 获取对资源进行新购、续费、升级等操作的价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFilePkgPriceResponse getUFilePkgPrice(GetUFilePkgPriceRequest request)
            throws UCloudException;

    /**
     * GetUFileQuota - 查看配额状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileQuotaResponse getUFileQuota(GetUFileQuotaRequest request) throws UCloudException;

    /**
     * GetUFileQuotaInfo - 获取配额信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileQuotaInfoResponse getUFileQuotaInfo(GetUFileQuotaInfoRequest request)
            throws UCloudException;

    /**
     * GetUFileQuotaPrice - 查询配额支付价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileQuotaPriceResponse getUFileQuotaPrice(GetUFileQuotaPriceRequest request)
            throws UCloudException;

    /**
     * GetUFileReport - 查看配额使用报表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileReportResponse getUFileReport(GetUFileReportRequest request)
            throws UCloudException;

    /**
     * RenewUFilePkg - 资源包续费
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RenewUFilePkgResponse renewUFilePkg(RenewUFilePkgRequest request) throws UCloudException;

    /**
     * SetBucketQuota - 设置bucket配额
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetBucketQuotaResponse setBucketQuota(SetBucketQuotaRequest request)
            throws UCloudException;

    /**
     * SetProjectRegionQuota - 设置项目地域配额
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetProjectRegionQuotaResponse setProjectRegionQuota(SetProjectRegionQuotaRequest request)
            throws UCloudException;

    /**
     * SetUFileReferer - 设置对象存储防盗链
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetUFileRefererResponse setUFileReferer(SetUFileRefererRequest request)
            throws UCloudException;

    /**
     * UpdateBucket - 更改Bucket属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateBucketResponse updateBucket(UpdateBucketRequest request) throws UCloudException;

    /**
     * UpdateBucketStaticPageRule - 修改bucket静态网页配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateBucketStaticPageRuleResponse updateBucketStaticPageRule(
            UpdateBucketStaticPageRuleRequest request) throws UCloudException;

    /**
     * UpdateCORSRule - 更新跨域规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCORSRuleResponse updateCORSRule(UpdateCORSRuleRequest request)
            throws UCloudException;

    /**
     * UpdateUFileLifeCycle - 更新生命周期管理
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUFileLifeCycleResponse updateUFileLifeCycle(UpdateUFileLifeCycleRequest request)
            throws UCloudException;

    /**
     * UpdateUFileSSLCert - 更新SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUFileSSLCertResponse updateUFileSSLCert(UpdateUFileSSLCertRequest request)
            throws UCloudException;

    /**
     * UpdateUFileToken - 更新令牌
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUFileTokenResponse updateUFileToken(UpdateUFileTokenRequest request)
            throws UCloudException;

    /**
     * UpdateUdsRule - 更新解压缩规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUdsRuleResponse updateUdsRule(UpdateUdsRuleRequest request) throws UCloudException;
}
