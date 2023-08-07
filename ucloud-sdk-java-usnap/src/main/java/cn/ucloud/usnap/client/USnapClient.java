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
package cn.ucloud.usnap.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.usnap.models.CreateSnapshotServiceRequest;
import cn.ucloud.usnap.models.CreateSnapshotServiceResponse;
import cn.ucloud.usnap.models.DeleteSnapshotServiceRequest;
import cn.ucloud.usnap.models.DeleteSnapshotServiceResponse;
import cn.ucloud.usnap.models.DescribeSnapshotServicePriceRequest;
import cn.ucloud.usnap.models.DescribeSnapshotServicePriceResponse;
import cn.ucloud.usnap.models.DescribeSnapshotServiceRequest;
import cn.ucloud.usnap.models.DescribeSnapshotServiceResponse;
import cn.ucloud.usnap.models.DescribeSnapshotServiceUpgradePriceRequest;
import cn.ucloud.usnap.models.DescribeSnapshotServiceUpgradePriceResponse;

/** This client is used to call actions of **USnap** service */
public class USnapClient extends DefaultClient implements USnapClientInterface {
    public USnapClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateSnapshotService - 创建磁盘快照服务
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateSnapshotServiceResponse createSnapshotService(CreateSnapshotServiceRequest request)
            throws UCloudException {
        request.setAction("CreateSnapshotService");
        return (CreateSnapshotServiceResponse)
                this.invoke(request, CreateSnapshotServiceResponse.class);
    }

    /**
     * DeleteSnapshotService - 删除磁盘快照服务
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteSnapshotServiceResponse deleteSnapshotService(DeleteSnapshotServiceRequest request)
            throws UCloudException {
        request.setAction("DeleteSnapshotService");
        return (DeleteSnapshotServiceResponse)
                this.invoke(request, DeleteSnapshotServiceResponse.class);
    }

    /**
     * DescribeSnapshotService - 获取磁盘快照服务列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSnapshotServiceResponse describeSnapshotService(
            DescribeSnapshotServiceRequest request) throws UCloudException {
        request.setAction("DescribeSnapshotService");
        return (DescribeSnapshotServiceResponse)
                this.invoke(request, DescribeSnapshotServiceResponse.class);
    }

    /**
     * DescribeSnapshotServicePrice - 获取磁盘快照服务价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSnapshotServicePriceResponse describeSnapshotServicePrice(
            DescribeSnapshotServicePriceRequest request) throws UCloudException {
        request.setAction("DescribeSnapshotServicePrice");
        return (DescribeSnapshotServicePriceResponse)
                this.invoke(request, DescribeSnapshotServicePriceResponse.class);
    }

    /**
     * DescribeSnapshotServiceUpgradePrice - 获取快照服务升降级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeSnapshotServiceUpgradePriceResponse describeSnapshotServiceUpgradePrice(
            DescribeSnapshotServiceUpgradePriceRequest request) throws UCloudException {
        request.setAction("DescribeSnapshotServiceUpgradePrice");
        return (DescribeSnapshotServiceUpgradePriceResponse)
                this.invoke(request, DescribeSnapshotServiceUpgradePriceResponse.class);
    }
}
