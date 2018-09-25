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
}
