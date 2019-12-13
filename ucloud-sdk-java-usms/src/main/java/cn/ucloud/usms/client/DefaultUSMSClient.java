package cn.ucloud.usms.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.common.pojo.UcloudConfig;
import cn.ucloud.usms.model.*;

/**
 * @Description : USMS 默认客户端
 * @Author : codezhang
 * @Date : 2019-06-04 17:34
 **/
public class DefaultUSMSClient extends DefaultUcloudClient implements USMSClient {

    public DefaultUSMSClient(UcloudConfig config) {
        super(config);
    }

    @Override
    public SendUSMSMessageResult sendUSMSMessage(SendUSMSMessageParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(SendUSMSMessageResult.class);
        return (SendUSMSMessageResult) http.doPost(param, config, null);
    }

    @Override
    public void sendUSMSMessage(SendUSMSMessageParam param, UcloudHandler<SendUSMSMessageResult> handler,
                                Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(SendUSMSMessageResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUSMSSendReceiptResult getUSMSSendReceipt(GetUSMSSendReceiptParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUSMSSendReceiptResult.class);
        return (GetUSMSSendReceiptResult) http.doPost(param, config, null);
    }

    @Override
    public void getUSMSSendReceipt(GetUSMSSendReceiptParam param, UcloudHandler<GetUSMSSendReceiptResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUSMSSendReceiptResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUSMSSignatureResult createUSMSSignature(CreateUSMSSignatureParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUSMSSignatureResult.class);
        return (CreateUSMSSignatureResult) http.doPost(param, config, null);
    }

    @Override
    public void createUSMSSignature(CreateUSMSSignatureParam param, UcloudHandler<CreateUSMSSignatureResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUSMSSignatureResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public QueryUSMSSignatureResult queryUSMSSignature(QueryUSMSSignatureParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(QueryUSMSSignatureResult.class);
        return (QueryUSMSSignatureResult) http.doPost(param, config, null);
    }

    @Override
    public void queryUSMSSignature(QueryUSMSSignatureParam param, UcloudHandler<QueryUSMSSignatureResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(QueryUSMSSignatureResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUSMSSignatureResult deleteUSMSSignature(DeleteUSMSSignatureParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUSMSSignatureResult.class);
        return (DeleteUSMSSignatureResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteUSMSSignature(DeleteUSMSSignatureParam param, UcloudHandler<DeleteUSMSSignatureResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUSMSSignatureResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateUSMSSignatureResult updateUSMSSignature(UpdateUSMSSignatureParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateUSMSSignatureResult.class);
        return (UpdateUSMSSignatureResult) http.doPost(param, config, null);
    }

    @Override
    public void updateUSMSSignature(UpdateUSMSSignatureParam param, UcloudHandler<UpdateUSMSSignatureResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateUSMSSignatureResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUSMSTemplateResult createUSMSTemplate(CreateUSMSTemplateParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUSMSTemplateResult.class);
        return (CreateUSMSTemplateResult) http.doPost(param, config, null);
    }

    @Override
    public void createUSMSTemplate(CreateUSMSTemplateParam param, UcloudHandler<CreateUSMSTemplateResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUSMSTemplateResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public QueryUSMSTemplateResult queryUSMSTemplate(QueryUSMSTemplateParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(QueryUSMSTemplateResult.class);
        return (QueryUSMSTemplateResult) http.doPost(param, config, null);
    }

    @Override
    public void queryUSMSTemplate(QueryUSMSTemplateParam param, UcloudHandler<QueryUSMSTemplateResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(QueryUSMSTemplateResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public DeleteUSMSTemplateResult deleteUSMSTemplate(DeleteUSMSTemplateParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUSMSTemplateResult.class);
        return (DeleteUSMSTemplateResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteUSMSTemplate(DeleteUSMSTemplateParam param, UcloudHandler<DeleteUSMSTemplateResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUSMSTemplateResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
