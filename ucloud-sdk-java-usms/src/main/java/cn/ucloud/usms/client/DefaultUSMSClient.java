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
}
