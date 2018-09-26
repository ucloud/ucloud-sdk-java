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
            e.printStackTrace();
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

    @Override
    public SetUDiskUDataArkModeResult setUDiskUDataArkMode(SetUDiskUDataArkModeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(SetUDiskUDataArkModeResult.class);
        SetUDiskUDataArkModeResult result = (SetUDiskUDataArkModeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void setUDiskUDataArkMode(SetUDiskUDataArkModeParam param, UcloudHandler<SetUDiskUDataArkModeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(SetUDiskUDataArkModeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDiskSnapshotResult getDescribeUDiskSnapshot(DescribeUDiskSnapshotParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskSnapshotResult.class);
        DescribeUDiskSnapshotResult result = (DescribeUDiskSnapshotResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getDescribeUDiskSnapshot(DescribeUDiskSnapshotParam param, UcloudHandler<DescribeUDiskSnapshotResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskSnapshotResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUDiskSnapshotResult deleteUDiskSnapshot(DeleteUDiskSnapshotParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDiskSnapshotResult.class);
        DeleteUDiskSnapshotResult result = (DeleteUDiskSnapshotResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteUDiskSnapshot(DeleteUDiskSnapshotParam param, UcloudHandler<DeleteUDiskSnapshotResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDiskSnapshotResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDiskUpgradePriceResult getDescribeUDiskUpgradePrice(DescribeUDiskUpgradePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskUpgradePriceResult.class);
        DescribeUDiskUpgradePriceResult result = (DescribeUDiskUpgradePriceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getDescribeUDiskUpgradePrice(DescribeUDiskUpgradePriceParam param, UcloudHandler<DescribeUDiskUpgradePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskUpgradePriceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUDiskSnapshotResult createUDiskSnapshot(CreateUDiskSnapshotParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUDiskSnapshotResult.class);
        CreateUDiskSnapshotResult result = (CreateUDiskSnapshotResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createUDiskSnapshot(CreateUDiskSnapshotParam param, UcloudHandler<CreateUDiskSnapshotResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUDiskSnapshotResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CloneUDiskSnapshotResult cloneUDiskSnapshot(CloneUDiskSnapshotParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CloneUDiskSnapshotResult.class);
        CloneUDiskSnapshotResult result = (CloneUDiskSnapshotResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void cloneUDiskSnapshot(CloneUDiskSnapshotParam param, UcloudHandler<CloneUDiskSnapshotResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CloneUDiskSnapshotResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeRecycleUDiskResult getDescribeRecycleUDisk(DescribeRecycleUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeRecycleUDiskResult.class);
        DescribeRecycleUDiskResult result = (DescribeRecycleUDiskResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void getDescribeRecycleUDisk(DescribeRecycleUDiskParam param, UcloudHandler<DescribeRecycleUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeRecycleUDiskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ResizeUDiskResult resizeUDisk(ResizeUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ResizeUDiskResult.class);
        ResizeUDiskResult result = (ResizeUDiskResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void resizeUDisk(ResizeUDiskParam param, UcloudHandler<ResizeUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ResizeUDiskResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

}
