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
public class USMSClient extends DefaultClient implements USMSClientInterface {
    public USMSClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateUSMSSignature - 调用接口CreateUSMSSignature申请短信签名
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/CreateUSMSSignature
     */
    public CreateUSMSSignatureResponse createUSMSSignature(CreateUSMSSignatureRequest request)
            throws UCloudException {
        request.setAction("CreateUSMSSignature");
        return (CreateUSMSSignatureResponse)
                this.invoke(request, CreateUSMSSignatureResponse.class);
    }

    /**
     * CreateUSMSTemplate - 调用接口CreateUSMSTemplate申请短信模板
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/CreateUSMSTemplate
     */
    public CreateUSMSTemplateResponse createUSMSTemplate(CreateUSMSTemplateRequest request)
            throws UCloudException {
        request.setAction("CreateUSMSTemplate");
        return (CreateUSMSTemplateResponse) this.invoke(request, CreateUSMSTemplateResponse.class);
    }

    /**
     * DeleteUSMSSignature - 调用接口DeleteUSMSSignature删除短信签名
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/DeleteUSMSSignature
     */
    public DeleteUSMSSignatureResponse deleteUSMSSignature(DeleteUSMSSignatureRequest request)
            throws UCloudException {
        request.setAction("DeleteUSMSSignature");
        return (DeleteUSMSSignatureResponse)
                this.invoke(request, DeleteUSMSSignatureResponse.class);
    }

    /**
     * DeleteUSMSTemplate - 调用接口DeleteUSMSTemplate删除短信模板
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/DeleteUSMSTemplate
     */
    public DeleteUSMSTemplateResponse deleteUSMSTemplate(DeleteUSMSTemplateRequest request)
            throws UCloudException {
        request.setAction("DeleteUSMSTemplate");
        return (DeleteUSMSTemplateResponse) this.invoke(request, DeleteUSMSTemplateResponse.class);
    }

    /**
     * GetUSMSSendReceipt - 调用接口GetUSMSSendReceipt短信发送状态信息
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/GetUSMSSendReceipt
     */
    public GetUSMSSendReceiptResponse getUSMSSendReceipt(GetUSMSSendReceiptRequest request)
            throws UCloudException {
        request.setAction("GetUSMSSendReceipt");
        return (GetUSMSSendReceiptResponse) this.invoke(request, GetUSMSSendReceiptResponse.class);
    }

    /**
     * QueryUSMSSignature - 调用接口QueryUSMSSignature查询短信签名申请状态
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/QueryUSMSSignature
     */
    public QueryUSMSSignatureResponse queryUSMSSignature(QueryUSMSSignatureRequest request)
            throws UCloudException {
        request.setAction("QueryUSMSSignature");
        return (QueryUSMSSignatureResponse) this.invoke(request, QueryUSMSSignatureResponse.class);
    }

    /**
     * QueryUSMSTemplate - 调用接口QueryUSMSTemplate查询短信模板申请状态
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/QueryUSMSTemplate
     */
    public QueryUSMSTemplateResponse queryUSMSTemplate(QueryUSMSTemplateRequest request)
            throws UCloudException {
        request.setAction("QueryUSMSTemplate");
        return (QueryUSMSTemplateResponse) this.invoke(request, QueryUSMSTemplateResponse.class);
    }

    /**
     * SendBatchUSMSMessage - 调用SendBatchUSMSMessage接口批量发送短信
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/SendBatchUSMSMessage
     */
    public SendBatchUSMSMessageResponse sendBatchUSMSMessage(SendBatchUSMSMessageRequest request)
            throws UCloudException {
        request.setAction("SendBatchUSMSMessage");
        return (SendBatchUSMSMessageResponse)
                this.invoke(request, SendBatchUSMSMessageResponse.class);
    }

    /**
     * SendUSMSMessage - 调用接口SendUSMSMessage发送短信
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/SendUSMSMessage
     */
    public SendUSMSMessageResponse sendUSMSMessage(SendUSMSMessageRequest request)
            throws UCloudException {
        request.setAction("SendUSMSMessage");
        return (SendUSMSMessageResponse) this.invoke(request, SendUSMSMessageResponse.class);
    }

    /**
     * UpdateUSMSSignature - 调用接口UpdateUSMSSignature修改未通过审核的短信签名，并重新提交审核
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/UpdateUSMSSignature
     */
    public UpdateUSMSSignatureResponse updateUSMSSignature(UpdateUSMSSignatureRequest request)
            throws UCloudException {
        request.setAction("UpdateUSMSSignature");
        return (UpdateUSMSSignatureResponse)
                this.invoke(request, UpdateUSMSSignatureResponse.class);
    }

    /**
     * UpdateUSMSTemplate - 调用接口UpdateUSMSTemplate修改未通过审核的短信模板，并重新提交审核
     *
     * <p>See also: https://docs.ucloud.cn/api/usms-api/UpdateUSMSTemplate
     */
    public UpdateUSMSTemplateResponse updateUSMSTemplate(UpdateUSMSTemplateRequest request)
            throws UCloudException {
        request.setAction("UpdateUSMSTemplate");
        return (UpdateUSMSTemplateResponse) this.invoke(request, UpdateUSMSTemplateResponse.class);
    }
}
