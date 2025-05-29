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
package cn.ucloud.ucompshare.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ucompshare.models.CreateCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.CreateCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.CreateULHostInstanceRequest;
import cn.ucloud.ucompshare.models.CreateULHostInstanceResponse;
import cn.ucloud.ucompshare.models.DescribeCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.DescribeCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.DescribeULHostBundlesRequest;
import cn.ucloud.ucompshare.models.DescribeULHostBundlesResponse;
import cn.ucloud.ucompshare.models.DescribeULHostInstanceRequest;
import cn.ucloud.ucompshare.models.DescribeULHostInstanceResponse;
import cn.ucloud.ucompshare.models.GetULHostInstancePriceRequest;
import cn.ucloud.ucompshare.models.GetULHostInstancePriceResponse;
import cn.ucloud.ucompshare.models.GetULHostRenewPriceRequest;
import cn.ucloud.ucompshare.models.GetULHostRenewPriceResponse;
import cn.ucloud.ucompshare.models.ModifyULHostAttributeRequest;
import cn.ucloud.ucompshare.models.ModifyULHostAttributeResponse;
import cn.ucloud.ucompshare.models.PoweroffULHostInstanceRequest;
import cn.ucloud.ucompshare.models.PoweroffULHostInstanceResponse;
import cn.ucloud.ucompshare.models.RebootCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.RebootCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.RebootULHostInstanceRequest;
import cn.ucloud.ucompshare.models.RebootULHostInstanceResponse;
import cn.ucloud.ucompshare.models.ReinstallCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.ReinstallCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.ReinstallULHostInstanceRequest;
import cn.ucloud.ucompshare.models.ReinstallULHostInstanceResponse;
import cn.ucloud.ucompshare.models.ResetCompShareInstancePasswordRequest;
import cn.ucloud.ucompshare.models.ResetCompShareInstancePasswordResponse;
import cn.ucloud.ucompshare.models.ResetULHostInstancePasswordRequest;
import cn.ucloud.ucompshare.models.ResetULHostInstancePasswordResponse;
import cn.ucloud.ucompshare.models.StartCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.StartCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.StartULHostInstanceRequest;
import cn.ucloud.ucompshare.models.StartULHostInstanceResponse;
import cn.ucloud.ucompshare.models.StopCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.StopCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.StopULHostInstanceRequest;
import cn.ucloud.ucompshare.models.StopULHostInstanceResponse;
import cn.ucloud.ucompshare.models.TerminateCompShareInstanceRequest;
import cn.ucloud.ucompshare.models.TerminateCompShareInstanceResponse;
import cn.ucloud.ucompshare.models.TerminateULHostInstanceRequest;
import cn.ucloud.ucompshare.models.TerminateULHostInstanceResponse;

/** This client is used to call actions of **UCompShare** service */
public class UCompShareClient extends DefaultClient implements UCompShareClientInterface {
    public UCompShareClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateCompShareInstance - 创建轻量级算力平台主机资源
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCompShareInstanceResponse createCompShareInstance(
            CreateCompShareInstanceRequest request) throws UCloudException {
        request.setAction("CreateCompShareInstance");
        return (CreateCompShareInstanceResponse)
                this.invoke(request, CreateCompShareInstanceResponse.class);
    }

    /**
     * CreateULHostInstance - 创建轻量应用云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateULHostInstanceResponse createULHostInstance(CreateULHostInstanceRequest request)
            throws UCloudException {
        request.setAction("CreateULHostInstance");
        return (CreateULHostInstanceResponse)
                this.invoke(request, CreateULHostInstanceResponse.class);
    }

    /**
     * DescribeCompShareInstance - 获取用户所有地域的主机资源列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCompShareInstanceResponse describeCompShareInstance(
            DescribeCompShareInstanceRequest request) throws UCloudException {
        request.setAction("DescribeCompShareInstance");
        return (DescribeCompShareInstanceResponse)
                this.invoke(request, DescribeCompShareInstanceResponse.class);
    }

    /**
     * DescribeULHostBundles - 获取轻量应用云主机套餐列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULHostBundlesResponse describeULHostBundles(DescribeULHostBundlesRequest request)
            throws UCloudException {
        request.setAction("DescribeULHostBundles");
        return (DescribeULHostBundlesResponse)
                this.invoke(request, DescribeULHostBundlesResponse.class);
    }

    /**
     * DescribeULHostInstance - 获取轻量应用云主机列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeULHostInstanceResponse describeULHostInstance(
            DescribeULHostInstanceRequest request) throws UCloudException {
        request.setAction("DescribeULHostInstance");
        return (DescribeULHostInstanceResponse)
                this.invoke(request, DescribeULHostInstanceResponse.class);
    }

    /**
     * GetULHostInstancePrice - 获取轻量应用云主机套餐价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetULHostInstancePriceResponse getULHostInstancePrice(
            GetULHostInstancePriceRequest request) throws UCloudException {
        request.setAction("GetULHostInstancePrice");
        return (GetULHostInstancePriceResponse)
                this.invoke(request, GetULHostInstancePriceResponse.class);
    }

    /**
     * GetULHostRenewPrice - 获取主机续费价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetULHostRenewPriceResponse getULHostRenewPrice(GetULHostRenewPriceRequest request)
            throws UCloudException {
        request.setAction("GetULHostRenewPrice");
        return (GetULHostRenewPriceResponse)
                this.invoke(request, GetULHostRenewPriceResponse.class);
    }

    /**
     * ModifyULHostAttribute - 修改轻量应用主机属性信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyULHostAttributeResponse modifyULHostAttribute(ModifyULHostAttributeRequest request)
            throws UCloudException {
        request.setAction("ModifyULHostAttribute");
        return (ModifyULHostAttributeResponse)
                this.invoke(request, ModifyULHostAttributeResponse.class);
    }

    /**
     * PoweroffULHostInstance - 模拟主机掉电
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public PoweroffULHostInstanceResponse poweroffULHostInstance(
            PoweroffULHostInstanceRequest request) throws UCloudException {
        request.setAction("PoweroffULHostInstance");
        return (PoweroffULHostInstanceResponse)
                this.invoke(request, PoweroffULHostInstanceResponse.class);
    }

    /**
     * RebootCompShareInstance - 重启轻量算力平台实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RebootCompShareInstanceResponse rebootCompShareInstance(
            RebootCompShareInstanceRequest request) throws UCloudException {
        request.setAction("RebootCompShareInstance");
        return (RebootCompShareInstanceResponse)
                this.invoke(request, RebootCompShareInstanceResponse.class);
    }

    /**
     * RebootULHostInstance - 重启轻量应用云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RebootULHostInstanceResponse rebootULHostInstance(RebootULHostInstanceRequest request)
            throws UCloudException {
        request.setAction("RebootULHostInstance");
        return (RebootULHostInstanceResponse)
                this.invoke(request, RebootULHostInstanceResponse.class);
    }

    /**
     * ReinstallCompShareInstance - 重装算力平台实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReinstallCompShareInstanceResponse reinstallCompShareInstance(
            ReinstallCompShareInstanceRequest request) throws UCloudException {
        request.setAction("ReinstallCompShareInstance");
        return (ReinstallCompShareInstanceResponse)
                this.invoke(request, ReinstallCompShareInstanceResponse.class);
    }

    /**
     * ReinstallULHostInstance - 重装轻量应用云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ReinstallULHostInstanceResponse reinstallULHostInstance(
            ReinstallULHostInstanceRequest request) throws UCloudException {
        request.setAction("ReinstallULHostInstance");
        return (ReinstallULHostInstanceResponse)
                this.invoke(request, ReinstallULHostInstanceResponse.class);
    }

    /**
     * ResetCompShareInstancePassword - 重置算力平台实例密码
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResetCompShareInstancePasswordResponse resetCompShareInstancePassword(
            ResetCompShareInstancePasswordRequest request) throws UCloudException {
        request.setAction("ResetCompShareInstancePassword");
        return (ResetCompShareInstancePasswordResponse)
                this.invoke(request, ResetCompShareInstancePasswordResponse.class);
    }

    /**
     * ResetULHostInstancePassword - 重置轻量应用云主机密码
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResetULHostInstancePasswordResponse resetULHostInstancePassword(
            ResetULHostInstancePasswordRequest request) throws UCloudException {
        request.setAction("ResetULHostInstancePassword");
        return (ResetULHostInstancePasswordResponse)
                this.invoke(request, ResetULHostInstancePasswordResponse.class);
    }

    /**
     * StartCompShareInstance - 启动算力平台实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartCompShareInstanceResponse startCompShareInstance(
            StartCompShareInstanceRequest request) throws UCloudException {
        request.setAction("StartCompShareInstance");
        return (StartCompShareInstanceResponse)
                this.invoke(request, StartCompShareInstanceResponse.class);
    }

    /**
     * StartULHostInstance - 启动轻量应用主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartULHostInstanceResponse startULHostInstance(StartULHostInstanceRequest request)
            throws UCloudException {
        request.setAction("StartULHostInstance");
        return (StartULHostInstanceResponse)
                this.invoke(request, StartULHostInstanceResponse.class);
    }

    /**
     * StopCompShareInstance - 关闭算力平台实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StopCompShareInstanceResponse stopCompShareInstance(StopCompShareInstanceRequest request)
            throws UCloudException {
        request.setAction("StopCompShareInstance");
        return (StopCompShareInstanceResponse)
                this.invoke(request, StopCompShareInstanceResponse.class);
    }

    /**
     * StopULHostInstance - 关闭轻量应用云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StopULHostInstanceResponse stopULHostInstance(StopULHostInstanceRequest request)
            throws UCloudException {
        request.setAction("StopULHostInstance");
        return (StopULHostInstanceResponse) this.invoke(request, StopULHostInstanceResponse.class);
    }

    /**
     * TerminateCompShareInstance - 删除轻量算力共享平台虚机实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public TerminateCompShareInstanceResponse terminateCompShareInstance(
            TerminateCompShareInstanceRequest request) throws UCloudException {
        request.setAction("TerminateCompShareInstance");
        return (TerminateCompShareInstanceResponse)
                this.invoke(request, TerminateCompShareInstanceResponse.class);
    }

    /**
     * TerminateULHostInstance - 删除轻量应用云主机
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public TerminateULHostInstanceResponse terminateULHostInstance(
            TerminateULHostInstanceRequest request) throws UCloudException {
        request.setAction("TerminateULHostInstance");
        return (TerminateULHostInstanceResponse)
                this.invoke(request, TerminateULHostInstanceResponse.class);
    }
}
