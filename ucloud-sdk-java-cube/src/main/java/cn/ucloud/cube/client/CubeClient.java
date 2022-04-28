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
package cn.ucloud.cube.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.cube.models.CreateCubeDeploymentRequest;
import cn.ucloud.cube.models.CreateCubeDeploymentResponse;
import cn.ucloud.cube.models.CreateCubePodRequest;
import cn.ucloud.cube.models.CreateCubePodResponse;
import cn.ucloud.cube.models.DeleteCubeDeploymentRequest;
import cn.ucloud.cube.models.DeleteCubeDeploymentResponse;
import cn.ucloud.cube.models.DeleteCubePodRequest;
import cn.ucloud.cube.models.DeleteCubePodResponse;
import cn.ucloud.cube.models.GetCubeDeploymentRequest;
import cn.ucloud.cube.models.GetCubeDeploymentResponse;
import cn.ucloud.cube.models.GetCubeExecTokenRequest;
import cn.ucloud.cube.models.GetCubeExecTokenResponse;
import cn.ucloud.cube.models.GetCubeExtendInfoRequest;
import cn.ucloud.cube.models.GetCubeExtendInfoResponse;
import cn.ucloud.cube.models.GetCubeMetricsRequest;
import cn.ucloud.cube.models.GetCubeMetricsResponse;
import cn.ucloud.cube.models.GetCubePodRequest;
import cn.ucloud.cube.models.GetCubePodResponse;
import cn.ucloud.cube.models.GetCubePriceRequest;
import cn.ucloud.cube.models.GetCubePriceResponse;
import cn.ucloud.cube.models.GetCubeTokenRequest;
import cn.ucloud.cube.models.GetCubeTokenResponse;
import cn.ucloud.cube.models.ListCubeDeploymentRequest;
import cn.ucloud.cube.models.ListCubeDeploymentResponse;
import cn.ucloud.cube.models.ListCubePodRequest;
import cn.ucloud.cube.models.ListCubePodResponse;
import cn.ucloud.cube.models.ModifyCubeExtendInfoRequest;
import cn.ucloud.cube.models.ModifyCubeExtendInfoResponse;
import cn.ucloud.cube.models.ModifyCubeTagRequest;
import cn.ucloud.cube.models.ModifyCubeTagResponse;
import cn.ucloud.cube.models.RebootCubePodRequest;
import cn.ucloud.cube.models.RebootCubePodResponse;
import cn.ucloud.cube.models.RenewCubePodRequest;
import cn.ucloud.cube.models.RenewCubePodResponse;
import cn.ucloud.cube.models.UpdateCubeDeploymentRequest;
import cn.ucloud.cube.models.UpdateCubeDeploymentResponse;

/** This client is used to call actions of **Cube** service */
public class CubeClient extends DefaultClient implements CubeClientInterface {
    public CubeClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateCubeDeployment - 创建Cube的Deployment
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCubeDeploymentResponse createCubeDeployment(CreateCubeDeploymentRequest request)
            throws UCloudException {
        request.setAction("CreateCubeDeployment");
        return (CreateCubeDeploymentResponse)
                this.invoke(request, CreateCubeDeploymentResponse.class);
    }

    /**
     * CreateCubePod - 创建Pod
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCubePodResponse createCubePod(CreateCubePodRequest request)
            throws UCloudException {
        request.setAction("CreateCubePod");
        return (CreateCubePodResponse) this.invoke(request, CreateCubePodResponse.class);
    }

    /**
     * DeleteCubeDeployment - 删除Cube的Deployment
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCubeDeploymentResponse deleteCubeDeployment(DeleteCubeDeploymentRequest request)
            throws UCloudException {
        request.setAction("DeleteCubeDeployment");
        return (DeleteCubeDeploymentResponse)
                this.invoke(request, DeleteCubeDeploymentResponse.class);
    }

    /**
     * DeleteCubePod - 删除Pod
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCubePodResponse deleteCubePod(DeleteCubePodRequest request)
            throws UCloudException {
        request.setAction("DeleteCubePod");
        return (DeleteCubePodResponse) this.invoke(request, DeleteCubePodResponse.class);
    }

    /**
     * GetCubeDeployment - 获取Deployment的详细信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeDeploymentResponse getCubeDeployment(GetCubeDeploymentRequest request)
            throws UCloudException {
        request.setAction("GetCubeDeployment");
        return (GetCubeDeploymentResponse) this.invoke(request, GetCubeDeploymentResponse.class);
    }

    /**
     * GetCubeExecToken - 获取登录容器的token
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeExecTokenResponse getCubeExecToken(GetCubeExecTokenRequest request)
            throws UCloudException {
        request.setAction("GetCubeExecToken");
        return (GetCubeExecTokenResponse) this.invoke(request, GetCubeExecTokenResponse.class);
    }

    /**
     * GetCubeExtendInfo - 获取Cube的额外信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeExtendInfoResponse getCubeExtendInfo(GetCubeExtendInfoRequest request)
            throws UCloudException {
        request.setAction("GetCubeExtendInfo");
        return (GetCubeExtendInfoResponse) this.invoke(request, GetCubeExtendInfoResponse.class);
    }

    /**
     * GetCubeMetrics - 获取Cube实例监控数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeMetricsResponse getCubeMetrics(GetCubeMetricsRequest request)
            throws UCloudException {
        request.setAction("GetCubeMetrics");
        return (GetCubeMetricsResponse) this.invoke(request, GetCubeMetricsResponse.class);
    }

    /**
     * GetCubePod - 获取Pod的详细信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubePodResponse getCubePod(GetCubePodRequest request) throws UCloudException {
        request.setAction("GetCubePod");
        return (GetCubePodResponse) this.invoke(request, GetCubePodResponse.class);
    }

    /**
     * GetCubePrice - 获取cube的价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubePriceResponse getCubePrice(GetCubePriceRequest request) throws UCloudException {
        request.setAction("GetCubePrice");
        return (GetCubePriceResponse) this.invoke(request, GetCubePriceResponse.class);
    }

    /**
     * GetCubeToken - 获取Cube的token
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeTokenResponse getCubeToken(GetCubeTokenRequest request) throws UCloudException {
        request.setAction("GetCubeToken");
        return (GetCubeTokenResponse) this.invoke(request, GetCubeTokenResponse.class);
    }

    /**
     * ListCubeDeployment - 获取Cube的Deployment列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListCubeDeploymentResponse listCubeDeployment(ListCubeDeploymentRequest request)
            throws UCloudException {
        request.setAction("ListCubeDeployment");
        return (ListCubeDeploymentResponse) this.invoke(request, ListCubeDeploymentResponse.class);
    }

    /**
     * ListCubePod - 获取Pods列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListCubePodResponse listCubePod(ListCubePodRequest request) throws UCloudException {
        request.setAction("ListCubePod");
        return (ListCubePodResponse) this.invoke(request, ListCubePodResponse.class);
    }

    /**
     * ModifyCubeExtendInfo - 修改Cube额外信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyCubeExtendInfoResponse modifyCubeExtendInfo(ModifyCubeExtendInfoRequest request)
            throws UCloudException {
        request.setAction("ModifyCubeExtendInfo");
        return (ModifyCubeExtendInfoResponse)
                this.invoke(request, ModifyCubeExtendInfoResponse.class);
    }

    /**
     * ModifyCubeTag - 修改业务组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyCubeTagResponse modifyCubeTag(ModifyCubeTagRequest request)
            throws UCloudException {
        request.setAction("ModifyCubeTag");
        return (ModifyCubeTagResponse) this.invoke(request, ModifyCubeTagResponse.class);
    }

    /**
     * RebootCubePod - 重启Cube Pod
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RebootCubePodResponse rebootCubePod(RebootCubePodRequest request)
            throws UCloudException {
        request.setAction("RebootCubePod");
        return (RebootCubePodResponse) this.invoke(request, RebootCubePodResponse.class);
    }

    /**
     * RenewCubePod - 更新Pod
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RenewCubePodResponse renewCubePod(RenewCubePodRequest request) throws UCloudException {
        request.setAction("RenewCubePod");
        return (RenewCubePodResponse) this.invoke(request, RenewCubePodResponse.class);
    }

    /**
     * UpdateCubeDeployment - 更新Deployment
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCubeDeploymentResponse updateCubeDeployment(UpdateCubeDeploymentRequest request)
            throws UCloudException {
        request.setAction("UpdateCubeDeployment");
        return (UpdateCubeDeploymentResponse)
                this.invoke(request, UpdateCubeDeploymentResponse.class);
    }
}
