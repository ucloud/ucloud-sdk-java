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
package cn.ucloud.uslk.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class BatchCreateUSLKShortLinkRequest extends Request {

    /** 场景ID */
    @NotEmpty
    @UCloudParam("ScenarioID")
    private Integer scenarioID;

    /** 长链接数组，示例: "LongLinks.0": "http://ucloud.cn/0", "LongLinks.1": "http://ucloud.cn/1" */
    @NotEmpty
    @UCloudParam("LongLinks")
    private List<String> longLinks;

    /** 开始生效时间戳（秒级）, 传 3376656000 表示生成永久生效短链接 */
    @NotEmpty
    @UCloudParam("StartTime")
    private Integer startTime;

    /** 过期时间戳（秒级），传 3376656000 表示生成永久生效短链接 */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 协议名称：http/https */
    @NotEmpty
    @UCloudParam("Proto")
    private String proto;

    /** 短链接域名 */
    @NotEmpty
    @UCloudParam("ShortLinkDomain")
    private String shortLinkDomain;

    public Integer getScenarioID() {
        return scenarioID;
    }

    public void setScenarioID(Integer scenarioID) {
        this.scenarioID = scenarioID;
    }

    public List<String> getLongLinks() {
        return longLinks;
    }

    public void setLongLinks(List<String> longLinks) {
        this.longLinks = longLinks;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getProto() {
        return proto;
    }

    public void setProto(String proto) {
        this.proto = proto;
    }

    public String getShortLinkDomain() {
        return shortLinkDomain;
    }

    public void setShortLinkDomain(String shortLinkDomain) {
        this.shortLinkDomain = shortLinkDomain;
    }
}
