package cn.ucloud.udisk.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.udisk.model.*;
import cn.ucloud.udisk.pojo.UdiskConfig;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/18 10:37
 */
public class DefaultUdiskClient extends DefaultUcloudClient implements UdiskClient {

    public DefaultUdiskClient(UdiskConfig config) {
        super(config);
    }

    @Override
    public DescribeUDiskPriceResult describeUDiskPrice(DescribeUDiskPriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskPriceResult.class);
        return (DescribeUDiskPriceResult) http.doPost(param, config, null);
    }

    @Override
    public void describeUDiskPrice(DescribeUDiskPriceParam param, UcloudHandler<DescribeUDiskPriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskPriceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AttachUDiskResult attachUDisk(AttachUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AttachUDiskResult.class);
        return (AttachUDiskResult) http.doPost(param, config, null);
    }

    @Override
    public void attachUDisk(AttachUDiskParam param, UcloudHandler<AttachUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AttachUDiskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUDiskResult createUDisk(CreateUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUDiskResult.class);
        return (CreateUDiskResult) http.doPost(param, config, null);
    }

    @Override
    public void createUDisk(CreateUDiskParam param, UcloudHandler<CreateUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUDiskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUDiskResult deleteUDisk(DeleteUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDiskResult.class);
        return (DeleteUDiskResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteUDisk(DeleteUDiskParam param, UcloudHandler<DeleteUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDiskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RenameUDiskResult renameUDisk(RenameUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RenameUDiskResult.class);
        return (RenameUDiskResult) http.doPost(param, config, null);
    }

    @Override
    public void renameUDisk(RenameUDiskParam param, UcloudHandler<RenameUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RenameUDiskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DetachUDiskResult detachUDisk(DetachUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DetachUDiskResult.class);
        return (DetachUDiskResult) http.doPost(param, config, null);
    }

    @Override
    public void detachUDisk(DetachUDiskParam param, UcloudHandler<DetachUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DetachUDiskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RecoverUDiskResult recoverUDisk(RecoverUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RecoverUDiskResult.class);
        return (RecoverUDiskResult) http.doPost(param, config, null);
    }

    @Override
    public void recoverUDisk(RecoverUDiskParam param, UcloudHandler<RecoverUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RecoverUDiskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RestoreUDiskResult restoreUDisk(RestoreUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RestoreUDiskResult.class);
        return (RestoreUDiskResult) http.doPost(param, config, null);
    }

    @Override
    public void restoreUDisk(RestoreUDiskParam param, UcloudHandler<RestoreUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RestoreUDiskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CloneUDiskResult cloneUDisk(CloneUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CloneUDiskResult.class);
        return (CloneUDiskResult) http.doPost(param, config, null);
    }

    @Override
    public void cloneUDisk(CloneUDiskParam param, UcloudHandler<CloneUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CloneUDiskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDiskResult describeUDisk(DescribeUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskResult.class);
        return (DescribeUDiskResult) http.doPost(param, config, null);
    }

    @Override
    public void describeUDisk(DescribeUDiskParam param, UcloudHandler<DescribeUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public SetUDiskUDataArkModeResult setUDiskUDataArkMode(SetUDiskUDataArkModeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(SetUDiskUDataArkModeResult.class);
        return (SetUDiskUDataArkModeResult) http.doPost(param, config, null);
    }

    @Override
    public void setUDiskUDataArkMode(SetUDiskUDataArkModeParam param, UcloudHandler<SetUDiskUDataArkModeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(SetUDiskUDataArkModeResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDiskSnapshotResult describeUDiskSnapshot(DescribeUDiskSnapshotParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskSnapshotResult.class);
        return (DescribeUDiskSnapshotResult) http.doPost(param, config, null);
    }

    @Override
    public void describeUDiskSnapshot(DescribeUDiskSnapshotParam param, UcloudHandler<DescribeUDiskSnapshotResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskSnapshotResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUDiskSnapshotResult deleteUDiskSnapshot(DeleteUDiskSnapshotParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDiskSnapshotResult.class);
        return (DeleteUDiskSnapshotResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteUDiskSnapshot(DeleteUDiskSnapshotParam param, UcloudHandler<DeleteUDiskSnapshotResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUDiskSnapshotResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeUDiskUpgradePriceResult describeUDiskUpgradePrice(DescribeUDiskUpgradePriceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskUpgradePriceResult.class);
        return (DescribeUDiskUpgradePriceResult) http.doPost(param, config, null);
    }

    @Override
    public void describeUDiskUpgradePrice(DescribeUDiskUpgradePriceParam param, UcloudHandler<DescribeUDiskUpgradePriceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeUDiskUpgradePriceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUDiskSnapshotResult createUDiskSnapshot(CreateUDiskSnapshotParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUDiskSnapshotResult.class);
        return (CreateUDiskSnapshotResult) http.doPost(param, config, null);
    }

    @Override
    public void createUDiskSnapshot(CreateUDiskSnapshotParam param, UcloudHandler<CreateUDiskSnapshotResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUDiskSnapshotResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CloneUDiskSnapshotResult cloneUDiskSnapshot(CloneUDiskSnapshotParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CloneUDiskSnapshotResult.class);
        return (CloneUDiskSnapshotResult) http.doPost(param, config, null);
    }

    @Override
    public void cloneUDiskSnapshot(CloneUDiskSnapshotParam param, UcloudHandler<CloneUDiskSnapshotResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CloneUDiskSnapshotResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeRecycleUDiskResult describeRecycleUDisk(DescribeRecycleUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeRecycleUDiskResult.class);
        return (DescribeRecycleUDiskResult) http.doPost(param, config, null);
    }

    @Override
    public void describeRecycleUDisk(DescribeRecycleUDiskParam param, UcloudHandler<DescribeRecycleUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeRecycleUDiskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ResizeUDiskResult resizeUDisk(ResizeUDiskParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ResizeUDiskResult.class);
        return (ResizeUDiskResult) http.doPost(param, config, null);
    }

    @Override
    public void resizeUDisk(ResizeUDiskParam param, UcloudHandler<ResizeUDiskResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ResizeUDiskResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

}
