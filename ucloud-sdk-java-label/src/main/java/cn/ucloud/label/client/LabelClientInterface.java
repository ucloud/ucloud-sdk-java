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
package cn.ucloud.label.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.label.models.BindLabelsRequest;
import cn.ucloud.label.models.BindLabelsResponse;
import cn.ucloud.label.models.CreateLabelsRequest;
import cn.ucloud.label.models.CreateLabelsResponse;
import cn.ucloud.label.models.DeleteLabelsRequest;
import cn.ucloud.label.models.DeleteLabelsResponse;
import cn.ucloud.label.models.ListLabelsByResourceIdsRequest;
import cn.ucloud.label.models.ListLabelsByResourceIdsResponse;
import cn.ucloud.label.models.ListLabelsRequest;
import cn.ucloud.label.models.ListLabelsResponse;
import cn.ucloud.label.models.ListProjectsByLabelsRequest;
import cn.ucloud.label.models.ListProjectsByLabelsResponse;
import cn.ucloud.label.models.ListResourcesByLabelsRequest;
import cn.ucloud.label.models.ListResourcesByLabelsResponse;
import cn.ucloud.label.models.ListResourcesTypesForLabelRequest;
import cn.ucloud.label.models.ListResourcesTypesForLabelResponse;
import cn.ucloud.label.models.UnbindLabelsRequest;
import cn.ucloud.label.models.UnbindLabelsResponse;

/** This client is used to call actions of **Label** service */
public interface LabelClientInterface extends Client {

    /**
     * BindLabels - 绑定标签
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindLabelsResponse bindLabels(BindLabelsRequest request) throws UCloudException;

    /**
     * CreateLabels - 创建标签
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateLabelsResponse createLabels(CreateLabelsRequest request) throws UCloudException;

    /**
     * DeleteLabels - 删除标签
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteLabelsResponse deleteLabels(DeleteLabelsRequest request) throws UCloudException;

    /**
     * ListLabels - 标签列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListLabelsResponse listLabels(ListLabelsRequest request) throws UCloudException;

    /**
     * ListLabelsByResourceIds - 根据资源ID获取标签列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListLabelsByResourceIdsResponse listLabelsByResourceIds(
            ListLabelsByResourceIdsRequest request) throws UCloudException;

    /**
     * ListProjectsByLabels - 根据标签获取项目列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListProjectsByLabelsResponse listProjectsByLabels(ListProjectsByLabelsRequest request)
            throws UCloudException;

    /**
     * ListResourcesByLabels - 根据标签获取资源列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListResourcesByLabelsResponse listResourcesByLabels(ListResourcesByLabelsRequest request)
            throws UCloudException;

    /**
     * ListResourcesTypesForLabel - 获取支持标签的资源类型
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListResourcesTypesForLabelResponse listResourcesTypesForLabel(
            ListResourcesTypesForLabelRequest request) throws UCloudException;

    /**
     * UnbindLabels - 解绑标签
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UnbindLabelsResponse unbindLabels(UnbindLabelsRequest request) throws UCloudException;
}
