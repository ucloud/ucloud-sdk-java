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
package cn.ucloud.ues.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ues.models.CreateUESInstanceRequest;
import cn.ucloud.ues.models.CreateUESInstanceResponse;
import cn.ucloud.ues.models.DeleteUESInstanceRequest;
import cn.ucloud.ues.models.DeleteUESInstanceResponse;
import cn.ucloud.ues.models.DescribeUESInstanceV2Request;
import cn.ucloud.ues.models.DescribeUESInstanceV2Response;
import cn.ucloud.ues.models.ExpandUESInstanceRequest;
import cn.ucloud.ues.models.ExpandUESInstanceResponse;
import cn.ucloud.ues.models.GetUESAppVersionRequest;
import cn.ucloud.ues.models.GetUESAppVersionResponse;
import cn.ucloud.ues.models.GetUESDiskSizeLimitationRequest;
import cn.ucloud.ues.models.GetUESDiskSizeLimitationResponse;
import cn.ucloud.ues.models.GetUESNodeConfRequest;
import cn.ucloud.ues.models.GetUESNodeConfResponse;
import cn.ucloud.ues.models.ListUESInstanceRequest;
import cn.ucloud.ues.models.ListUESInstanceResponse;
import cn.ucloud.ues.models.ResizeUESInstanceRequest;
import cn.ucloud.ues.models.ResizeUESInstanceResponse;
import cn.ucloud.ues.models.RestartUESInstanceRequest;
import cn.ucloud.ues.models.RestartUESInstanceResponse;

/** This client is used to call actions of **UES** service */
public class UESClient extends DefaultClient implements UESClientInterface {
    public UESClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateUESInstance - 创建实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUESInstanceResponse createUESInstance(CreateUESInstanceRequest request)
            throws UCloudException {
        request.setAction("CreateUESInstance");
        return (CreateUESInstanceResponse) this.invoke(request, CreateUESInstanceResponse.class);
    }

    /**
     * DeleteUESInstance - 删除实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUESInstanceResponse deleteUESInstance(DeleteUESInstanceRequest request)
            throws UCloudException {
        request.setAction("DeleteUESInstance");
        return (DeleteUESInstanceResponse) this.invoke(request, DeleteUESInstanceResponse.class);
    }

    /**
     * DescribeUESInstanceV2 - 查询指定实例详细信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUESInstanceV2Response describeUESInstanceV2(DescribeUESInstanceV2Request request)
            throws UCloudException {
        request.setAction("DescribeUESInstanceV2");
        return (DescribeUESInstanceV2Response)
                this.invoke(request, DescribeUESInstanceV2Response.class);
    }

    /**
     * ExpandUESInstance - 扩容实例节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ExpandUESInstanceResponse expandUESInstance(ExpandUESInstanceRequest request)
            throws UCloudException {
        request.setAction("ExpandUESInstance");
        return (ExpandUESInstanceResponse) this.invoke(request, ExpandUESInstanceResponse.class);
    }

    /**
     * GetUESAppVersion - 获取服务应用版本列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUESAppVersionResponse getUESAppVersion(GetUESAppVersionRequest request)
            throws UCloudException {
        request.setAction("GetUESAppVersion");
        return (GetUESAppVersionResponse) this.invoke(request, GetUESAppVersionResponse.class);
    }

    /**
     * GetUESDiskSizeLimitation - 获取磁盘容量限制
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUESDiskSizeLimitationResponse getUESDiskSizeLimitation(
            GetUESDiskSizeLimitationRequest request) throws UCloudException {
        request.setAction("GetUESDiskSizeLimitation");
        return (GetUESDiskSizeLimitationResponse)
                this.invoke(request, GetUESDiskSizeLimitationResponse.class);
    }

    /**
     * GetUESNodeConf - 获取节点配置列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUESNodeConfResponse getUESNodeConf(GetUESNodeConfRequest request)
            throws UCloudException {
        request.setAction("GetUESNodeConf");
        return (GetUESNodeConfResponse) this.invoke(request, GetUESNodeConfResponse.class);
    }

    /**
     * ListUESInstance - 实例列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUESInstanceResponse listUESInstance(ListUESInstanceRequest request)
            throws UCloudException {
        request.setAction("ListUESInstance");
        return (ListUESInstanceResponse) this.invoke(request, ListUESInstanceResponse.class);
    }

    /**
     * ResizeUESInstance - 改配实例节点配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResizeUESInstanceResponse resizeUESInstance(ResizeUESInstanceRequest request)
            throws UCloudException {
        request.setAction("ResizeUESInstance");
        return (ResizeUESInstanceResponse) this.invoke(request, ResizeUESInstanceResponse.class);
    }

    /**
     * RestartUESInstance - 重启实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RestartUESInstanceResponse restartUESInstance(RestartUESInstanceRequest request)
            throws UCloudException {
        request.setAction("RestartUESInstance");
        return (RestartUESInstanceResponse) this.invoke(request, RestartUESInstanceResponse.class);
    }
}
