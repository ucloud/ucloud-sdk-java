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

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ufile.models.CreateBucketRequest;
import cn.ucloud.ufile.models.CreateBucketResponse;
import cn.ucloud.ufile.models.CreateUFileLifeCycleRequest;
import cn.ucloud.ufile.models.CreateUFileLifeCycleResponse;
import cn.ucloud.ufile.models.CreateUFileTokenRequest;
import cn.ucloud.ufile.models.CreateUFileTokenResponse;
import cn.ucloud.ufile.models.DeleteBucketRequest;
import cn.ucloud.ufile.models.DeleteBucketResponse;
import cn.ucloud.ufile.models.DeleteUFileLifeCycleRequest;
import cn.ucloud.ufile.models.DeleteUFileLifeCycleResponse;
import cn.ucloud.ufile.models.DeleteUFileTokenRequest;
import cn.ucloud.ufile.models.DeleteUFileTokenResponse;
import cn.ucloud.ufile.models.DescribeBucketRequest;
import cn.ucloud.ufile.models.DescribeBucketResponse;
import cn.ucloud.ufile.models.DescribeUFileLifeCycleRequest;
import cn.ucloud.ufile.models.DescribeUFileLifeCycleResponse;
import cn.ucloud.ufile.models.DescribeUFileTokenRequest;
import cn.ucloud.ufile.models.DescribeUFileTokenResponse;
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
import cn.ucloud.ufile.models.UpdateUFileLifeCycleRequest;
import cn.ucloud.ufile.models.UpdateUFileLifeCycleResponse;
import cn.ucloud.ufile.models.UpdateUFileTokenRequest;
import cn.ucloud.ufile.models.UpdateUFileTokenResponse;
import cn.ucloud.ufile.models.UpdateUdsRuleRequest;
import cn.ucloud.ufile.models.UpdateUdsRuleResponse;

/** This client is used to call actions of **UFile** service */
public class UFileClient extends DefaultClient implements UFileClientInterface {
    public UFileClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateBucket - 创建Bucket
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateBucketResponse createBucket(CreateBucketRequest request) throws UCloudException {
        request.setAction("CreateBucket");
        return (CreateBucketResponse) this.invoke(request, CreateBucketResponse.class);
    }

    /**
     * CreateUFileLifeCycle - 创建生命周期管理
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUFileLifeCycleResponse createUFileLifeCycle(CreateUFileLifeCycleRequest request)
            throws UCloudException {
        request.setAction("CreateUFileLifeCycle");
        return (CreateUFileLifeCycleResponse)
                this.invoke(request, CreateUFileLifeCycleResponse.class);
    }

    /**
     * CreateUFileToken - 创建US3令牌
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUFileTokenResponse createUFileToken(CreateUFileTokenRequest request)
            throws UCloudException {
        request.setAction("CreateUFileToken");
        return (CreateUFileTokenResponse) this.invoke(request, CreateUFileTokenResponse.class);
    }

    /**
     * DeleteBucket - 删除Bucket
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest request) throws UCloudException {
        request.setAction("DeleteBucket");
        return (DeleteBucketResponse) this.invoke(request, DeleteBucketResponse.class);
    }

    /**
     * DeleteUFileLifeCycle - 删除生命周期管理
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUFileLifeCycleResponse deleteUFileLifeCycle(DeleteUFileLifeCycleRequest request)
            throws UCloudException {
        request.setAction("DeleteUFileLifeCycle");
        return (DeleteUFileLifeCycleResponse)
                this.invoke(request, DeleteUFileLifeCycleResponse.class);
    }

    /**
     * DeleteUFileToken - 删除令牌
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUFileTokenResponse deleteUFileToken(DeleteUFileTokenRequest request)
            throws UCloudException {
        request.setAction("DeleteUFileToken");
        return (DeleteUFileTokenResponse) this.invoke(request, DeleteUFileTokenResponse.class);
    }

    /**
     * DescribeBucket - 获取Bucket信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeBucketResponse describeBucket(DescribeBucketRequest request)
            throws UCloudException {
        request.setAction("DescribeBucket");
        return (DescribeBucketResponse) this.invoke(request, DescribeBucketResponse.class);
    }

    /**
     * DescribeUFileLifeCycle - 获取生命周期信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUFileLifeCycleResponse describeUFileLifeCycle(
            DescribeUFileLifeCycleRequest request) throws UCloudException {
        request.setAction("DescribeUFileLifeCycle");
        return (DescribeUFileLifeCycleResponse)
                this.invoke(request, DescribeUFileLifeCycleResponse.class);
    }

    /**
     * DescribeUFileToken - 获取令牌信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUFileTokenResponse describeUFileToken(DescribeUFileTokenRequest request)
            throws UCloudException {
        request.setAction("DescribeUFileToken");
        return (DescribeUFileTokenResponse) this.invoke(request, DescribeUFileTokenResponse.class);
    }

    /**
     * GetUFileDailyReport - 查看日消费报表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileDailyReportResponse getUFileDailyReport(GetUFileDailyReportRequest request)
            throws UCloudException {
        request.setAction("GetUFileDailyReport");
        return (GetUFileDailyReportResponse)
                this.invoke(request, GetUFileDailyReportResponse.class);
    }

    /**
     * GetUFileQuota - 查看配额状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileQuotaResponse getUFileQuota(GetUFileQuotaRequest request)
            throws UCloudException {
        request.setAction("GetUFileQuota");
        return (GetUFileQuotaResponse) this.invoke(request, GetUFileQuotaResponse.class);
    }

    /**
     * GetUFileQuotaInfo - 获取配额信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileQuotaInfoResponse getUFileQuotaInfo(GetUFileQuotaInfoRequest request)
            throws UCloudException {
        request.setAction("GetUFileQuotaInfo");
        return (GetUFileQuotaInfoResponse) this.invoke(request, GetUFileQuotaInfoResponse.class);
    }

    /**
     * GetUFileQuotaPrice - 查询配额支付价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileQuotaPriceResponse getUFileQuotaPrice(GetUFileQuotaPriceRequest request)
            throws UCloudException {
        request.setAction("GetUFileQuotaPrice");
        return (GetUFileQuotaPriceResponse) this.invoke(request, GetUFileQuotaPriceResponse.class);
    }

    /**
     * GetUFileReport - 查看配额使用报表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFileReportResponse getUFileReport(GetUFileReportRequest request)
            throws UCloudException {
        request.setAction("GetUFileReport");
        return (GetUFileReportResponse) this.invoke(request, GetUFileReportResponse.class);
    }

    /**
     * SetUFileReferer - 设置对象存储防盗链
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetUFileRefererResponse setUFileReferer(SetUFileRefererRequest request)
            throws UCloudException {
        request.setAction("SetUFileReferer");
        return (SetUFileRefererResponse) this.invoke(request, SetUFileRefererResponse.class);
    }

    /**
     * UpdateBucket - 更改Bucket属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateBucketResponse updateBucket(UpdateBucketRequest request) throws UCloudException {
        request.setAction("UpdateBucket");
        return (UpdateBucketResponse) this.invoke(request, UpdateBucketResponse.class);
    }

    /**
     * UpdateUFileLifeCycle - 更新生命周期管理
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUFileLifeCycleResponse updateUFileLifeCycle(UpdateUFileLifeCycleRequest request)
            throws UCloudException {
        request.setAction("UpdateUFileLifeCycle");
        return (UpdateUFileLifeCycleResponse)
                this.invoke(request, UpdateUFileLifeCycleResponse.class);
    }

    /**
     * UpdateUFileToken - 更新令牌
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUFileTokenResponse updateUFileToken(UpdateUFileTokenRequest request)
            throws UCloudException {
        request.setAction("UpdateUFileToken");
        return (UpdateUFileTokenResponse) this.invoke(request, UpdateUFileTokenResponse.class);
    }

    /**
     * UpdateUdsRule - 更新解压缩规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUdsRuleResponse updateUdsRule(UpdateUdsRuleRequest request)
            throws UCloudException {
        request.setAction("UpdateUdsRule");
        return (UpdateUdsRuleResponse) this.invoke(request, UpdateUdsRuleResponse.class);
    }
}
