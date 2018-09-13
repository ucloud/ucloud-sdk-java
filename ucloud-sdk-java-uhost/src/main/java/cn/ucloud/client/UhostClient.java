package cn.ucloud.client;


import cn.ucloud.model.GetUhostInstanceVncInfoParam;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
import cn.ucloud.util.ParamConstructor;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.InputStream;

/**
 * @description: 云主机的client
 * @author: codezhang
 * @date: 2018-09-13 10:48
 **/

public class UhostClient implements UcloudClient {

    private UhostConfig config;

    public UhostClient(UhostConfig config) {
        this.config = config;
    }



}
