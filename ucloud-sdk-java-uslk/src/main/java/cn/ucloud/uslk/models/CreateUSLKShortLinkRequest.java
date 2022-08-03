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

public class CreateUSLKShortLinkRequest extends Request {

    /** 长链接ID，状态必须为审核通过 */
    @NotEmpty
    @UCloudParam("LongLinkID")
    private Integer longLinkID;

    /** 开始生效时间戳, 传 3376656000 表示生成永久生效短链接 */
    @NotEmpty
    @UCloudParam("StartTime")
    private Integer startTime;

    /** 过期时间戳，传 3376656000 表示生成永久生效短链接 */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 链接类型-预留：普通跳转、随机跳转，当前默认普通跳转 1: 普通跳转 */
    @NotEmpty
    @UCloudParam("Type")
    private Integer type;

    /** 协议名称：http/https */
    @NotEmpty
    @UCloudParam("Proto")
    private String proto;

    /** 短链接域名，默认：uslk.net */
    @UCloudParam("ShortLinkDomain")
    private String shortLinkDomain;

    public Integer getLongLinkID() {
        return longLinkID;
    }

    public void setLongLinkID(Integer longLinkID) {
        this.longLinkID = longLinkID;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
