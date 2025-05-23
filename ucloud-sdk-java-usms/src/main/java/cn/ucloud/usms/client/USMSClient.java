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
package cn.ucloud.usms.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.usms.models.AddBackfillRequest;
import cn.ucloud.usms.models.AddBackfillResponse;
import cn.ucloud.usms.models.AddUSMSSignatureQualificationRequest;
import cn.ucloud.usms.models.AddUSMSSignatureQualificationResponse;
import cn.ucloud.usms.models.CreateUSMSSignatureRequest;
import cn.ucloud.usms.models.CreateUSMSSignatureResponse;
import cn.ucloud.usms.models.CreateUSMSTemplateRequest;
import cn.ucloud.usms.models.CreateUSMSTemplateResponse;
import cn.ucloud.usms.models.DeleteUSMSSignatureQualificationRequest;
import cn.ucloud.usms.models.DeleteUSMSSignatureQualificationResponse;
import cn.ucloud.usms.models.DeleteUSMSSignatureRequest;
import cn.ucloud.usms.models.DeleteUSMSSignatureResponse;
import cn.ucloud.usms.models.DeleteUSMSTemplateRequest;
import cn.ucloud.usms.models.DeleteUSMSTemplateResponse;
import cn.ucloud.usms.models.GetUSMSSendReceiptRequest;
import cn.ucloud.usms.models.GetUSMSSendReceiptResponse;
import cn.ucloud.usms.models.GetUSMSSendStatisticsRequest;
import cn.ucloud.usms.models.GetUSMSSendStatisticsResponse;
import cn.ucloud.usms.models.GetUSMSSignatureQualificationRequest;
import cn.ucloud.usms.models.GetUSMSSignatureQualificationResponse;
import cn.ucloud.usms.models.QueryUSMSSignatureQualificationRequest;
import cn.ucloud.usms.models.QueryUSMSSignatureQualificationResponse;
import cn.ucloud.usms.models.QueryUSMSSignatureRequest;
import cn.ucloud.usms.models.QueryUSMSSignatureResponse;
import cn.ucloud.usms.models.QueryUSMSTemplateRequest;
import cn.ucloud.usms.models.QueryUSMSTemplateResponse;
import cn.ucloud.usms.models.SendBatchUSMSMessageRequest;
import cn.ucloud.usms.models.SendBatchUSMSMessageResponse;
import cn.ucloud.usms.models.SendUSMSMessageRequest;
import cn.ucloud.usms.models.SendUSMSMessageResponse;
import cn.ucloud.usms.models.UpdateUSMSSignatureQualificationRequest;
import cn.ucloud.usms.models.UpdateUSMSSignatureQualificationResponse;
import cn.ucloud.usms.models.UpdateUSMSSignatureRequest;
import cn.ucloud.usms.models.UpdateUSMSSignatureResponse;
import cn.ucloud.usms.models.UpdateUSMSTemplateRequest;
import cn.ucloud.usms.models.UpdateUSMSTemplateResponse;
import cn.ucloud.usms.models.UploadUSMSFileRequest;
import cn.ucloud.usms.models.UploadUSMSFileResponse;

/** This client is used to call actions of **USMS** service */
public class USMSClient extends DefaultClient implements USMSClientInterface {
    public USMSClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * AddBackfill - 添加回填
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddBackfillResponse addBackfill(AddBackfillRequest request) throws UCloudException {
        request.setAction("AddBackfill");
        return (AddBackfillResponse) this.invoke(request, AddBackfillResponse.class);
    }

    /**
     * AddUSMSSignatureQualification - 添加短信签名资质申请记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUSMSSignatureQualificationResponse addUSMSSignatureQualification(
            AddUSMSSignatureQualificationRequest request) throws UCloudException {
        request.setAction("AddUSMSSignatureQualification");
        return (AddUSMSSignatureQualificationResponse)
                this.invoke(request, AddUSMSSignatureQualificationResponse.class);
    }

    /**
     * CreateUSMSSignature - 申请短信签名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUSMSSignatureResponse createUSMSSignature(CreateUSMSSignatureRequest request)
            throws UCloudException {
        request.setAction("CreateUSMSSignature");
        return (CreateUSMSSignatureResponse)
                this.invoke(request, CreateUSMSSignatureResponse.class);
    }

    /**
     * CreateUSMSTemplate - 申请短信模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUSMSTemplateResponse createUSMSTemplate(CreateUSMSTemplateRequest request)
            throws UCloudException {
        request.setAction("CreateUSMSTemplate");
        return (CreateUSMSTemplateResponse) this.invoke(request, CreateUSMSTemplateResponse.class);
    }

    /**
     * DeleteUSMSSignature - 删除短信签名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUSMSSignatureResponse deleteUSMSSignature(DeleteUSMSSignatureRequest request)
            throws UCloudException {
        request.setAction("DeleteUSMSSignature");
        return (DeleteUSMSSignatureResponse)
                this.invoke(request, DeleteUSMSSignatureResponse.class);
    }

    /**
     * DeleteUSMSSignatureQualification - 删除短信签名资质申请记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUSMSSignatureQualificationResponse deleteUSMSSignatureQualification(
            DeleteUSMSSignatureQualificationRequest request) throws UCloudException {
        request.setAction("DeleteUSMSSignatureQualification");
        return (DeleteUSMSSignatureQualificationResponse)
                this.invoke(request, DeleteUSMSSignatureQualificationResponse.class);
    }

    /**
     * DeleteUSMSTemplate - 删除短信模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUSMSTemplateResponse deleteUSMSTemplate(DeleteUSMSTemplateRequest request)
            throws UCloudException {
        request.setAction("DeleteUSMSTemplate");
        return (DeleteUSMSTemplateResponse) this.invoke(request, DeleteUSMSTemplateResponse.class);
    }

    /**
     * GetUSMSSendReceipt - 获取短信发送状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUSMSSendReceiptResponse getUSMSSendReceipt(GetUSMSSendReceiptRequest request)
            throws UCloudException {
        request.setAction("GetUSMSSendReceipt");
        return (GetUSMSSendReceiptResponse) this.invoke(request, GetUSMSSendReceiptResponse.class);
    }

    /**
     * GetUSMSSendStatistics - 获取发送统计数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUSMSSendStatisticsResponse getUSMSSendStatistics(GetUSMSSendStatisticsRequest request)
            throws UCloudException {
        request.setAction("GetUSMSSendStatistics");
        return (GetUSMSSendStatisticsResponse)
                this.invoke(request, GetUSMSSendStatisticsResponse.class);
    }

    /**
     * GetUSMSSignatureQualification - 获取短信签名资质申请记录列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUSMSSignatureQualificationResponse getUSMSSignatureQualification(
            GetUSMSSignatureQualificationRequest request) throws UCloudException {
        request.setAction("GetUSMSSignatureQualification");
        return (GetUSMSSignatureQualificationResponse)
                this.invoke(request, GetUSMSSignatureQualificationResponse.class);
    }

    /**
     * QueryUSMSSignature - 查询短信签名申请状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryUSMSSignatureResponse queryUSMSSignature(QueryUSMSSignatureRequest request)
            throws UCloudException {
        request.setAction("QueryUSMSSignature");
        return (QueryUSMSSignatureResponse) this.invoke(request, QueryUSMSSignatureResponse.class);
    }

    /**
     * QueryUSMSSignatureQualification - 获取短信签名资质申请记录详情
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryUSMSSignatureQualificationResponse queryUSMSSignatureQualification(
            QueryUSMSSignatureQualificationRequest request) throws UCloudException {
        request.setAction("QueryUSMSSignatureQualification");
        return (QueryUSMSSignatureQualificationResponse)
                this.invoke(request, QueryUSMSSignatureQualificationResponse.class);
    }

    /**
     * QueryUSMSTemplate - 查询短信模板申请状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryUSMSTemplateResponse queryUSMSTemplate(QueryUSMSTemplateRequest request)
            throws UCloudException {
        request.setAction("QueryUSMSTemplate");
        return (QueryUSMSTemplateResponse) this.invoke(request, QueryUSMSTemplateResponse.class);
    }

    /**
     * SendBatchUSMSMessage - 批量发送短信
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SendBatchUSMSMessageResponse sendBatchUSMSMessage(SendBatchUSMSMessageRequest request)
            throws UCloudException {
        request.setAction("SendBatchUSMSMessage");
        return (SendBatchUSMSMessageResponse)
                this.invoke(request, SendBatchUSMSMessageResponse.class);
    }

    /**
     * SendUSMSMessage - 发送短信
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SendUSMSMessageResponse sendUSMSMessage(SendUSMSMessageRequest request)
            throws UCloudException {
        request.setAction("SendUSMSMessage");
        return (SendUSMSMessageResponse) this.invoke(request, SendUSMSMessageResponse.class);
    }

    /**
     * UpdateUSMSSignature - 修改短信签名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUSMSSignatureResponse updateUSMSSignature(UpdateUSMSSignatureRequest request)
            throws UCloudException {
        request.setAction("UpdateUSMSSignature");
        return (UpdateUSMSSignatureResponse)
                this.invoke(request, UpdateUSMSSignatureResponse.class);
    }

    /**
     * UpdateUSMSSignatureQualification - 修改短信签名资质申请记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUSMSSignatureQualificationResponse updateUSMSSignatureQualification(
            UpdateUSMSSignatureQualificationRequest request) throws UCloudException {
        request.setAction("UpdateUSMSSignatureQualification");
        return (UpdateUSMSSignatureQualificationResponse)
                this.invoke(request, UpdateUSMSSignatureQualificationResponse.class);
    }

    /**
     * UpdateUSMSTemplate - 修改短信模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUSMSTemplateResponse updateUSMSTemplate(UpdateUSMSTemplateRequest request)
            throws UCloudException {
        request.setAction("UpdateUSMSTemplate");
        return (UpdateUSMSTemplateResponse) this.invoke(request, UpdateUSMSTemplateResponse.class);
    }

    /**
     * UploadUSMSFile - 上传文件
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UploadUSMSFileResponse uploadUSMSFile(UploadUSMSFileRequest request)
            throws UCloudException {
        request.setAction("UploadUSMSFile");
        return (UploadUSMSFileResponse) this.invoke(request, UploadUSMSFileResponse.class);
    }
}
