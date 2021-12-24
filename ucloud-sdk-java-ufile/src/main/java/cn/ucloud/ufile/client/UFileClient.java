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
import cn.ucloud.ufile.models.CreateUFileTokenRequest;
import cn.ucloud.ufile.models.CreateUFileTokenResponse;
import cn.ucloud.ufile.models.DeleteBucketRequest;
import cn.ucloud.ufile.models.DeleteBucketResponse;
import cn.ucloud.ufile.models.DeleteUFileTokenRequest;
import cn.ucloud.ufile.models.DeleteUFileTokenResponse;
import cn.ucloud.ufile.models.DescribeBucketRequest;
import cn.ucloud.ufile.models.DescribeBucketResponse;
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
import cn.ucloud.ufile.models.UpdateUFileTokenRequest;
import cn.ucloud.ufile.models.UpdateUFileTokenResponse;

/** This client is used to call actions of **UFile** service */
public class UFileClient extends DefaultClient implements UFileClientInterface {
    public UFileClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateBucket - 创建Bucket
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/CreateBucket
     */
    public CreateBucketResponse createBucket(CreateBucketRequest request) throws UCloudException {
        request.setAction("CreateBucket");
        return (CreateBucketResponse) this.invoke(request, CreateBucketResponse.class);
    }

    /**
     * CreateUFileToken - 创建US3令牌
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/CreateUFileToken
     */
    public CreateUFileTokenResponse createUFileToken(CreateUFileTokenRequest request)
            throws UCloudException {
        request.setAction("CreateUFileToken");
        return (CreateUFileTokenResponse) this.invoke(request, CreateUFileTokenResponse.class);
    }

    /**
     * DeleteBucket - 删除Bucket
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/DeleteBucket
     */
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest request) throws UCloudException {
        request.setAction("DeleteBucket");
        return (DeleteBucketResponse) this.invoke(request, DeleteBucketResponse.class);
    }

    /**
     * DeleteUFileToken - 删除令牌
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/DeleteUFileToken
     */
    public DeleteUFileTokenResponse deleteUFileToken(DeleteUFileTokenRequest request)
            throws UCloudException {
        request.setAction("DeleteUFileToken");
        return (DeleteUFileTokenResponse) this.invoke(request, DeleteUFileTokenResponse.class);
    }

    /**
     * DescribeBucket - 获取Bucket的描述信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/DescribeBucket
     */
    public DescribeBucketResponse describeBucket(DescribeBucketRequest request)
            throws UCloudException {
        request.setAction("DescribeBucket");
        return (DescribeBucketResponse) this.invoke(request, DescribeBucketResponse.class);
    }

    /**
     * DescribeUFileToken - 获取令牌信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/DescribeUFileToken
     */
    public DescribeUFileTokenResponse describeUFileToken(DescribeUFileTokenRequest request)
            throws UCloudException {
        request.setAction("DescribeUFileToken");
        return (DescribeUFileTokenResponse) this.invoke(request, DescribeUFileTokenResponse.class);
    }

    /**
     * GetUFileDailyReport - 查看日消费报表
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/GetUFileDailyReport
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
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/GetUFileQuota
     */
    public GetUFileQuotaResponse getUFileQuota(GetUFileQuotaRequest request)
            throws UCloudException {
        request.setAction("GetUFileQuota");
        return (GetUFileQuotaResponse) this.invoke(request, GetUFileQuotaResponse.class);
    }

    /**
     * GetUFileQuotaInfo - 获取配额信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/GetUFileQuotaInfo
     */
    public GetUFileQuotaInfoResponse getUFileQuotaInfo(GetUFileQuotaInfoRequest request)
            throws UCloudException {
        request.setAction("GetUFileQuotaInfo");
        return (GetUFileQuotaInfoResponse) this.invoke(request, GetUFileQuotaInfoResponse.class);
    }

    /**
     * GetUFileQuotaPrice - 根据US3的购买配额，查询需要支付的价格。
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/GetUFileQuotaPrice
     */
    public GetUFileQuotaPriceResponse getUFileQuotaPrice(GetUFileQuotaPriceRequest request)
            throws UCloudException {
        request.setAction("GetUFileQuotaPrice");
        return (GetUFileQuotaPriceResponse) this.invoke(request, GetUFileQuotaPriceResponse.class);
    }

    /**
     * GetUFileReport - 查看配额使用报表
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/GetUFileReport
     */
    public GetUFileReportResponse getUFileReport(GetUFileReportRequest request)
            throws UCloudException {
        request.setAction("GetUFileReport");
        return (GetUFileReportResponse) this.invoke(request, GetUFileReportResponse.class);
    }

    /**
     * SetUFileReferer - 设置对象存储防盗链
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/SetUFileReferer
     */
    public SetUFileRefererResponse setUFileReferer(SetUFileRefererRequest request)
            throws UCloudException {
        request.setAction("SetUFileReferer");
        return (SetUFileRefererResponse) this.invoke(request, SetUFileRefererResponse.class);
    }

    /**
     * UpdateBucket - 更改Bucket的属性
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/UpdateBucket
     */
    public UpdateBucketResponse updateBucket(UpdateBucketRequest request) throws UCloudException {
        request.setAction("UpdateBucket");
        return (UpdateBucketResponse) this.invoke(request, UpdateBucketResponse.class);
    }

    /**
     * UpdateUFileToken - 更新令牌的操作权限，可操作key的前缀，可操作bucket和令牌超时时间点
     *
     * <p>See also: https://docs.ucloud.cn/api/ufile-api/UpdateUFileToken
     */
    public UpdateUFileTokenResponse updateUFileToken(UpdateUFileTokenRequest request)
            throws UCloudException {
        request.setAction("UpdateUFileToken");
        return (UpdateUFileTokenResponse) this.invoke(request, UpdateUFileTokenResponse.class);
    }
}
