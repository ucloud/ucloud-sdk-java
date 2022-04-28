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

import cn.ucloud.common.client.Client;
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
public interface CubeClientInterface extends Client {

    /**
     * CreateCubeDeployment - 创建Cube的Deployment
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCubeDeploymentResponse createCubeDeployment(CreateCubeDeploymentRequest request)
            throws UCloudException;

    /**
     * CreateCubePod - 创建Pod
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCubePodResponse createCubePod(CreateCubePodRequest request) throws UCloudException;

    /**
     * DeleteCubeDeployment - 删除Cube的Deployment
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCubeDeploymentResponse deleteCubeDeployment(DeleteCubeDeploymentRequest request)
            throws UCloudException;

    /**
     * DeleteCubePod - 删除Pod
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCubePodResponse deleteCubePod(DeleteCubePodRequest request) throws UCloudException;

    /**
     * GetCubeDeployment - 获取Deployment的详细信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeDeploymentResponse getCubeDeployment(GetCubeDeploymentRequest request)
            throws UCloudException;

    /**
     * GetCubeExecToken - 获取登录容器的token
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeExecTokenResponse getCubeExecToken(GetCubeExecTokenRequest request)
            throws UCloudException;

    /**
     * GetCubeExtendInfo - 获取Cube的额外信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeExtendInfoResponse getCubeExtendInfo(GetCubeExtendInfoRequest request)
            throws UCloudException;

    /**
     * GetCubeMetrics - 获取Cube实例监控数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeMetricsResponse getCubeMetrics(GetCubeMetricsRequest request)
            throws UCloudException;

    /**
     * GetCubePod - 获取Pod的详细信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubePodResponse getCubePod(GetCubePodRequest request) throws UCloudException;

    /**
     * GetCubePrice - 获取cube的价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubePriceResponse getCubePrice(GetCubePriceRequest request) throws UCloudException;

    /**
     * GetCubeToken - 获取Cube的token
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeTokenResponse getCubeToken(GetCubeTokenRequest request) throws UCloudException;

    /**
     * ListCubeDeployment - 获取Cube的Deployment列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListCubeDeploymentResponse listCubeDeployment(ListCubeDeploymentRequest request)
            throws UCloudException;

    /**
     * ListCubePod - 获取Pods列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListCubePodResponse listCubePod(ListCubePodRequest request) throws UCloudException;

    /**
     * ModifyCubeExtendInfo - 修改Cube额外信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyCubeExtendInfoResponse modifyCubeExtendInfo(ModifyCubeExtendInfoRequest request)
            throws UCloudException;

    /**
     * ModifyCubeTag - 修改业务组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyCubeTagResponse modifyCubeTag(ModifyCubeTagRequest request) throws UCloudException;

    /**
     * RebootCubePod - 重启Cube Pod
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RebootCubePodResponse rebootCubePod(RebootCubePodRequest request) throws UCloudException;

    /**
     * RenewCubePod - 更新Pod
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RenewCubePodResponse renewCubePod(RenewCubePodRequest request) throws UCloudException;

    /**
     * UpdateCubeDeployment - 更新Deployment
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateCubeDeploymentResponse updateCubeDeployment(UpdateCubeDeploymentRequest request)
            throws UCloudException;
}
