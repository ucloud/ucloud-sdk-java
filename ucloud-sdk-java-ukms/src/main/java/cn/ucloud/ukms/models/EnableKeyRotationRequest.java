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
package cn.ucloud.ukms.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class EnableKeyRotationRequest extends Request {

    /** 地域。参见地域和可用区列表。 */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子账号必须填写。 */
    @UCloudParam("ProjectId")
    private String projectId;

    /** UKMS 实例资源 ID。 */
    @NotEmpty
    @UCloudParam("ResourceId")
    private String resourceId;

    /** 密钥 ID、ARN 或别名。 */
    @NotEmpty
    @UCloudParam("KeyId")
    private String keyId;

    /** 轮转周期，单位天。取值范围 1~2560，默认 365。仅 SYMMETRIC_DEFAULT 且 Origin=UCLOUD_KMS 的密钥支持轮转。 */
    @UCloudParam("RotationPeriodInDays")
    private Integer rotationPeriodInDays;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public Integer getRotationPeriodInDays() {
        return rotationPeriodInDays;
    }

    public void setRotationPeriodInDays(Integer rotationPeriodInDays) {
        this.rotationPeriodInDays = rotationPeriodInDays;
    }
}
