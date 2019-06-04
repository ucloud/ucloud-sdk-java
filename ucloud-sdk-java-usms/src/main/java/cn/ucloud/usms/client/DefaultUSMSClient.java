package cn.ucloud.usms.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.common.pojo.UcloudConfig;
import cn.ucloud.usms.model.SendUSMSMessageParam;
import cn.ucloud.usms.model.SendUSMSMessageResult;

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
        return (SendUSMSMessageResult) http.doGet(param, config, null);
    }

    @Override
    public void sendUSMSMessage(SendUSMSMessageParam param, UcloudHandler<SendUSMSMessageResult> handler,
                            Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(SendUSMSMessageResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
