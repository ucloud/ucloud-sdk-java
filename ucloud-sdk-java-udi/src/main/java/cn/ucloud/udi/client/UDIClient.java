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
package cn.ucloud.udi.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.udi.models.CreateFunctionTemplateRequest;
import cn.ucloud.udi.models.CreateFunctionTemplateResponse;
import cn.ucloud.udi.models.CreateMediaTaskRequest;
import cn.ucloud.udi.models.CreateMediaTaskResponse;
import cn.ucloud.udi.models.DeleteFunctionTemplateRequest;
import cn.ucloud.udi.models.DeleteFunctionTemplateResponse;
import cn.ucloud.udi.models.DescribeFunctionTemplateRequest;
import cn.ucloud.udi.models.DescribeFunctionTemplateResponse;
import cn.ucloud.udi.models.DescribeMediaFunctionsRequest;
import cn.ucloud.udi.models.DescribeMediaFunctionsResponse;
import cn.ucloud.udi.models.DescribeMediaTaskRequest;
import cn.ucloud.udi.models.DescribeMediaTaskResponse;

/** This client is used to call actions of **UDI** service */
public class UDIClient extends DefaultClient implements UDIClientInterface {
    public UDIClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateFunctionTemplate - 创建功能模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateFunctionTemplateResponse createFunctionTemplate(
            CreateFunctionTemplateRequest request) throws UCloudException {
        request.setAction("CreateFunctionTemplate");
        return (CreateFunctionTemplateResponse)
                this.invoke(request, CreateFunctionTemplateResponse.class);
    }

    /**
     * CreateMediaTask - 创建媒体任务
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateMediaTaskResponse createMediaTask(CreateMediaTaskRequest request)
            throws UCloudException {
        request.setAction("CreateMediaTask");
        return (CreateMediaTaskResponse) this.invoke(request, CreateMediaTaskResponse.class);
    }

    /**
     * DeleteFunctionTemplate - 删除功能模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteFunctionTemplateResponse deleteFunctionTemplate(
            DeleteFunctionTemplateRequest request) throws UCloudException {
        request.setAction("DeleteFunctionTemplate");
        return (DeleteFunctionTemplateResponse)
                this.invoke(request, DeleteFunctionTemplateResponse.class);
    }

    /**
     * DescribeFunctionTemplate - 获取功能模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeFunctionTemplateResponse describeFunctionTemplate(
            DescribeFunctionTemplateRequest request) throws UCloudException {
        request.setAction("DescribeFunctionTemplate");
        return (DescribeFunctionTemplateResponse)
                this.invoke(request, DescribeFunctionTemplateResponse.class);
    }

    /**
     * DescribeMediaFunctions - 获取多媒体功能
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeMediaFunctionsResponse describeMediaFunctions(
            DescribeMediaFunctionsRequest request) throws UCloudException {
        request.setAction("DescribeMediaFunctions");
        return (DescribeMediaFunctionsResponse)
                this.invoke(request, DescribeMediaFunctionsResponse.class);
    }

    /**
     * DescribeMediaTask - 描述媒体任务
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeMediaTaskResponse describeMediaTask(DescribeMediaTaskRequest request)
            throws UCloudException {
        request.setAction("DescribeMediaTask");
        return (DescribeMediaTaskResponse) this.invoke(request, DescribeMediaTaskResponse.class);
    }
}
