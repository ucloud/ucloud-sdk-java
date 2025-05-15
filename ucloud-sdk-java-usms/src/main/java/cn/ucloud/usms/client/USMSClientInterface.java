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

import cn.ucloud.common.client.Client;
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
public interface USMSClientInterface extends Client {

    /**
     * AddBackfill - 添加回填
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddBackfillResponse addBackfill(AddBackfillRequest request) throws UCloudException;

    /**
     * AddUSMSSignatureQualification - 添加短信签名资质申请记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUSMSSignatureQualificationResponse addUSMSSignatureQualification(
            AddUSMSSignatureQualificationRequest request) throws UCloudException;

    /**
     * CreateUSMSSignature - 申请短信签名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUSMSSignatureResponse createUSMSSignature(CreateUSMSSignatureRequest request)
            throws UCloudException;

    /**
     * CreateUSMSTemplate - 申请短信模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUSMSTemplateResponse createUSMSTemplate(CreateUSMSTemplateRequest request)
            throws UCloudException;

    /**
     * DeleteUSMSSignature - 删除短信签名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUSMSSignatureResponse deleteUSMSSignature(DeleteUSMSSignatureRequest request)
            throws UCloudException;

    /**
     * DeleteUSMSSignatureQualification - 删除短信签名资质申请记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUSMSSignatureQualificationResponse deleteUSMSSignatureQualification(
            DeleteUSMSSignatureQualificationRequest request) throws UCloudException;

    /**
     * DeleteUSMSTemplate - 删除短信模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUSMSTemplateResponse deleteUSMSTemplate(DeleteUSMSTemplateRequest request)
            throws UCloudException;

    /**
     * GetUSMSSendReceipt - 获取短信发送状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUSMSSendReceiptResponse getUSMSSendReceipt(GetUSMSSendReceiptRequest request)
            throws UCloudException;

    /**
     * GetUSMSSendStatistics - 获取发送统计数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUSMSSendStatisticsResponse getUSMSSendStatistics(GetUSMSSendStatisticsRequest request)
            throws UCloudException;

    /**
     * GetUSMSSignatureQualification - 获取短信签名资质申请记录列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUSMSSignatureQualificationResponse getUSMSSignatureQualification(
            GetUSMSSignatureQualificationRequest request) throws UCloudException;

    /**
     * QueryUSMSSignature - 查询短信签名申请状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryUSMSSignatureResponse queryUSMSSignature(QueryUSMSSignatureRequest request)
            throws UCloudException;

    /**
     * QueryUSMSSignatureQualification - 获取短信签名资质申请记录详情
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryUSMSSignatureQualificationResponse queryUSMSSignatureQualification(
            QueryUSMSSignatureQualificationRequest request) throws UCloudException;

    /**
     * QueryUSMSTemplate - 查询短信模板申请状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryUSMSTemplateResponse queryUSMSTemplate(QueryUSMSTemplateRequest request)
            throws UCloudException;

    /**
     * SendBatchUSMSMessage - 批量发送短信
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SendBatchUSMSMessageResponse sendBatchUSMSMessage(SendBatchUSMSMessageRequest request)
            throws UCloudException;

    /**
     * SendUSMSMessage - 发送短信
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SendUSMSMessageResponse sendUSMSMessage(SendUSMSMessageRequest request)
            throws UCloudException;

    /**
     * UpdateUSMSSignature - 修改短信签名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUSMSSignatureResponse updateUSMSSignature(UpdateUSMSSignatureRequest request)
            throws UCloudException;

    /**
     * UpdateUSMSSignatureQualification - 修改短信签名资质申请记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUSMSSignatureQualificationResponse updateUSMSSignatureQualification(
            UpdateUSMSSignatureQualificationRequest request) throws UCloudException;

    /**
     * UpdateUSMSTemplate - 修改短信模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUSMSTemplateResponse updateUSMSTemplate(UpdateUSMSTemplateRequest request)
            throws UCloudException;

    /**
     * UploadUSMSFile - 上传文件
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UploadUSMSFileResponse uploadUSMSFile(UploadUSMSFileRequest request)
            throws UCloudException;
}
