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
package cn.ucloud.uddb.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uddb.models.ChangeUDDBInstanceNameRequest;
import cn.ucloud.uddb.models.ChangeUDDBInstanceNameResponse;
import cn.ucloud.uddb.models.ChangeUDDBSlaveCountRequest;
import cn.ucloud.uddb.models.ChangeUDDBSlaveCountResponse;
import cn.ucloud.uddb.models.CreateUDDBInstanceRequest;
import cn.ucloud.uddb.models.CreateUDDBInstanceResponse;
import cn.ucloud.uddb.models.DeleteUDDBInstanceRequest;
import cn.ucloud.uddb.models.DeleteUDDBInstanceResponse;
import cn.ucloud.uddb.models.DescribeUDDBInstancePriceRequest;
import cn.ucloud.uddb.models.DescribeUDDBInstancePriceResponse;
import cn.ucloud.uddb.models.DescribeUDDBInstanceRequest;
import cn.ucloud.uddb.models.DescribeUDDBInstanceResponse;
import cn.ucloud.uddb.models.DescribeUDDBInstanceUpgradePriceRequest;
import cn.ucloud.uddb.models.DescribeUDDBInstanceUpgradePriceResponse;
import cn.ucloud.uddb.models.RestartUDDBInstanceRequest;
import cn.ucloud.uddb.models.RestartUDDBInstanceResponse;
import cn.ucloud.uddb.models.StartUDDBInstanceRequest;
import cn.ucloud.uddb.models.StartUDDBInstanceResponse;
import cn.ucloud.uddb.models.StopUDDBInstanceRequest;
import cn.ucloud.uddb.models.StopUDDBInstanceResponse;
import cn.ucloud.uddb.models.UpgradeUDDBDataNodeRequest;
import cn.ucloud.uddb.models.UpgradeUDDBDataNodeResponse;
import cn.ucloud.uddb.models.UpgradeUDDBInstanceRequest;
import cn.ucloud.uddb.models.UpgradeUDDBInstanceResponse;

/** This client is used to call actions of **UDDB** service */
public class UDDBClient extends DefaultClient implements UDDBClientInterface {
    public UDDBClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * ChangeUDDBInstanceName - 修改分布式数据库中间件名称
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/ChangeUDDBInstanceName
     */
    public ChangeUDDBInstanceNameResponse changeUDDBInstanceName(
            ChangeUDDBInstanceNameRequest request) throws UCloudException {
        request.setAction("ChangeUDDBInstanceName");
        return (ChangeUDDBInstanceNameResponse)
                this.invoke(request, ChangeUDDBInstanceNameResponse.class);
    }

    /**
     * ChangeUDDBSlaveCount - 改变分布式数据库数据节点的只读实例个数
     * 每一个UDDB的数据节点负责处理所有的写入请求。与此同时，每一个数据节点可以配置若干个该节点的只读实例。当主节点的数据写入完毕后，只读实例把这次的写入操作进行更新，从而和数据节点保持一致。
     * 只读实例可以使得数据由多份复制，在数据节点和只读实例之间，可以做请求的读写分离, 也就是说, 主节点写入数据之后, 数据的读操作可以由数据只读实例进行分担, 这样减少主节点的压力,
     * 增加性能 当改变了数据节点的只读实例个数之后，对于现有的和以后的每一个数据节点都采用这个配置。如果UDDB实例有现有的数据节点,
     * 那么它会根据新配置的参数，自动创建或删除数据节点的只读实例 如下状态的UDDB实例可以进行这个操作: Running: 系统正常运行中
     * 当请求返回成功之后，UDDB实例的状态变成"ChangingSlaveCount"; 如果返回失败, UDDB实例状态保持不变 当UDDB更改数据分区的只读实例个数成功之后,
     * UDDB实例的状态变成"Running"(正常运行中); 如果更改过程中出现异常, 状态变成"Abnormal"(异常运行中)或者"Error"(运行错误)
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/ChangeUDDBSlaveCount
     */
    public ChangeUDDBSlaveCountResponse changeUDDBSlaveCount(ChangeUDDBSlaveCountRequest request)
            throws UCloudException {
        request.setAction("ChangeUDDBSlaveCount");
        return (ChangeUDDBSlaveCountResponse)
                this.invoke(request, ChangeUDDBSlaveCountResponse.class);
    }

    /**
     * CreateUDDBInstance - 创建创建分布式数据库UDDB实例, 简称UDDB实例。
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/CreateUDDBInstance
     */
    public CreateUDDBInstanceResponse createUDDBInstance(CreateUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("CreateUDDBInstance");
        return (CreateUDDBInstanceResponse) this.invoke(request, CreateUDDBInstanceResponse.class);
    }

    /**
     * DeleteUDDBInstance - 删除UDDB实例。 如下状态的UDDB实例可以进行这个操作: InitFail: 初始化失败 Shutoff: 已关闭
     * 当请求返回成功之后，UDDB实例就已经被删除, 列表上看不到对应的UDDB实例
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/DeleteUDDBInstance
     */
    public DeleteUDDBInstanceResponse deleteUDDBInstance(DeleteUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("DeleteUDDBInstance");
        return (DeleteUDDBInstanceResponse) this.invoke(request, DeleteUDDBInstanceResponse.class);
    }

    /**
     * DescribeUDDBInstance - 获取分布式数据库UDDB的详细信息
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/DescribeUDDBInstance
     */
    public DescribeUDDBInstanceResponse describeUDDBInstance(DescribeUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("DescribeUDDBInstance");
        return (DescribeUDDBInstanceResponse)
                this.invoke(request, DescribeUDDBInstanceResponse.class);
    }

    /**
     * DescribeUDDBInstancePrice - 获取分布式数据库UDDB价格
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/DescribeUDDBInstancePrice
     */
    public DescribeUDDBInstancePriceResponse describeUDDBInstancePrice(
            DescribeUDDBInstancePriceRequest request) throws UCloudException {
        request.setAction("DescribeUDDBInstancePrice");
        return (DescribeUDDBInstancePriceResponse)
                this.invoke(request, DescribeUDDBInstancePriceResponse.class);
    }

    /**
     * DescribeUDDBInstanceUpgradePrice - 升级UDDB时，获取升级后的价格
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/DescribeUDDBInstanceUpgradePrice
     */
    public DescribeUDDBInstanceUpgradePriceResponse describeUDDBInstanceUpgradePrice(
            DescribeUDDBInstanceUpgradePriceRequest request) throws UCloudException {
        request.setAction("DescribeUDDBInstanceUpgradePrice");
        return (DescribeUDDBInstanceUpgradePriceResponse)
                this.invoke(request, DescribeUDDBInstanceUpgradePriceResponse.class);
    }

    /**
     * RestartUDDBInstance - 重启UDDB实例，开始提供服务。
     *
     * <p>如下状态的UDDB实例可以进行这个操作:
     *
     * <p>Running: 正常运行中 Abnormal: 异常运行中 当请求返回成功之后，UDDB实例的状态变成"Starting"(启动中); 如果返回失败, UDDB实例状态保持不变
     * UDDB实例在重启过程中, 当UDDB实例启动成功之后, UDDB实例的状态变成"Running"(正常运行中); 如果启动过程中出现异常, 状态变成"Abnormal"(异常运行中),
     * 或者"Shutoff"(已关闭
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/RestartUDDBInstance
     */
    public RestartUDDBInstanceResponse restartUDDBInstance(RestartUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("RestartUDDBInstance");
        return (RestartUDDBInstanceResponse)
                this.invoke(request, RestartUDDBInstanceResponse.class);
    }

    /**
     * StartUDDBInstance - 启动UDDB实例，开始提供服务。
     *
     * <p>如下状态的UDDB实例可以进行这个操作:
     *
     * <p>Shutoff: 已关闭 当请求返回成功之后，UDDB实例的状态变成"Starting"(启动中); 如果返回失败, UDDB实例状态保持不变 UDDB实例在启动过程中,
     * 当UDDB实例启动成功之后, UDDB实例的状态变成"Running"(正常运行中); 如果启动过程中出现异常, 状态变成"Abnormal"(异常运行中),
     * 或者"Shutoff"(已关闭)
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/StartUDDBInstance
     */
    public StartUDDBInstanceResponse startUDDBInstance(StartUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("StartUDDBInstance");
        return (StartUDDBInstanceResponse) this.invoke(request, StartUDDBInstanceResponse.class);
    }

    /**
     * StopUDDBInstance - 关闭UDDB实例，停止提供服务。
     *
     * <p>如下状态的UDDB实例可以进行这个操作:
     *
     * <p>Running: 正常运行中 Abnormal: 异常运行中 当请求返回成功之后，UDDB实例的状态变成"Shutdown"(关闭中); 如果返回失败, UDDB实例状态保持不变
     * UDDB实例在关闭过程中, 当UDDB实例关闭成功之后, UDDB实例的状态变成"Shutoff"(已关闭); 如果关闭过程中出现异常, 根据UDDB实例的情况,
     * 状态变成"Abnormal"(异常运行中), 或者"Running"(正常运行中)
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/StopUDDBInstance
     */
    public StopUDDBInstanceResponse stopUDDBInstance(StopUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("StopUDDBInstance");
        return (StopUDDBInstanceResponse) this.invoke(request, StopUDDBInstanceResponse.class);
    }

    /**
     * UpgradeUDDBDataNode - 升降级分布式数据库数据节点的配置, 提高/降低数据节点的数据容量和内存
     *
     * <p>所有数据节点以及其所挂载的只读实例的配置都受到影响
     *
     * <p>升降级数据节点的配置之后之后, 会按照数据节点新的磁盘和内存大小重新计费
     *
     * <p>如下状态的数据节点实例可以进行这个操作:
     *
     * <p>Shutoff: 已关闭 当请求返回成功之后，UDDB实例的状态变成"UpgradingDataNode"，相关数据节点的状态变成"Upgrading"; 如果返回失败,
     * UDDB实例状态保持不变 当UDDB实例升级结束之后, UDDB实例的状态变成"Shutoff"
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/UpgradeUDDBDataNode
     */
    public UpgradeUDDBDataNodeResponse upgradeUDDBDataNode(UpgradeUDDBDataNodeRequest request)
            throws UCloudException {
        request.setAction("UpgradeUDDBDataNode");
        return (UpgradeUDDBDataNodeResponse)
                this.invoke(request, UpgradeUDDBDataNodeResponse.class);
    }

    /**
     * UpgradeUDDBInstance - 升降级分布式数据库中间件的配置, 提高/降低请求处理的并发性
     *
     * <p>修改请求处理节点个数之后, 按照所有请求处理节点的总内存容量和CPU核数重新计费
     *
     * <p>如下状态的UDDB实例可以进行这个操作:
     *
     * <p>Running: 系统正常运行中 当请求返回成功之后，UDDB实例的状态变成"UpgradingUDDB"; 如果返回失败, UDDB实例状态保持不变 当UDDB实例升级成功之后,
     * UDDB实例的状态变成"Running"; 如果更改过程中出现异常, 状态变成"Abnormal", 或者"Error"
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/UpgradeUDDBInstance
     */
    public UpgradeUDDBInstanceResponse upgradeUDDBInstance(UpgradeUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("UpgradeUDDBInstance");
        return (UpgradeUDDBInstanceResponse)
                this.invoke(request, UpgradeUDDBInstanceResponse.class);
    }
}
