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
package cn.ucloud.uai_modelverse.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uai_modelverse.models.GetUMInferServiceRequest;
import cn.ucloud.uai_modelverse.models.GetUMInferServiceResponse;

/** This client is used to call actions of **UAIModelverse** service */
public interface UAIModelverseClientInterface extends Client {

    /**
     * GetUMInferService - 获取模型服务
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUMInferServiceResponse getUMInferService(GetUMInferServiceRequest request)
            throws UCloudException;
}
