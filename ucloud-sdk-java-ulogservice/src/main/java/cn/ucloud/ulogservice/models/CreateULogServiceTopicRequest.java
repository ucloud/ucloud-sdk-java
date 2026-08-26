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
package cn.ucloud.ulogservice.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateULogServiceTopicRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 主题名称，校验规则 "^[\w]{1,64}$" */
    @NotEmpty
    @UCloudParam("TopicName")
    private String topicName;

    /** 保存时间 1~730 天 */
    @NotEmpty
    @UCloudParam("ReserveAge")
    private Integer reserveAge;

    /** 日志集ID */
    @NotEmpty
    @UCloudParam("LogSetId")
    private String logSetId;

    /** 分区数量，固定是2 */
    @NotEmpty
    @UCloudParam("TopicShardNum")
    private Integer topicShardNum;

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

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Integer getReserveAge() {
        return reserveAge;
    }

    public void setReserveAge(Integer reserveAge) {
        this.reserveAge = reserveAge;
    }

    public String getLogSetId() {
        return logSetId;
    }

    public void setLogSetId(String logSetId) {
        this.logSetId = logSetId;
    }

    public Integer getTopicShardNum() {
        return topicShardNum;
    }

    public void setTopicShardNum(Integer topicShardNum) {
        this.topicShardNum = topicShardNum;
    }
}
