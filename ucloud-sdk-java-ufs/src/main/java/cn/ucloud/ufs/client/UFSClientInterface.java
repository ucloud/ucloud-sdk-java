/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.ufs.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ufs.models.AddUFSVolumeMountPointRequest;
import cn.ucloud.ufs.models.AddUFSVolumeMountPointResponse;
import cn.ucloud.ufs.models.CreateUFSVolumeRequest;
import cn.ucloud.ufs.models.CreateUFSVolumeResponse;
import cn.ucloud.ufs.models.DescribeUFSVolume2Request;
import cn.ucloud.ufs.models.DescribeUFSVolume2Response;
import cn.ucloud.ufs.models.DescribeUFSVolumeMountpointRequest;
import cn.ucloud.ufs.models.DescribeUFSVolumeMountpointResponse;
import cn.ucloud.ufs.models.ExtendUFSVolumeRequest;
import cn.ucloud.ufs.models.ExtendUFSVolumeResponse;
import cn.ucloud.ufs.models.RemoveUFSVolumeMountPointRequest;
import cn.ucloud.ufs.models.RemoveUFSVolumeMountPointResponse;
import cn.ucloud.ufs.models.RemoveUFSVolumeRequest;
import cn.ucloud.ufs.models.RemoveUFSVolumeResponse;
import cn.ucloud.ufs.models.UpdateUFSVolumeInfoRequest;
import cn.ucloud.ufs.models.UpdateUFSVolumeInfoResponse;

/** This client is used to call actions of **UFS** service */
public interface UFSClientInterface extends Client {

    /**
     * AddUFSVolumeMountPoint - 添加文件系统挂载点
     *
     * <p>See also: https://docs.ucloud.cn/api/ufs-api/AddUFSVolumeMountPoint
     */
    public AddUFSVolumeMountPointResponse addUFSVolumeMountPoint(
            AddUFSVolumeMountPointRequest request) throws UCloudException;

    /**
     * CreateUFSVolume - 创建文件系统
     *
     * <p>See also: https://docs.ucloud.cn/api/ufs-api/CreateUFSVolume
     */
    public CreateUFSVolumeResponse createUFSVolume(CreateUFSVolumeRequest request)
            throws UCloudException;

    /**
     * DescribeUFSVolume2 - 获取文件系统列表
     *
     * <p>See also: https://docs.ucloud.cn/api/ufs-api/DescribeUFSVolume2
     */
    public DescribeUFSVolume2Response describeUFSVolume2(DescribeUFSVolume2Request request)
            throws UCloudException;

    /**
     * DescribeUFSVolumeMountpoint - 获取文件系统挂载点信息
     *
     * <p>See also: https://docs.ucloud.cn/api/ufs-api/DescribeUFSVolumeMountpoint
     */
    public DescribeUFSVolumeMountpointResponse describeUFSVolumeMountpoint(
            DescribeUFSVolumeMountpointRequest request) throws UCloudException;

    /**
     * ExtendUFSVolume - 文件系统扩容
     *
     * <p>See also: https://docs.ucloud.cn/api/ufs-api/ExtendUFSVolume
     */
    public ExtendUFSVolumeResponse extendUFSVolume(ExtendUFSVolumeRequest request)
            throws UCloudException;

    /**
     * RemoveUFSVolume - 删除文件系统
     *
     * <p>See also: https://docs.ucloud.cn/api/ufs-api/RemoveUFSVolume
     */
    public RemoveUFSVolumeResponse removeUFSVolume(RemoveUFSVolumeRequest request)
            throws UCloudException;

    /**
     * RemoveUFSVolumeMountPoint - 删除文件系统挂载点
     *
     * <p>See also: https://docs.ucloud.cn/api/ufs-api/RemoveUFSVolumeMountPoint
     */
    public RemoveUFSVolumeMountPointResponse removeUFSVolumeMountPoint(
            RemoveUFSVolumeMountPointRequest request) throws UCloudException;

    /**
     * UpdateUFSVolumeInfo - 更改文件系统相关信息（名称／备注）
     *
     * <p>See also: https://docs.ucloud.cn/api/ufs-api/UpdateUFSVolumeInfo
     */
    public UpdateUFSVolumeInfoResponse updateUFSVolumeInfo(UpdateUFSVolumeInfoRequest request)
            throws UCloudException;
}
