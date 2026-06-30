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
package cn.ucloud.uas.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uas.models.CompleteLifecycleActivityRequest;
import cn.ucloud.uas.models.CompleteLifecycleActivityResponse;
import cn.ucloud.uas.models.CompleteUASGLifecycleRequest;
import cn.ucloud.uas.models.CompleteUASGLifecycleResponse;

/** This client is used to call actions of **UAS** service */
public class UASClient extends DefaultClient implements UASClientInterface {
    public UASClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CompleteLifecycleActivity - 完成生命周期挂钩活动
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CompleteLifecycleActivityResponse completeLifecycleActivity(
            CompleteLifecycleActivityRequest request) throws UCloudException {
        request.setAction("CompleteLifecycleActivity");
        return (CompleteLifecycleActivityResponse)
                this.invoke(request, CompleteLifecycleActivityResponse.class);
    }

    /**
     * CompleteUASGLifecycle - 结束生命周期挂钩
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CompleteUASGLifecycleResponse completeUASGLifecycle(CompleteUASGLifecycleRequest request)
            throws UCloudException {
        request.setAction("CompleteUASGLifecycle");
        return (CompleteUASGLifecycleResponse)
                this.invoke(request, CompleteUASGLifecycleResponse.class);
    }
}
