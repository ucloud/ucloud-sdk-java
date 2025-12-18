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
package cn.ucloud.ulighthost.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ulighthost.models.CheckULHostResourceCapacityRequest;
import cn.ucloud.ulighthost.models.CheckULHostResourceCapacityResponse;
import cn.ucloud.ulighthost.models.CreateULHostInstanceRequest;
import cn.ucloud.ulighthost.models.CreateULHostInstanceResponse;
import cn.ucloud.ulighthost.models.DescribeULHostBundlesRequest;
import cn.ucloud.ulighthost.models.DescribeULHostBundlesResponse;
import cn.ucloud.ulighthost.models.DescribeULHostImageRequest;
import cn.ucloud.ulighthost.models.DescribeULHostImageResponse;
import cn.ucloud.ulighthost.models.DescribeULHostInstanceRequest;
import cn.ucloud.ulighthost.models.DescribeULHostInstanceResponse;
import cn.ucloud.ulighthost.models.GetULHostInstancePriceRequest;
import cn.ucloud.ulighthost.models.GetULHostInstancePriceResponse;
import cn.ucloud.ulighthost.models.GetULHostRenewPriceRequest;
import cn.ucloud.ulighthost.models.GetULHostRenewPriceResponse;
import cn.ucloud.ulighthost.models.ModifyULHostAttributeRequest;
import cn.ucloud.ulighthost.models.ModifyULHostAttributeResponse;
import cn.ucloud.ulighthost.models.PoweroffULHostInstanceRequest;
import cn.ucloud.ulighthost.models.PoweroffULHostInstanceResponse;
import cn.ucloud.ulighthost.models.RebootULHostInstanceRequest;
import cn.ucloud.ulighthost.models.RebootULHostInstanceResponse;
import cn.ucloud.ulighthost.models.ReinstallULHostInstanceRequest;
import cn.ucloud.ulighthost.models.ReinstallULHostInstanceResponse;
import cn.ucloud.ulighthost.models.ResetULHostInstancePasswordRequest;
import cn.ucloud.ulighthost.models.ResetULHostInstancePasswordResponse;
import cn.ucloud.ulighthost.models.StartULHostInstanceRequest;
import cn.ucloud.ulighthost.models.StartULHostInstanceResponse;
import cn.ucloud.ulighthost.models.StopULHostInstanceRequest;
import cn.ucloud.ulighthost.models.StopULHostInstanceResponse;
import cn.ucloud.ulighthost.models.TerminateULHostInstanceRequest;
import cn.ucloud.ulighthost.models.TerminateULHostInstanceResponse;

/** This client is used to call actions of **ULightHost** service */
public interface ULightHostClientInterface extends Client {

    /**
     * CheckULHostResourceCapacity - 检查轻量应用云主机资源余量
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CheckULHostResourceCapacityResponse checkULHostResourceCapacity(
            CheckULHostResourceCapacityRequest request) throws UCloudException;

    /**
     * CreateULHostInstance - 创建轻量应用云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULHostInstanceResponse createULHostInstance(CreateULHostInstanceRequest request)
            throws UCloudException;

    /**
     * DescribeULHostBundles - 获取轻量应用云主机套餐列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULHostBundlesResponse describeULHostBundles(DescribeULHostBundlesRequest request)
            throws UCloudException;

    /**
     * DescribeULHostImage - 获取轻量应用主机镜像列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULHostImageResponse describeULHostImage(DescribeULHostImageRequest request)
            throws UCloudException;

    /**
     * DescribeULHostInstance - 获取轻量应用云主机列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULHostInstanceResponse describeULHostInstance(
            DescribeULHostInstanceRequest request) throws UCloudException;

    /**
     * GetULHostInstancePrice - 获取轻量应用云主机套餐价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetULHostInstancePriceResponse getULHostInstancePrice(
            GetULHostInstancePriceRequest request) throws UCloudException;

    /**
     * GetULHostRenewPrice - 获取主机续费价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetULHostRenewPriceResponse getULHostRenewPrice(GetULHostRenewPriceRequest request)
            throws UCloudException;

    /**
     * ModifyULHostAttribute - 修改轻量应用主机属性信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyULHostAttributeResponse modifyULHostAttribute(ModifyULHostAttributeRequest request)
            throws UCloudException;

    /**
     * PoweroffULHostInstance - 模拟主机掉电
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public PoweroffULHostInstanceResponse poweroffULHostInstance(
            PoweroffULHostInstanceRequest request) throws UCloudException;

    /**
     * RebootULHostInstance - 重启轻量应用云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RebootULHostInstanceResponse rebootULHostInstance(RebootULHostInstanceRequest request)
            throws UCloudException;

    /**
     * ReinstallULHostInstance - 重装轻量应用云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReinstallULHostInstanceResponse reinstallULHostInstance(
            ReinstallULHostInstanceRequest request) throws UCloudException;

    /**
     * ResetULHostInstancePassword - 重置轻量应用云主机密码
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResetULHostInstancePasswordResponse resetULHostInstancePassword(
            ResetULHostInstancePasswordRequest request) throws UCloudException;

    /**
     * StartULHostInstance - 启动轻量应用主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartULHostInstanceResponse startULHostInstance(StartULHostInstanceRequest request)
            throws UCloudException;

    /**
     * StopULHostInstance - 关闭轻量应用云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StopULHostInstanceResponse stopULHostInstance(StopULHostInstanceRequest request)
            throws UCloudException;

    /**
     * TerminateULHostInstance - 删除轻量应用云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public TerminateULHostInstanceResponse terminateULHostInstance(
            TerminateULHostInstanceRequest request) throws UCloudException;
}
