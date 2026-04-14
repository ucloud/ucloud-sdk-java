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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class DownloadTeamOrderRequest extends Request {

    /** 团队ID */
    @NotEmpty
    @UCloudParam("TeamId")
    private Integer teamId;

    /** 团队虚拟账号ID */
    @UCloudParam("VirtualCompanyId")
    private Integer virtualCompanyId;

    /** 起始时间，需使用时间戳 */
    @UCloudParam("BeginTime")
    private Integer beginTime;

    /** 结束时间，需使用时间戳，结束时间需大于起始时间 */
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 订单状态 */
    @UCloudParam("OrderStates")
    private List<String> orderStates;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getVirtualCompanyId() {
        return virtualCompanyId;
    }

    public void setVirtualCompanyId(Integer virtualCompanyId) {
        this.virtualCompanyId = virtualCompanyId;
    }

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public List<String> getOrderStates() {
        return orderStates;
    }

    public void setOrderStates(List<String> orderStates) {
        this.orderStates = orderStates;
    }
}
