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
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ChangeUDDBInstanceNameResponse changeUDDBInstanceName(
            ChangeUDDBInstanceNameRequest request) throws UCloudException {
        request.setAction("ChangeUDDBInstanceName");
        return (ChangeUDDBInstanceNameResponse)
                this.invoke(request, ChangeUDDBInstanceNameResponse.class);
    }

    /**
     * ChangeUDDBSlaveCount - 改变分布式数据库数据节点的只读实例个数
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ChangeUDDBSlaveCountResponse changeUDDBSlaveCount(ChangeUDDBSlaveCountRequest request)
            throws UCloudException {
        request.setAction("ChangeUDDBSlaveCount");
        return (ChangeUDDBSlaveCountResponse)
                this.invoke(request, ChangeUDDBSlaveCountResponse.class);
    }

    /**
     * CreateUDDBInstance - 创建分布式数据库UDDB
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUDDBInstanceResponse createUDDBInstance(CreateUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("CreateUDDBInstance");
        return (CreateUDDBInstanceResponse) this.invoke(request, CreateUDDBInstanceResponse.class);
    }

    /**
     * DeleteUDDBInstance - 删除UDDB实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUDDBInstanceResponse deleteUDDBInstance(DeleteUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("DeleteUDDBInstance");
        return (DeleteUDDBInstanceResponse) this.invoke(request, DeleteUDDBInstanceResponse.class);
    }

    /**
     * DescribeUDDBInstance - 获取分布式数据库UDDB的详细信息
     *
     * @param request Request object
     * @throws UCloudException Exception
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
     * @param request Request object
     * @throws UCloudException Exception
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
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUDDBInstanceUpgradePriceResponse describeUDDBInstanceUpgradePrice(
            DescribeUDDBInstanceUpgradePriceRequest request) throws UCloudException {
        request.setAction("DescribeUDDBInstanceUpgradePrice");
        return (DescribeUDDBInstanceUpgradePriceResponse)
                this.invoke(request, DescribeUDDBInstanceUpgradePriceResponse.class);
    }

    /**
     * RestartUDDBInstance - 重启UDDB实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RestartUDDBInstanceResponse restartUDDBInstance(RestartUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("RestartUDDBInstance");
        return (RestartUDDBInstanceResponse)
                this.invoke(request, RestartUDDBInstanceResponse.class);
    }

    /**
     * StartUDDBInstance - 启动UDDB实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartUDDBInstanceResponse startUDDBInstance(StartUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("StartUDDBInstance");
        return (StartUDDBInstanceResponse) this.invoke(request, StartUDDBInstanceResponse.class);
    }

    /**
     * StopUDDBInstance - 关闭UDDB实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StopUDDBInstanceResponse stopUDDBInstance(StopUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("StopUDDBInstance");
        return (StopUDDBInstanceResponse) this.invoke(request, StopUDDBInstanceResponse.class);
    }

    /**
     * UpgradeUDDBDataNode - 升降级分布式数据库数据节点的配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpgradeUDDBDataNodeResponse upgradeUDDBDataNode(UpgradeUDDBDataNodeRequest request)
            throws UCloudException {
        request.setAction("UpgradeUDDBDataNode");
        return (UpgradeUDDBDataNodeResponse)
                this.invoke(request, UpgradeUDDBDataNodeResponse.class);
    }

    /**
     * UpgradeUDDBInstance - 升降级分布式数据库中间件的配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpgradeUDDBInstanceResponse upgradeUDDBInstance(UpgradeUDDBInstanceRequest request)
            throws UCloudException {
        request.setAction("UpgradeUDDBInstance");
        return (UpgradeUDDBInstanceResponse)
                this.invoke(request, UpgradeUDDBInstanceResponse.class);
    }
}
