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
package cn.ucloud.uphone.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class SwitchUPhoneInstanceRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /**
     * 城市Id，通过[获取城市列表](https://cms-docs.ucloudadmin.com/api/uphone-api/describe_u_phone_cities)获取
     */
    @NotEmpty
    @UCloudParam("CityId")
    private String cityId;

    /** */
    @UCloudParam("SwitchInfos")
    private List<SwitchInfos> switchInfos;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public List<SwitchInfos> getSwitchInfos() {
        return switchInfos;
    }

    public void setSwitchInfos(List<SwitchInfos> switchInfos) {
        this.switchInfos = switchInfos;
    }

    public static class SwitchInfos extends Request {

        /** 【数组】云手机实例的资源 ID，N<200 */
        @NotEmpty
        @UCloudParam("UPhoneId")
        private String uPhoneId;

        /** 【数组】云手机实例的镜像ID，N<200，该值为空时，默认使用云手机之前的镜像ID，如果镜像ID已经不存在了则会返回错误 */
        @UCloudParam("ImageId")
        private String imageId;

        public String getUPhoneId() {
            return uPhoneId;
        }

        public void setUPhoneId(String uPhoneId) {
            this.uPhoneId = uPhoneId;
        }

        public String getImageId() {
            return imageId;
        }

        public void setImageId(String imageId) {
            this.imageId = imageId;
        }
    }
}
