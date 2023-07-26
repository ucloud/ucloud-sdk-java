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
package cn.ucloud.uaccount.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uaccount.models.AddMemberToProjectRequest;
import cn.ucloud.uaccount.models.AddMemberToProjectResponse;
import cn.ucloud.uaccount.models.FreezeMemberRequest;
import cn.ucloud.uaccount.models.FreezeMemberResponse;
import cn.ucloud.uaccount.models.GetNetworkMaskRequest;
import cn.ucloud.uaccount.models.GetNetworkMaskResponse;
import cn.ucloud.uaccount.models.GetProjectListRequest;
import cn.ucloud.uaccount.models.GetProjectListResponse;
import cn.ucloud.uaccount.models.GetRegionRequest;
import cn.ucloud.uaccount.models.GetRegionResponse;
import cn.ucloud.uaccount.models.RemoveMemberFromProjectRequest;
import cn.ucloud.uaccount.models.RemoveMemberFromProjectResponse;
import cn.ucloud.uaccount.models.SetNetworkMaskRequest;
import cn.ucloud.uaccount.models.SetNetworkMaskResponse;

/** This client is used to call actions of **UAccount** service */
public interface UAccountClientInterface extends Client {

    /**
     * AddMemberToProject - 添加成员到项目
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddMemberToProjectResponse addMemberToProject(AddMemberToProjectRequest request)
            throws UCloudException;

    /**
     * FreezeMember - 冻结成员
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public FreezeMemberResponse freezeMember(FreezeMemberRequest request) throws UCloudException;

    /**
     * GetNetworkMask - 查询登录与API调用的网络掩码
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetNetworkMaskResponse getNetworkMask(GetNetworkMaskRequest request)
            throws UCloudException;

    /**
     * GetProjectList - 获取帐号下的项目列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetProjectListResponse getProjectList(GetProjectListRequest request)
            throws UCloudException;

    /**
     * GetRegion - 获取地域和可用区列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetRegionResponse getRegion(GetRegionRequest request) throws UCloudException;

    /**
     * RemoveMemberFromProject - 从项目中移除成员
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RemoveMemberFromProjectResponse removeMemberFromProject(
            RemoveMemberFromProjectRequest request) throws UCloudException;

    /**
     * SetNetworkMask - 设置登录与API调用的网络掩码
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SetNetworkMaskResponse setNetworkMask(SetNetworkMaskRequest request)
            throws UCloudException;
}
