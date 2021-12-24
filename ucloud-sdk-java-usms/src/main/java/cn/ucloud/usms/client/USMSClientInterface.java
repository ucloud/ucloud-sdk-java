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
import cn.ucloud.usms.models.CreateUSMSSignatureRequest;
import cn.ucloud.usms.models.CreateUSMSSignatureResponse;
import cn.ucloud.usms.models.CreateUSMSTemplateRequest;
import cn.ucloud.usms.models.CreateUSMSTemplateResponse;
import cn.ucloud.usms.models.DeleteUSMSSignatureRequest;
import cn.ucloud.usms.models.DeleteUSMSSignatureResponse;
import cn.ucloud.usms.models.DeleteUSMSTemplateRequest;
import cn.ucloud.usms.models.DeleteUSMSTemplateResponse;
import cn.ucloud.usms.models.GetUSMSSendReceiptRequest;
import cn.ucloud.usms.models.GetUSMSSendReceiptResponse;
import cn.ucloud.usms.models.QueryUSMSSignatureRequest;
import cn.ucloud.usms.models.QueryUSMSSignatureResponse;
import cn.ucloud.usms.models.QueryUSMSTemplateRequest;
import cn.ucloud.usms.models.QueryUSMSTemplateResponse;
import cn.ucloud.usms.models.SendBatchUSMSMessageRequest;
import cn.ucloud.usms.models.SendBatchUSMSMessageResponse;
import cn.ucloud.usms.models.SendUSMSMessageRequest;
import cn.ucloud.usms.models.SendUSMSMessageResponse;
import cn.ucloud.usms.models.UpdateUSMSSignatureRequest;
import cn.ucloud.usms.models.UpdateUSMSSignatureResponse;
import cn.ucloud.usms.models.UpdateUSMSTemplateRequest;
import cn.ucloud.usms.models.UpdateUSMSTemplateResponse;

/** This client is used to call actions of **USMS** service */
public interface USMSClientInterface extends Client {

    /**
     * CreateUSMSSignature - 申请短信签名
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/CreateUSMSSignature
     */
    public CreateUSMSSignatureResponse createUSMSSignature(CreateUSMSSignatureRequest request)
            throws UCloudException;

    /**
     * CreateUSMSTemplate - 申请短信模板
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/CreateUSMSTemplate
     */
    public CreateUSMSTemplateResponse createUSMSTemplate(CreateUSMSTemplateRequest request)
            throws UCloudException;

    /**
     * DeleteUSMSSignature - 删除短信签名
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/DeleteUSMSSignature
     */
    public DeleteUSMSSignatureResponse deleteUSMSSignature(DeleteUSMSSignatureRequest request)
            throws UCloudException;

    /**
     * DeleteUSMSTemplate - 删除短信模板
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/DeleteUSMSTemplate
     */
    public DeleteUSMSTemplateResponse deleteUSMSTemplate(DeleteUSMSTemplateRequest request)
            throws UCloudException;

    /**
     * GetUSMSSendReceipt - 获取短信发送状态
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/GetUSMSSendReceipt
     */
    public GetUSMSSendReceiptResponse getUSMSSendReceipt(GetUSMSSendReceiptRequest request)
            throws UCloudException;

    /**
     * QueryUSMSSignature - 查询短信签名申请状态
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/QueryUSMSSignature
     */
    public QueryUSMSSignatureResponse queryUSMSSignature(QueryUSMSSignatureRequest request)
            throws UCloudException;

    /**
     * QueryUSMSTemplate - 查询短信模板申请状态
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/QueryUSMSTemplate
     */
    public QueryUSMSTemplateResponse queryUSMSTemplate(QueryUSMSTemplateRequest request)
            throws UCloudException;

    /**
     * SendBatchUSMSMessage - 批量发送短信
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/SendBatchUSMSMessage
     */
    public SendBatchUSMSMessageResponse sendBatchUSMSMessage(SendBatchUSMSMessageRequest request)
            throws UCloudException;

    /**
     * SendUSMSMessage - 发送短信
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/SendUSMSMessage
     */
    public SendUSMSMessageResponse sendUSMSMessage(SendUSMSMessageRequest request)
            throws UCloudException;

    /**
     * UpdateUSMSSignature - 修改短信签名
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/UpdateUSMSSignature
     */
    public UpdateUSMSSignatureResponse updateUSMSSignature(UpdateUSMSSignatureRequest request)
            throws UCloudException;

    /**
     * UpdateUSMSTemplate - 修改短信模板
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/UpdateUSMSTemplate
     */
    public UpdateUSMSTemplateResponse updateUSMSTemplate(UpdateUSMSTemplateRequest request)
            throws UCloudException;
}
