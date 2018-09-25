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

    @Override
    public RenameUDiskResult renameUDisk(RenameUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RenameUDiskResult.class);
        RenameUDiskResult result = (RenameUDiskResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void renameUDisk(RenameUDiskParam param, UcloudHandler<RenameUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RenameUDiskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DetachUDiskResult detachUDisk(DetachUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DetachUDiskResult.class);
        DetachUDiskResult result = (DetachUDiskResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void detachUDisk(DetachUDiskParam param, UcloudHandler<DetachUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DetachUDiskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RecoverUDiskResult recoverUDisk(RecoverUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RecoverUDiskResult.class);
        RecoverUDiskResult result = (RecoverUDiskResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void recoverUDisk(RecoverUDiskParam param, UcloudHandler<RecoverUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RecoverUDiskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RestoreUDiskResult restoreUDisk(RestoreUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RestoreUDiskResult.class);
        RestoreUDiskResult result = (RestoreUDiskResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void restoreUDisk(RestoreUDiskParam param, UcloudHandler<RestoreUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RestoreUDiskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CloneUDiskResult cloneUDisk(CloneUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CloneUDiskResult.class);
        CloneUDiskResult result = (CloneUDiskResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void cloneUDisk(CloneUDiskParam param, UcloudHandler<CloneUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CloneUDiskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDiskResult getDescribeUDisk(DescribeUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskResult.class);
        DescribeUDiskResult result = (DescribeUDiskResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getDescribeUDisk(DescribeUDiskParam param, UcloudHandler<DescribeUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

}
