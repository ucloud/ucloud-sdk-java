package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.DescribeUDiskPriceParam;
import cn.ucloud.model.DescribeUDiskPriceResult;
import cn.ucloud.pojo.UdiskConfig;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/18 10:37
 */
public class DefaultUdiskClient implements UdiskClient {

    private UdiskConfig config;

    public DefaultUdiskClient(UdiskConfig config) {
        this.config = config;
    }

    @Override
    public DescribeUDiskPriceResult getDescribeUDiskPrice(DescribeUDiskPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskPriceResult.class);
        DescribeUDiskPriceResult result = (DescribeUDiskPriceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getDescribeUDiskPriceCallback(DescribeUDiskPriceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskPriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
