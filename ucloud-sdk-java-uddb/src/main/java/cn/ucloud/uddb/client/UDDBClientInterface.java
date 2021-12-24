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

import cn.ucloud.common.client.Client;
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
public interface UDDBClientInterface extends Client {

    /**
     * ChangeUDDBInstanceName - 修改分布式数据库中间件名称
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/ChangeUDDBInstanceName
     */
    public ChangeUDDBInstanceNameResponse changeUDDBInstanceName(
            ChangeUDDBInstanceNameRequest request) throws UCloudException;

    /**
     * ChangeUDDBSlaveCount - 改变分布式数据库数据节点的只读实例个数
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/ChangeUDDBSlaveCount
     */
    public ChangeUDDBSlaveCountResponse changeUDDBSlaveCount(ChangeUDDBSlaveCountRequest request)
            throws UCloudException;

    /**
     * CreateUDDBInstance - 创建分布式数据库UDDB
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/CreateUDDBInstance
     */
    public CreateUDDBInstanceResponse createUDDBInstance(CreateUDDBInstanceRequest request)
            throws UCloudException;

    /**
     * DeleteUDDBInstance - 删除UDDB实例
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/DeleteUDDBInstance
     */
    public DeleteUDDBInstanceResponse deleteUDDBInstance(DeleteUDDBInstanceRequest request)
            throws UCloudException;

    /**
     * DescribeUDDBInstance - 获取分布式数据库UDDB的详细信息
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/DescribeUDDBInstance
     */
    public DescribeUDDBInstanceResponse describeUDDBInstance(DescribeUDDBInstanceRequest request)
            throws UCloudException;

    /**
     * DescribeUDDBInstancePrice - 获取分布式数据库UDDB价格
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/DescribeUDDBInstancePrice
     */
    public DescribeUDDBInstancePriceResponse describeUDDBInstancePrice(
            DescribeUDDBInstancePriceRequest request) throws UCloudException;

    /**
     * DescribeUDDBInstanceUpgradePrice - 升级UDDB时，获取升级后的价格
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/DescribeUDDBInstanceUpgradePrice
     */
    public DescribeUDDBInstanceUpgradePriceResponse describeUDDBInstanceUpgradePrice(
            DescribeUDDBInstanceUpgradePriceRequest request) throws UCloudException;

    /**
     * RestartUDDBInstance - 重启UDDB实例
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/RestartUDDBInstance
     */
    public RestartUDDBInstanceResponse restartUDDBInstance(RestartUDDBInstanceRequest request)
            throws UCloudException;

    /**
     * StartUDDBInstance - 启动UDDB实例
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/StartUDDBInstance
     */
    public StartUDDBInstanceResponse startUDDBInstance(StartUDDBInstanceRequest request)
            throws UCloudException;

    /**
     * StopUDDBInstance - 关闭UDDB实例
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/StopUDDBInstance
     */
    public StopUDDBInstanceResponse stopUDDBInstance(StopUDDBInstanceRequest request)
            throws UCloudException;

    /**
     * UpgradeUDDBDataNode - 升降级分布式数据库数据节点的配置
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/UpgradeUDDBDataNode
     */
    public UpgradeUDDBDataNodeResponse upgradeUDDBDataNode(UpgradeUDDBDataNodeRequest request)
            throws UCloudException;

    /**
     * UpgradeUDDBInstance - 升降级分布式数据库中间件的配置
     *
     * <p>See also: https://docs.ucloud.cn/api/uddb-api/UpgradeUDDBInstance
     */
    public UpgradeUDDBInstanceResponse upgradeUDDBInstance(UpgradeUDDBInstanceRequest request)
            throws UCloudException;
}
