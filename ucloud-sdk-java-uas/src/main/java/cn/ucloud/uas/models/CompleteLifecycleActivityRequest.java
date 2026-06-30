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
package cn.ucloud.uas.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CompleteLifecycleActivityRequest extends Request {

    /** 地域。参见地域和可用区列表 */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 生命周期挂钩 Id */
    @NotEmpty
    @UCloudParam("LifecycleHookId")
    private String lifecycleHookId;

    /** 生命周期挂钩活动 Id */
    @NotEmpty
    @UCloudParam("LifecycleActivityId")
    private String lifecycleActivityId;

    /** 实例挂起状态结束后执行的策略，如不填则表示遵循所属生命周期挂钩的策略。取值：CONTINUE：继续执行；ABANDON：中止后续操作 */
    @UCloudParam("LifecycleHookPolicy")
    private String lifecycleHookPolicy;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLifecycleHookId() {
        return lifecycleHookId;
    }

    public void setLifecycleHookId(String lifecycleHookId) {
        this.lifecycleHookId = lifecycleHookId;
    }

    public String getLifecycleActivityId() {
        return lifecycleActivityId;
    }

    public void setLifecycleActivityId(String lifecycleActivityId) {
        this.lifecycleActivityId = lifecycleActivityId;
    }

    public String getLifecycleHookPolicy() {
        return lifecycleHookPolicy;
    }

    public void setLifecycleHookPolicy(String lifecycleHookPolicy) {
        this.lifecycleHookPolicy = lifecycleHookPolicy;
    }
}
