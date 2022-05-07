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

public class SetUPhoneConfigRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 城市Id，通过[获取城市列表](#DescribeUPhoneCities)获取 */
    @NotEmpty
    @UCloudParam("CityId")
    private String cityId;

    /**
     * 【数组】云手机实例的资源 ID，调用方式举例：UPhoneIds.0=希望重启的云手机实例 1 的 UPhoneId，UPhoneIds.1=云手机实例 2 的 UPhoneId。
     */
    @NotEmpty
    @UCloudParam("UPhoneIds")
    private List<String> uPhoneIds;

    /** 云手机画面分辨率（宽x高） （例，1920x1080，中间是字母x）宽和高的取值范围[100,5000] */
    @UCloudParam("Resolution")
    private String resolution;

    /** 云手机画面刷新率，即帧率（例，30）取值范围[1,200] */
    @UCloudParam("Refresh")
    private String refresh;

    /** 云手机画面传输码率（例，8000）取值范围[100,5000] */
    @UCloudParam("Bitrate")
    private String bitrate;

    /** 异步请求开关，只有为1的时候才是异步，不填或者其他数值为同步 */
    @UCloudParam("Async")
    private String async;

    /** 云手机dpi，取值范围[100,1000] */
    @UCloudParam("Dpi")
    private String dpi;

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

    public List<String> getUPhoneIds() {
        return uPhoneIds;
    }

    public void setUPhoneIds(List<String> uPhoneIds) {
        this.uPhoneIds = uPhoneIds;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    public String getBitrate() {
        return bitrate;
    }

    public void setBitrate(String bitrate) {
        this.bitrate = bitrate;
    }

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
}
