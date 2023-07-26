/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
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
        
        
        
import cn.ucloud.cube.models.GetCubeTokenRequest;
import cn.ucloud.cube.models.GetCubeTokenResponse;
        
        
        
import cn.ucloud.cube.models.ListCubePodRequest;
import cn.ucloud.cube.models.ListCubePodResponse;
        
        
        
import cn.ucloud.cube.models.RenewCubePodRequest;
import cn.ucloud.cube.models.RenewCubePodResponse;

/**
 * This client is used to call actions of **Cube** service
 */
public interface CubeClientInterface extends Client {
        
        
        
        
        
        
    /**
     * CreateCubeDeployment - 创建容器实例Deployment
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCubeDeploymentResponse createCubeDeployment(CreateCubeDeploymentRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateCubePod - 创建容器实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCubePodResponse createCubePod(CreateCubePodRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteCubeDeployment - 删除容器实例Deployment
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCubeDeploymentResponse deleteCubeDeployment(DeleteCubeDeploymentRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DeleteCubePod - 删除容器实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteCubePodResponse deleteCubePod(DeleteCubePodRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetCubeDeployment - 获取容器实例Deployment详细信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeDeploymentResponse getCubeDeployment(GetCubeDeploymentRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetCubeExecToken - 获取容器实例执行token
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeExecTokenResponse getCubeExecToken(GetCubeExecTokenRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetCubeExtendInfo - 获取容器实例附加信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeExtendInfoResponse getCubeExtendInfo(GetCubeExtendInfoRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetCubeMetrics - 获取容器实例指标
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeMetricsResponse getCubeMetrics(GetCubeMetricsRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * GetCubeToken - 获取容器实例Token
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetCubeTokenResponse getCubeToken(GetCubeTokenRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * ListCubePod - 获取容器实例详细列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListCubePodResponse listCubePod(ListCubePodRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * RenewCubePod - 更新容器实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RenewCubePodResponse renewCubePod(RenewCubePodRequest request) throws UCloudException;
}
