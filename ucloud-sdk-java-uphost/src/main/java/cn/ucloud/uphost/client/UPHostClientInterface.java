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
package cn.ucloud.uphost.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uphost.models.CreatePHostImageRequest;
import cn.ucloud.uphost.models.CreatePHostImageResponse;
import cn.ucloud.uphost.models.CreatePHostRequest;
import cn.ucloud.uphost.models.CreatePHostResponse;
import cn.ucloud.uphost.models.DescribeBaremetalMachineTypeRequest;
import cn.ucloud.uphost.models.DescribeBaremetalMachineTypeResponse;
import cn.ucloud.uphost.models.DescribePHostImageRequest;
import cn.ucloud.uphost.models.DescribePHostImageResponse;
import cn.ucloud.uphost.models.DescribePHostMachineTypeRequest;
import cn.ucloud.uphost.models.DescribePHostMachineTypeResponse;
import cn.ucloud.uphost.models.DescribePHostRequest;
import cn.ucloud.uphost.models.DescribePHostResponse;
import cn.ucloud.uphost.models.DescribePHostTagsRequest;
import cn.ucloud.uphost.models.DescribePHostTagsResponse;
import cn.ucloud.uphost.models.GetPHostDiskUpgradePriceRequest;
import cn.ucloud.uphost.models.GetPHostDiskUpgradePriceResponse;
import cn.ucloud.uphost.models.GetPHostPriceRequest;
import cn.ucloud.uphost.models.GetPHostPriceResponse;
import cn.ucloud.uphost.models.ModifyPHostImageInfoRequest;
import cn.ucloud.uphost.models.ModifyPHostImageInfoResponse;
import cn.ucloud.uphost.models.ModifyPHostInfoRequest;
import cn.ucloud.uphost.models.ModifyPHostInfoResponse;
import cn.ucloud.uphost.models.PoweroffPHostRequest;
import cn.ucloud.uphost.models.PoweroffPHostResponse;
import cn.ucloud.uphost.models.RebootPHostRequest;
import cn.ucloud.uphost.models.RebootPHostResponse;
import cn.ucloud.uphost.models.ReinstallPHostRequest;
import cn.ucloud.uphost.models.ReinstallPHostResponse;
import cn.ucloud.uphost.models.ResetPHostPasswordRequest;
import cn.ucloud.uphost.models.ResetPHostPasswordResponse;
import cn.ucloud.uphost.models.ResizePHostAttachedDiskRequest;
import cn.ucloud.uphost.models.ResizePHostAttachedDiskResponse;
import cn.ucloud.uphost.models.StartPHostRequest;
import cn.ucloud.uphost.models.StartPHostResponse;
import cn.ucloud.uphost.models.StopPHostRequest;
import cn.ucloud.uphost.models.StopPHostResponse;
import cn.ucloud.uphost.models.TerminatePHostImageRequest;
import cn.ucloud.uphost.models.TerminatePHostImageResponse;
import cn.ucloud.uphost.models.TerminatePHostRequest;
import cn.ucloud.uphost.models.TerminatePHostResponse;

/** This client is used to call actions of **UPHost** service */
public interface UPHostClientInterface extends Client {

    /**
     * CreatePHost - 创建物理机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CreatePHostResponse createPHost(CreatePHostRequest request) throws UCloudException;

    /**
     * CreatePHostImage - 创建裸金属2.0用户自定义镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    CreatePHostImageResponse createPHostImage(CreatePHostImageRequest request)
            throws UCloudException;

    /**
     * DescribeBaremetalMachineType - 获取裸金属机型的详细信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribeBaremetalMachineTypeResponse describeBaremetalMachineType(
            DescribeBaremetalMachineTypeRequest request) throws UCloudException;

    /**
     * DescribePHost - 获取物理机信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribePHostResponse describePHost(DescribePHostRequest request) throws UCloudException;

    /**
     * DescribePHostImage - 获取物理机镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribePHostImageResponse describePHostImage(DescribePHostImageRequest request)
            throws UCloudException;

    /**
     * DescribePHostMachineType - 获取物理云机型信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribePHostMachineTypeResponse describePHostMachineType(
            DescribePHostMachineTypeRequest request) throws UCloudException;

    /**
     * DescribePHostTags - 获取物理机业务组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    DescribePHostTagsResponse describePHostTags(DescribePHostTagsRequest request)
            throws UCloudException;

    /**
     * GetPHostDiskUpgradePrice - 获取物理云裸金属挂载云盘的升级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    GetPHostDiskUpgradePriceResponse getPHostDiskUpgradePrice(
            GetPHostDiskUpgradePriceRequest request) throws UCloudException;

    /**
     * GetPHostPrice - 获取物理机价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    GetPHostPriceResponse getPHostPrice(GetPHostPriceRequest request) throws UCloudException;

    /**
     * ModifyPHostImageInfo - 修改物理云自定义镜像信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    ModifyPHostImageInfoResponse modifyPHostImageInfo(ModifyPHostImageInfoRequest request)
            throws UCloudException;

    /**
     * ModifyPHostInfo - 更改物理机信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    ModifyPHostInfoResponse modifyPHostInfo(ModifyPHostInfoRequest request) throws UCloudException;

    /**
     * PoweroffPHost - 断电物理机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    PoweroffPHostResponse poweroffPHost(PoweroffPHostRequest request) throws UCloudException;

    /**
     * RebootPHost - 重启物理机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    RebootPHostResponse rebootPHost(RebootPHostRequest request) throws UCloudException;

    /**
     * ReinstallPHost - 重装物理机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    ReinstallPHostResponse reinstallPHost(ReinstallPHostRequest request) throws UCloudException;

    /**
     * ResetPHostPassword - 重置实例密码
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    ResetPHostPasswordResponse resetPHostPassword(ResetPHostPasswordRequest request)
            throws UCloudException;

    /**
     * ResizePHostAttachedDisk - 修改挂载的磁盘大小
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    ResizePHostAttachedDiskResponse resizePHostAttachedDisk(ResizePHostAttachedDiskRequest request)
            throws UCloudException;

    /**
     * StartPHost - 启动物理机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    StartPHostResponse startPHost(StartPHostRequest request) throws UCloudException;

    /**
     * StopPHost - 关闭物理机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    StopPHostResponse stopPHost(StopPHostRequest request) throws UCloudException;

    /**
     * TerminatePHost - 删除物理机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    TerminatePHostResponse terminatePHost(TerminatePHostRequest request) throws UCloudException;

    /**
     * TerminatePHostImage - 删除裸金属2.0用户自定义镜像
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    TerminatePHostImageResponse terminatePHostImage(TerminatePHostImageRequest request)
            throws UCloudException;
}
