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
package cn.ucloud.uaimodelverse.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uaimodelverse.models.CreateMVAppRequest;
import cn.ucloud.uaimodelverse.models.CreateMVAppResponse;
import cn.ucloud.uaimodelverse.models.DeleteMVAppRequest;
import cn.ucloud.uaimodelverse.models.DeleteMVAppResponse;
import cn.ucloud.uaimodelverse.models.QueryMVAppRequest;
import cn.ucloud.uaimodelverse.models.QueryMVAppResponse;
import cn.ucloud.uaimodelverse.models.QueryMVLLMListRequest;
import cn.ucloud.uaimodelverse.models.QueryMVLLMListResponse;
import cn.ucloud.uaimodelverse.models.RunMVChatRequest;
import cn.ucloud.uaimodelverse.models.RunMVChatResponse;
import cn.ucloud.uaimodelverse.models.UpdateMVAppRequest;
import cn.ucloud.uaimodelverse.models.UpdateMVAppResponse;

/** This client is used to call actions of **UAIModelverse** service */
public interface UAIModelverseClientInterface extends Client {

    /**
     * CreateMVApp - 创建应用
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateMVAppResponse createMVApp(CreateMVAppRequest request) throws UCloudException;

    /**
     * DeleteMVApp - 删除应用
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteMVAppResponse deleteMVApp(DeleteMVAppRequest request) throws UCloudException;

    /**
     * QueryMVApp - 查询应用信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryMVAppResponse queryMVApp(QueryMVAppRequest request) throws UCloudException;

    /**
     * QueryMVLLMList - 查询语言模型信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryMVLLMListResponse queryMVLLMList(QueryMVLLMListRequest request)
            throws UCloudException;

    /**
     * RunMVChat - 聊天
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RunMVChatResponse runMVChat(RunMVChatRequest request) throws UCloudException;

    /**
     * UpdateMVApp - 更新应用
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateMVAppResponse updateMVApp(UpdateMVAppRequest request) throws UCloudException;
}
