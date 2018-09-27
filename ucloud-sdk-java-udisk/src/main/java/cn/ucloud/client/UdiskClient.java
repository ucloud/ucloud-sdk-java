package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.*;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/17 19:07
 */
public interface UdiskClient {

    /**
     * 获取云硬盘价格-DescribeUDiskPrice
     *
     * @param param {@link DescribeUDiskPriceParam}参数对象
     * @return {@link DescribeUDiskPriceResult} 结果对象
     * @throws Exception 出错抛出异常
     */
    DescribeUDiskPriceResult getDescribeUDiskPrice(DescribeUDiskPriceParam param) throws Exception;

    /**
     * 获取云硬盘价格-DescribeUDiskPrice (回调)
     *
     * @param param     {@link DescribeUDiskPriceParam}  参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void getDescribeUDiskPriceCallback(DescribeUDiskPriceParam param, UcloudHandler<DescribeUDiskPriceResult> handler, Boolean... asyncFlag);

    /**
     * 挂载云硬盘
     * 将一个可用的UDisk挂载到某台主机上，当UDisk挂载成功后，还需要在主机内部进行文件系统操作
     *
     * @param param {@link AttachUDiskParam} 参数对象
     * @return {@link AttachUDiskResult}
     * @throws Exception
     */
    AttachUDiskResult attachUDisk(AttachUDiskParam param) throws Exception;

    /**
     * 挂载云硬盘
     * 将一个可用的UDisk挂载到某台主机上，当UDisk挂载成功后，还需要在主机内部进行文件系统操作
     *
     * @param param     {@link AttachUDiskParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void attachUDiskCallback(AttachUDiskParam param, UcloudHandler<AttachUDiskResult> handler, Boolean... asyncFlag);

    /**
     * 创建UDisk磁盘
     *
     * @param param {@link CreateUDiskParam} 参数对象
     * @return {@link CreateUDiskResult}
     * @throws Exception
     */
    CreateUDiskResult createUDisk(CreateUDiskParam param) throws Exception;

    /**
     * 创建UDisk磁盘
     *
     * @param param     {@link CreateUDiskParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void createUDisk(CreateUDiskParam param, UcloudHandler<CreateUDiskResult> handler, Boolean... asyncFlag);

    /**
     * 删除UDisk
     *
     * @param param {@link DeleteUDiskParam} 参数对象
     * @return {@link DeleteUDiskResult}
     * @throws Exception
     */
    DeleteUDiskResult deleteUDisk(DeleteUDiskParam param) throws Exception;

    /**
     * 删除UDisk
     *
     * @param param     {@link DeleteUDiskParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void deleteUDisk(DeleteUDiskParam param, UcloudHandler<DeleteUDiskResult> handler, Boolean... asyncFlag);

    /**
     * 重命名UDisk
     *
     * @param param {@link RenameUDiskParam} 参数对象
     * @return {@link RenameUDiskResult}
     * @throws Exception
     */
    RenameUDiskResult renameUDisk(RenameUDiskParam param) throws Exception;

    /**
     * 重命名UDisk
     *
     * @param param     {@link RenameUDiskParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void renameUDisk(RenameUDiskParam param, UcloudHandler<RenameUDiskResult> handler, Boolean... asyncFlag);

    /**
     * 卸载某个已经挂载在指定UHost实例上的UDisk
     *
     * @param param {@link DetachUDiskParam} 参数对象
     * @return {@link DetachUDiskResult}
     * @throws Exception
     */
    DetachUDiskResult detachUDisk(DetachUDiskParam param) throws Exception;

    /**
     * 卸载某个已经挂载在指定UHost实例上的UDisk
     *
     * @param param     {@link DetachUDiskParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void detachUDisk(DetachUDiskParam param, UcloudHandler<DetachUDiskResult> handler, Boolean... asyncFlag);

    /**
     * 从回收站中恢复云硬盘
     *
     * @param param {@link RecoverUDiskParam} 参数对象
     * @return {@link RecoverUDiskResult}
     * @throws Exception
     */
    RecoverUDiskResult recoverUDisk(RecoverUDiskParam param) throws Exception;

    /**
     * 从回收站中恢复云硬盘
     *
     * @param param     {@link RecoverUDiskParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void recoverUDisk(RecoverUDiskParam param, UcloudHandler<RecoverUDiskResult> handler, Boolean... asyncFlag);

    /**
     * 从备份恢复数据至UDisk
     *
     * @param param {@link RestoreUDiskParam} 参数对象
     * @return {@link RestoreUDiskResult}
     * @throws Exception
     */
    RestoreUDiskResult restoreUDisk(RestoreUDiskParam param) throws Exception;

    /**
     * 从备份恢复数据至UDisk
     *
     * @param param     {@link RestoreUDiskParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void restoreUDisk(RestoreUDiskParam param, UcloudHandler<RestoreUDiskResult> handler, Boolean... asyncFlag);

    /**
     * 从UDisk创建UDisk克隆
     *
     * @param param {@link CloneUDiskParam} 参数对象
     * @return {@link CloneUDiskResult}
     * @throws Exception
     */
    CloneUDiskResult cloneUDisk(CloneUDiskParam param) throws Exception;

    /**
     * 从UDisk创建UDisk克隆
     *
     * @param param     {@link CloneUDiskParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void cloneUDisk(CloneUDiskParam param, UcloudHandler<CloneUDiskResult> handler, Boolean... asyncFlag);

    /**
     * 获取云硬盘列表
     *
     * @param param {@link DescribeUDiskParam} 参数对象
     * @return {@link DescribeUDiskResult}
     * @throws Exception
     */
    DescribeUDiskResult getDescribeUDisk(DescribeUDiskParam param) throws Exception;

    /**
     * 获取云硬盘列表
     *
     * @param param     {@link DescribeUDiskParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void getDescribeUDisk(DescribeUDiskParam param, UcloudHandler<DescribeUDiskResult> handler, Boolean... asyncFlag);

    /**
     * 设置UDisk数据方舟的状态
     *
     * @param param {@link SetUDiskUDataArkModeParam} 参数对象
     * @return {@link SetUDiskUDataArkModeResult}
     * @throws Exception
     */
    SetUDiskUDataArkModeResult setUDiskUDataArkMode(SetUDiskUDataArkModeParam param) throws Exception;

    /**
     * 设置UDisk数据方舟的状态
     *
     * @param param     {@link SetUDiskUDataArkModeParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void setUDiskUDataArkMode(SetUDiskUDataArkModeParam param, UcloudHandler<SetUDiskUDataArkModeResult> handler, Boolean... asyncFlag);

    /**
     * 获取快照列表
     *
     * @param param {@link DescribeUDiskSnapshotParam} 参数对象
     * @return {@link DescribeUDiskSnapshotResult}
     * @throws Exception
     */
    DescribeUDiskSnapshotResult getDescribeUDiskSnapshot(DescribeUDiskSnapshotParam param) throws Exception;

    /**
     * 获取快照列表
     *
     * @param param     {@link DescribeUDiskSnapshotParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void getDescribeUDiskSnapshot(DescribeUDiskSnapshotParam param, UcloudHandler<DescribeUDiskSnapshotResult> handler, Boolean... asyncFlag);

    /**
     * 删除快照
     *
     * @param param {@link DeleteUDiskSnapshotParam} 参数对象
     * @return {@link DeleteUDiskSnapshotResult}
     * @throws Exception
     */
    DeleteUDiskSnapshotResult deleteUDiskSnapshot(DeleteUDiskSnapshotParam param) throws Exception;

    /**
     * 删除快照
     *
     * @param param     {@link DeleteUDiskSnapshotParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void deleteUDiskSnapshot(DeleteUDiskSnapshotParam param, UcloudHandler<DeleteUDiskSnapshotResult> handler, Boolean... asyncFlag);

    /**
     * 获取云硬盘升级价格
     *
     * @param param {@link DescribeUDiskUpgradePriceParam} 参数对象
     * @return {@link DescribeUDiskUpgradePriceResult}
     * @throws Exception
     */
    DescribeUDiskUpgradePriceResult getDescribeUDiskUpgradePrice(DescribeUDiskUpgradePriceParam param) throws Exception;

    /**
     * 获取云硬盘升级价格
     *
     * @param param     {@link DescribeUDiskUpgradePriceParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void getDescribeUDiskUpgradePrice(DescribeUDiskUpgradePriceParam param, UcloudHandler<DescribeUDiskUpgradePriceResult> handler, Boolean... asyncFlag);

    /**
     * 创建快照
     *
     * @param param {@link CreateUDiskSnapshotParam} 参数对象
     * @return {@link CreateUDiskSnapshotResult}
     * @throws Exception
     */
    CreateUDiskSnapshotResult createUDiskSnapshot(CreateUDiskSnapshotParam param) throws Exception;

    /**
     * 创建快照
     *
     * @param param     {@link CreateUDiskSnapshotParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void createUDiskSnapshot(CreateUDiskSnapshotParam param, UcloudHandler<CreateUDiskSnapshotResult> handler, Boolean... asyncFlag);


    /**
     * 克隆快照
     *
     * @param param {@link CloneUDiskSnapshotParam} 参数对象
     * @return {@link CloneUDiskSnapshotResult}
     * @throws Exception
     */
    CloneUDiskSnapshotResult cloneUDiskSnapshot(CloneUDiskSnapshotParam param) throws Exception;

    /**
     * 克隆快照
     *
     * @param param     {@link CloneUDiskSnapshotParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void cloneUDiskSnapshot(CloneUDiskSnapshotParam param, UcloudHandler<CloneUDiskSnapshotResult> handler, Boolean... asyncFlag);

    /**
     * 拉取回收站中云硬盘列表
     *
     * @param param {@link DescribeRecycleUDiskParam} 参数对象
     * @return {@link DescribeRecycleUDiskResult}
     * @throws Exception
     */
    DescribeRecycleUDiskResult getDescribeRecycleUDisk(DescribeRecycleUDiskParam param) throws Exception;

    /**
     * 拉取回收站中云硬盘列表
     *
     * @param param     {@link DescribeRecycleUDiskParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void getDescribeRecycleUDisk(DescribeRecycleUDiskParam param, UcloudHandler<DescribeRecycleUDiskResult> handler, Boolean... asyncFlag);

    /**
     * 调整云硬盘
     *
     * @param param {@link ResizeUDiskParam} 参数对象
     * @return {@link ResizeUDiskResult}
     * @throws Exception
     */
    ResizeUDiskResult resizeUDisk(ResizeUDiskParam param) throws Exception;

    /**
     * 调整云硬盘
     *
     * @param param     {@link ResizeUDiskParam}   参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void resizeUDisk(ResizeUDiskParam param, UcloudHandler<ResizeUDiskResult> handler, Boolean... asyncFlag);
}
