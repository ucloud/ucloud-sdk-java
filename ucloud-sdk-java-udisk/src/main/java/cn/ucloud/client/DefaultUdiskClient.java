package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.*;
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
    public void getDescribeUDiskPriceCallback(DescribeUDiskPriceParam param, UcloudHandler<DescribeUDiskPriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskPriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AttachUDiskResult attachUDisk(AttachUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AttachUDiskResult.class);
        AttachUDiskResult result = (AttachUDiskResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void attachUDiskCallback(AttachUDiskParam param, UcloudHandler<AttachUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AttachUDiskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUDiskResult createUDisk(CreateUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUDiskResult.class);
        CreateUDiskResult result = (CreateUDiskResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createUDisk(CreateUDiskParam param, UcloudHandler<CreateUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUDiskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUDiskResult deleteUDisk(DeleteUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDiskResult.class);
        DeleteUDiskResult result = (DeleteUDiskResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteUDisk(DeleteUDiskParam param, UcloudHandler<DeleteUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDiskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

}
