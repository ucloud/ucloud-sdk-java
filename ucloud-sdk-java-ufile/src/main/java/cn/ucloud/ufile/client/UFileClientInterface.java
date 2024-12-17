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
import cn.ucloud.ufile.models.CreateBucketRequest;
import cn.ucloud.ufile.models.CreateBucketResponse;
import cn.ucloud.ufile.models.CreateUFileLifeCycleRequest;
import cn.ucloud.ufile.models.CreateUFileLifeCycleResponse;
import cn.ucloud.ufile.models.CreateUFileTokenRequest;
import cn.ucloud.ufile.models.CreateUFileTokenResponse;
import cn.ucloud.ufile.models.DeleteBucketRequest;
import cn.ucloud.ufile.models.DeleteBucketResponse;
import cn.ucloud.ufile.models.DeleteCORSRuleRequest;
import cn.ucloud.ufile.models.DeleteCORSRuleResponse;
import cn.ucloud.ufile.models.DeleteUFileLifeCycleRequest;
import cn.ucloud.ufile.models.DeleteUFileLifeCycleResponse;
import cn.ucloud.ufile.models.DeleteUFileTokenRequest;
import cn.ucloud.ufile.models.DeleteUFileTokenResponse;
import cn.ucloud.ufile.models.DescribeBucketRequest;
import cn.ucloud.ufile.models.DescribeBucketResponse;
import cn.ucloud.ufile.models.DescribeCORSRuleRequest;
import cn.ucloud.ufile.models.DescribeCORSRuleResponse;
import cn.ucloud.ufile.models.DescribeUFileLifeCycleRequest;
import cn.ucloud.ufile.models.DescribeUFileLifeCycleResponse;
import cn.ucloud.ufile.models.DescribeUFileTokenRequest;
import cn.ucloud.ufile.models.DescribeUFileTokenResponse;
import cn.ucloud.ufile.models.GetUFileDailyBillRequest;
import cn.ucloud.ufile.models.GetUFileDailyBillResponse;
import cn.ucloud.ufile.models.GetUFileDailyReportRequest;
import cn.ucloud.ufile.models.GetUFileDailyReportResponse;
import cn.ucloud.ufile.models.GetUFileQuotaInfoRequest;
import cn.ucloud.ufile.models.GetUFileQuotaInfoResponse;
import cn.ucloud.ufile.models.GetUFileQuotaPriceRequest;
import cn.ucloud.ufile.models.GetUFileQuotaPriceResponse;
import cn.ucloud.ufile.models.GetUFileQuotaRequest;
import cn.ucloud.ufile.models.GetUFileQuotaResponse;
import cn.ucloud.ufile.models.GetUFileReportRequest;
import cn.ucloud.ufile.models.GetUFileReportResponse;
import cn.ucloud.ufile.models.SetUFileRefererRequest;
import cn.ucloud.ufile.models.SetUFileRefererResponse;
import cn.ucloud.ufile.models.UpdateBucketRequest;
import cn.ucloud.ufile.models.UpdateBucketResponse;
import cn.ucloud.ufile.models.UpdateCORSRuleRequest;
import cn.ucloud.ufile.models.UpdateCORSRuleResponse;
import cn.ucloud.ufile.models.UpdateUFileLifeCycleRequest;
import cn.ucloud.ufile.models.UpdateUFileLifeCycleResponse;
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
     * DescribeUFileLifeCycle - 获取生命周期信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUFileLifeCycleResponse describeUFileLifeCycle(
            DescribeUFileLifeCycleRequest request) throws UCloudException;

    /**
     * DescribeUFileToken - 获取令牌信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUFileTokenResponse describeUFileToken(DescribeUFileTokenRequest request)
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
