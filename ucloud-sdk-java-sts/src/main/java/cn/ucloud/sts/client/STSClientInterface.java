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
package cn.ucloud.sts.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.sts.models.AssumeRoleRequest;
import cn.ucloud.sts.models.AssumeRoleResponse;

/** This client is used to call actions of **STS** service */
public interface STSClientInterface extends Client {

    /**
     * AssumeRole - 获取扮演角色的临时身份凭证
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AssumeRoleResponse assumeRole(AssumeRoleRequest request) throws UCloudException;
}
